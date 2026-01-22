package com.uisrael.ProyectoImageStudio.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDto {
	
	@NotBlank
    private final String username;
	@NotBlank
    private final String rol;

}
