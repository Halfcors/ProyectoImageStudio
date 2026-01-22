package com.uisrael.ProyectoImageStudio.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IPedidoCasoUso;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.PedidoRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.PedidoResponseDto;
import com.uisrael.ProyectoImageStudio.presentacion.mapeadores.IPedidoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pedido")
public class PedidoControlador {

	//dependencias de la arquitectura 
	private final IPedidoCasoUso pedidoCasoUso; //casos de uso
	private final IPedidoDtoMapper mapper; //mapeadores
	
	//constructor
	public PedidoControlador(IPedidoCasoUso clienteCasoUso, IPedidoDtoMapper mapper) {
		this.pedidoCasoUso = clienteCasoUso;
		this.mapper = mapper;
	}
	
	
	@GetMapping
	public List<PedidoResponseDto> listar() {
		return pedidoCasoUso.listar().stream().map(mapper::toResponseDto).toList();
		
	}
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public PedidoResponseDto crear(@Valid @RequestBody PedidoRequestDto request) {
		return mapper.toResponseDto(pedidoCasoUso.crear(mapper.toDomain(request)));
		
	}
	

	
}
