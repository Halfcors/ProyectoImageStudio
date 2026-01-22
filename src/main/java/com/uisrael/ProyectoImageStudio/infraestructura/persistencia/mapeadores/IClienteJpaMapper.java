package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Cliente;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.ClienteJpa;


@Mapper(componentModel = "spring")
public interface IClienteJpaMapper {

	Cliente toDomain(ClienteJpa entity);
	ClienteJpa toEntity(Cliente cliente);
}
