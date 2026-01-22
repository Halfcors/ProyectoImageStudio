package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IPedidoRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.PedidoJpa;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IPedidoJpaRepositorio;

public class PedidoRepositorioImpl implements IPedidoRepositorio{
	
	private final IPedidoJpaRepositorio jpaRepositorio;
	private final IPedidoJpaMapper entityMapper;
	
	//Constructor
	public PedidoRepositorioImpl(IPedidoJpaRepositorio jpaRepositorio, IPedidoJpaMapper entityMapper) {
		
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	//Metodo
	@Override
	public Pedido guardar(Pedido pedido) {
		PedidoJpa entity = entityMapper.toEntity(pedido);
		PedidoJpa guardado = jpaRepositorio.save(entity);//insertar
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Pedido> buscarPorId(int id) {
		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Pedido> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper:: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);
		
	}

	
}
