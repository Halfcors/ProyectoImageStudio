package com.uisrael.ProyectoImageStudio.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class PedidoJpa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
    private String tipo;
    private int cantidad;
    private boolean estado;
    private LocalDate fechaEntrega;

    @OneToMany(mappedBy = "fkPedido")
	private List<ClienteJpa> pedido;
}
