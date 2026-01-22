package com.uisrael.ProyectoImageStudio.dominio.repositorio;

import java.util.List;
import java.util.Optional;
import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {
	
	Usuario guardar(Usuario usuario);
	Optional<Usuario> buscarPorId(int id);
	List<Usuario> listarTodos();
	
	void eliminar (int id);
}
