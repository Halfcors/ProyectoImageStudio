package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Cliente;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IClienteRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.ClienteJpa;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IClienteJpaRepositorio;

public class ClienteRepositorioImpl implements IClienteRepositorio{
	
	private final IClienteJpaRepositorio jpaRepositorio;
	private final IClienteJpaMapper entityMapper;
	
	
	//Constructor
	public ClienteRepositorioImpl(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	//metodos
	@Override
	public Cliente guardar(Cliente cliente) {
		ClienteJpa entity = entityMapper.toEntity(cliente); 
		ClienteJpa guardado = jpaRepositorio.save(entity);//insertar
		return entityMapper.toDomain(guardado);
	}


	@Override
	public Optional<Cliente> buscarPorId(int id) {
		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}


	@Override
	public List<Cliente> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper:: toDomain).toList();
	}


	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);
		
	}



}
