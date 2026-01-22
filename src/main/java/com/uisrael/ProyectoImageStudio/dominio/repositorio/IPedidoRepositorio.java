package com.uisrael.ProyectoImageStudio.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;


public interface IPedidoRepositorio {
	
	Pedido guardar(Pedido pedido);
	Optional<Pedido> buscarPorId(int id);
	List<Pedido> listarTodos();
	
	void eliminar (int id);
}
