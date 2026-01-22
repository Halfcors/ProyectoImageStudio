package com.uisrael.ProyectoImageStudio.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.UsuarioRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.UsuarioResponseDto;

@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

	Usuario toDomain(UsuarioRequestDto dto); //de DTO a entidad de dominio 
	UsuarioResponseDto toResponseDto(Usuario usuario); //de entidad a DTO
}
