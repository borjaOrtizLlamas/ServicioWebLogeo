package com.company.modelo;

import java.util.HashSet;
import java.util.Set;

public class Usuarios {
	private String usuario;
	private String contrasena;
	private int valido;
	private Set<RolUsuarios> rolUsuario = new HashSet<RolUsuarios>();
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getValido() {
		return valido;
	}
	public void setValido(int valido) {
		this.valido = valido;
	}
	public Set<RolUsuarios> getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(Set<RolUsuarios> rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	
	
	
}
