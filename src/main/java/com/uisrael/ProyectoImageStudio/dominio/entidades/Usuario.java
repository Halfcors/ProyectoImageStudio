package com.uisrael.ProyectoImageStudio.dominio.entidades;

public class Usuario {
	
	private final int id;
    private final String username;
    private final String rol;
    
    //constructores
	public Usuario(int id, String username, String rol) {
		super();
		this.id = id;
		this.username = username;
		this.rol = rol;
	}

	// getters y setters
	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getRol() {
		return rol;
	}

	//toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", rol=" + rol + "]";
	}
	

 






	

}
