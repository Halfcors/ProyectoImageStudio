package com.uisrael.ProyectoImageStudio.presentacion.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PedidoRequestDto {

	@NotBlank
    private final String tipo;
    @NotBlank
    private final int cantidad;
    @NotBlank
    private final boolean estado;
    @NotBlank
    private final LocalDate fechaEntrega;
}
