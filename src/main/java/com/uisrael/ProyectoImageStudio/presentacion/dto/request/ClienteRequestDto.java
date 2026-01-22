package com.uisrael.ProyectoImageStudio.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequestDto {
	
	@NotBlank
	private final String nombre; 
	@NotBlank
	private final String correo;
	@NotBlank
	private final String telefono;
	@NotBlank
	private final String observaciones;
	@NotBlank
	private final String creado_en;
}
