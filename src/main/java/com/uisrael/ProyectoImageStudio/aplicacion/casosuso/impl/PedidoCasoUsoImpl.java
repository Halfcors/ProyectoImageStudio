package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IPedidoCasoUso;
import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IPedidoRepositorio;

public class PedidoCasoUsoImpl implements IPedidoCasoUso{

	
	private final IPedidoRepositorio repositorio;
	
	//Constructor	
	public PedidoCasoUsoImpl(IPedidoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	//metodos
	@Override
	public Pedido crear(Pedido pedido) {
		return repositorio.guardar(pedido);
	}

	@Override
	public Pedido obtenerPoId(int id) {
		return repositorio.buscarPorId(id)
				.orElseThrow(() -> 
				new RuntimeException("Tipo Cliente no encontrado"));
	}

	@Override
	public List<Pedido> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
