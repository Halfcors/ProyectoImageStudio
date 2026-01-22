package com.uisrael.ProyectoImageStudio.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.ClienteJpa;

public interface IClienteJpaRepositorio extends JpaRepository<ClienteJpa, Integer> {

}
