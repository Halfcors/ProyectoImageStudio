package com.uisrael.ProyectoImageStudio.presentacion.dto.response;

public class ClienteResponseDto {
	
	private int id;
	private String nombre; 
	private String correo;
	private String telefono;
	private String observaciones;
	private String creado_en;
	
	
	//geteter y setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getCreado_en() {
		return creado_en;
	}
	public void setCreado_en(String creado_en) {
		this.creado_en = creado_en;
	}
	
	

}
