package com.company.servicio;

import java.util.List;

import com.company.modelo.RolUsuarios;
import com.company.modelo.Usuarios;
import com.company.servicioweb.usuario.RolesUsuario;
import com.company.servicioweb.usuario.Usuario;

public interface LogServicio {

	public Usuarios findByUsernameAndPassword(String usuario, String password); 
	
	public  List<RolUsuarios>  generarRoles(String usuario); 

	
}
