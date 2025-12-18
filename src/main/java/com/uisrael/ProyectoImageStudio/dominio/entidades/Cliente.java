package com.uisrael.ProyectoImageStudio.dominio.entidades;

public final class Cliente {
	private final int id;
	private final String nombre; 
	private final String correo;
	private final String telefono;
	private final String observaciones;
	private final String creado_en;
	
	//constructores
	public Cliente(int id, String nombre, String correo, String telefono, String observaciones, String creado_en) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.observaciones = observaciones;
		this.creado_en = creado_en;
	}
	
	// getters y setters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public String getCreado_en() {
		return creado_en;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ ", observaciones=" + observaciones + ", creado_en=" + creado_en + "]";
	}
	
	
}
