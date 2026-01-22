package com.uisrael.ProyectoImageStudio.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IUsuarioCasoUso;
import com.uisrael.ProyectoImageStudio.presentacion.dto.request.UsuarioRequestDto;
import com.uisrael.ProyectoImageStudio.presentacion.dto.response.UsuarioResponseDto;
import com.uisrael.ProyectoImageStudio.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {
	
	private final IUsuarioCasoUso usuarioCasoUso; //casos de uso
	private final IUsuarioDtoMapper mapper; //mapeadores
	
	//constructor
	public UsuarioControlador(IUsuarioCasoUso usuarioCasoUso, IUsuarioDtoMapper mapper) {
		this.usuarioCasoUso = usuarioCasoUso;
		this.mapper = mapper;
	}
	
	
	@GetMapping
	public List<UsuarioResponseDto> listar() {
		return usuarioCasoUso.listar().stream().map(mapper::toResponseDto).toList();
		
	}
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public UsuarioResponseDto crear(@Valid @RequestBody UsuarioRequestDto request) {
		return mapper.toResponseDto(usuarioCasoUso.crear(mapper.toDomain(request)));
		
	}


	
}
