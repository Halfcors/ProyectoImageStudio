package com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;

public interface IUsuarioCasoUso {


	Usuario crear(Usuario usuario);
	Usuario obtenerPoId(int id);
	List<Usuario> listar();
	void eliminar(int id);
}
