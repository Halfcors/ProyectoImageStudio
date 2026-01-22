package com.uisrael.ProyectoImageStudio.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Cliente;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.ClienteResponseDto;


@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {

	Cliente toDomain(ClienteRequestDto dto); //de DTO a entidad de dominio 
	ClienteResponseDto toResponseDto(Cliente cliente); //de entidad a DTO
}
