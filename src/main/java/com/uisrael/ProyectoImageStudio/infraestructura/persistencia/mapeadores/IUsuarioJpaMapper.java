package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.ProyectoImageStudio.dominio.entidades.Usuario;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa.UsuarioJpa;



@Mapper(componentModel = "spring")
public interface IUsuarioJpaMapper {

	Usuario toDomain(UsuarioJpa entity);
	UsuarioJpa toEntity(Usuario usuario);
}
