package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IUsuarioRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.UsuarioJpa;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IUsuarioJpaRepositorio;

public class UsuarioRepositorioImpl implements IUsuarioRepositorio{

	
	private final IUsuarioJpaRepositorio jpaRepositorio;
	private final IUsuarioJpaMapper entityMapper;
	
	//Constructor
	

	public UsuarioRepositorioImpl(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}
	
	
	//Metodos
	@Override
	public Usuario guardar(Usuario usuario) {
		UsuarioJpa entity = entityMapper.toEntity(usuario);
		UsuarioJpa guardado = jpaRepositorio.save(entity);//insertar
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Usuario> buscarPorId(int id) {
		return jpaRepositorio.findById(id).map(entityMapper::toDomain);
	}
	@Override
	public List<Usuario> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper:: toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepositorio.deleteById(id);
		
	}

}
