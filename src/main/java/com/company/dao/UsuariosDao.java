package com.company.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.company.modelo.RolUsuarios;
import com.company.modelo.Usuarios;
import com.company.servicioweb.usuario.RolesUsuario;

public interface UsuariosDao {
	
	@Transactional (readOnly=true)
	public Usuarios findByUsernameAndPassword(String usuario, String password); 
	
	@Transactional(readOnly=true)
	public  List<RolUsuarios> generarRoles(String usuario); 
	
}
