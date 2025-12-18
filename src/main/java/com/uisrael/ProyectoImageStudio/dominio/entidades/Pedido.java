package com.uisrael.ProyectoImageStudio.dominio.entidades;

import java.time.LocalDate;

public final class Pedido {

	private final int id;
    private final String tipo;
    private final int cantidad;
    private final boolean estado;
    private final LocalDate fechaEntrega;
    
    //constructores
	public Pedido(int id, String tipo, int cantidad, boolean estado, LocalDate fechaEntrega) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
	}

    // getters y setters
	public int getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public boolean isEstado() {
		return estado;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	//toString
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", tipo=" + tipo + ", cantidad=" + cantidad + ", estado=" + estado
				+ ", fechaEntrega=" + fechaEntrega + "]";
	}
    

	
	
}
