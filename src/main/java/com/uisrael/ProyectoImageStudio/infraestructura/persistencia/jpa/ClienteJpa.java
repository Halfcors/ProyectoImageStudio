package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class ClienteJpa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	@Column(name = "cli_nombre", length = 80)
	private String nombre; 
	private String correo; 
	private String telefono;
	private String observaciones;
	private String creado_en;
	
	
	@ManyToOne
	@JoinColumn(name = "fkPedido")
	private PedidoJpa fkPedido;
}
