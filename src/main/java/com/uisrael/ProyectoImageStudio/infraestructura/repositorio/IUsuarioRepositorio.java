package com.uisrael.ProyectoImageStudio.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.UsuarioJpa;


public interface IUsuarioRepositorio extends JpaRepository<UsuarioJpa, Integer>{

}
