package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IUsuarioCasoUso;
import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IUsuarioRepositorio;

public class UsuarioCasoUsoImpl implements IUsuarioCasoUso{

	private final IUsuarioRepositorio repositorio;
	
	//Constructor
	public UsuarioCasoUsoImpl(IUsuarioRepositorio repositorio) {
		this.repositorio = repositorio;
	}
	
	//Metodo
	@Override
	public Usuario crear(Usuario usuario) {
		return repositorio.guardar(usuario);
	}


	@Override
	public Usuario obtenerPoId(int id) {
		return repositorio.buscarPorId(id)
				.orElseThrow(() -> 
				new RuntimeException("Tipo Cliente no encontrado"));
	}

	@Override
	public List<Usuario> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
