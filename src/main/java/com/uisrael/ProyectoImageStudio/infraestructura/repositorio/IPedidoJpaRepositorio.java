package com.uisrael.ProyectoImageStudio.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.PedidoJpa;

public interface IPedidoJpaRepositorio extends JpaRepository<PedidoJpa, Integer>{

}
