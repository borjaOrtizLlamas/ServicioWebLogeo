package com.company.servicio;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.UsuariosDao;
import com.company.modelo.RolUsuarios;
import com.company.modelo.Usuarios;
import com.company.servicioweb.usuario.RolesUsuario;
import com.company.servicioweb.usuario.Usuario;

public class LogServicioImpl implements LogServicio {

	private UsuariosDao usuariosDao;

	public Usuarios findByUsernameAndPassword(String usuarioName, String password) {		
		return  usuariosDao.findByUsernameAndPassword(usuarioName, password); 
		
	}

	public List<RolUsuarios> generarRoles(String usuario) {
		return usuariosDao.generarRoles(usuario);
	}

	public UsuariosDao getUsuariosDao() {
		return usuariosDao;
	}

	public void setUsuariosDao(UsuariosDao usuariosDao) {
		this.usuariosDao = usuariosDao;
	}

}
