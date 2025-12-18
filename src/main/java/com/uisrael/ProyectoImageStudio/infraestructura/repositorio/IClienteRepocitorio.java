package com.uisrael.ProyectoImageStudio.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.ClienteJpa;

public interface IClienteRepocitorio extends JpaRepository<ClienteJpa, Integer> {

}
