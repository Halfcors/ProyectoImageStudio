package com.uisrael.ProyectoImageStudio.presentacion.dto.response;

import java.time.LocalDate;

public class PedidoResponseDto {
	
	private int id;
    private String tipo;
    private int cantidad;
    private boolean estado;
    private LocalDate fechaEntrega;
    
    //gettter y setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


    
    
}
