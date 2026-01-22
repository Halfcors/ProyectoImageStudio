package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;


public interface IPedidoCasoUso {

	Pedido crear(Pedido pedido);
	Pedido obtenerPoId(int id);
	List<Pedido> listar();
	void eliminar(int id);
}
