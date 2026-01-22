package com.uisrael.ProyectoImageStudio.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.ClienteResponseDto;
import com.uisrael.ProyectoImageStudio.presentacion.mapeadores.IClienteDtoMapper;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {
	
	//dependencias de la arquitectura 
		private final IClienteCasoUso clienteCasoUso; //casos de uso
		private final IClienteDtoMapper mapper; //mapeadores
		
		//constructor
		public ClienteControlador(IClienteCasoUso clienteCasoUso, IClienteDtoMapper mapper) {
			this.clienteCasoUso = clienteCasoUso;
			this.mapper = mapper;
		}
		
		
		@GetMapping
		public List<ClienteResponseDto> listar() {
			return clienteCasoUso.listar().stream().map(mapper::toResponseDto).toList();
			
		}
		@PostMapping
		@ResponseStatus(value = HttpStatus.CREATED)
		public ClienteResponseDto crear(@Valid @RequestBody ClienteRequestDto request) {
			return mapper.toResponseDto(clienteCasoUso.crear(mapper.toDomain(request)));
			
		}
		
		
		

		
}
