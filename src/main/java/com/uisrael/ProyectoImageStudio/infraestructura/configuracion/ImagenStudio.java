package com.uisrael.ProyectoImageStudio.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IClienteCasoUso;
import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IPedidoCasoUso;
import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.entrada.IUsuarioCasoUso;
import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl.ClienteCasoUsoImpl;
import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl.PedidoCasoUsoImpl;
import com.uisrael.ProyectoImageStudio.aplicacion.casosuso.impl.UsuarioCasoUsoImpl;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IClienteRepositorio;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IPedidoRepositorio;
import com.uisrael.ProyectoImageStudio.dominio.repositorio.IUsuarioRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores.ClienteRepositorioImpl;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores.PedidoRepositorioImpl;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.adaptadores.UsuarioRepositorioImpl;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IClienteJpaRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IPedidoJpaRepositorio;
import com.uisrael.ProyectoImageStudio.infraestructura.repositorio.IUsuarioJpaRepositorio;


@Configuration
public class ImagenStudio {
	
	@Bean
	IClienteRepositorio clienteRepositorio(IClienteJpaRepositorio jpaRepository, 
			IClienteJpaMapper mapper) {
		return new ClienteRepositorioImpl(jpaRepository, mapper);
	}
	
	@Bean
	IClienteCasoUso clienteCasoUso(IClienteRepositorio repositorio) {
		return new ClienteCasoUsoImpl(repositorio);
	}
	
	@Bean
	IPedidoRepositorio pedidoRepositorio(IPedidoJpaRepositorio jpaRepository, 
			IPedidoJpaMapper mapper) {
		return new PedidoRepositorioImpl(jpaRepository, mapper);
	}
	
	@Bean
	IPedidoCasoUso pedido(IPedidoRepositorio repositorio) {
		return new PedidoCasoUsoImpl(repositorio);
	}
	
	@Bean
	IUsuarioRepositorio usuarioRepositorio(IUsuarioJpaRepositorio jpaRepository, 
			IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepository, mapper);
	}
	
	@Bean
	IUsuarioCasoUso usuario(IUsuarioRepositorio repositorio) {
		return new UsuarioCasoUsoImpl(repositorio);
	}

}
