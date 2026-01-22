package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Cliente;

public interface IClienteCasoUso {

	Cliente crear(Cliente cliente);
	Cliente obtenerPorId(int id);
	List<Cliente> listar();
	
	void eliminar (int id);
}
