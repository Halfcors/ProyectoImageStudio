package com.uisrael.ProyectoImageStudio.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Pedido;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.PedidoRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.PedidoResponseDto;

@Mapper(componentModel = "spring")
public interface IPedidoDtoMapper {
	
	Pedido toDomain(PedidoRequestDto dto); //de DTO a entidad de dominio 
	PedidoResponseDto toResponseDto(Pedido pedido); //de entidad a DTO

}
