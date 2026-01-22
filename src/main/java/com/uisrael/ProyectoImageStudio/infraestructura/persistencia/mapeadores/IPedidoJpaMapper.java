package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.PedidoJpa;


@Mapper(componentModel = "spring")
public interface IPedidoJpaMapper {

	Pedido toDomain(PedidoJpa entity);
	PedidoJpa toEntity(Pedido pedido);
}
