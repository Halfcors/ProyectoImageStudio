package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.ProyectoImageStudio.dominio.entidades.Cliente;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IClienteRepositorio;

public class ClienteCasoUsoImpl implements IClienteCasoUso{

	private final IClienteRepositorio repositorio;
	
	
	//Constructor
	public ClienteCasoUsoImpl(IClienteRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	//Metodos
	@Override
	public Cliente crear(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.guardar(cliente);
	}

	@Override
	public Cliente obtenerPorId(int id) {
		return repositorio.buscarPorId(id)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Cliente> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
