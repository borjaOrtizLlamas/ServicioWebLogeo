package com.company.dao;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.company.modelo.RolUsuarios;
import com.company.modelo.Usuarios;

public class UsuariosDaoImpl implements UsuariosDao {

	private SessionFactory sessionFactory;

	public Usuarios findByUsernameAndPassword(String usuario, String password) {
		List<Usuarios> users = new ArrayList<Usuarios>();
		// users =
		// getSessionFactory().getCurrentSession().createSQLQuery("select * from usuarios where usuario='"+usuario+"' and contrasena='"+password+"' and valido=1").list();
		users = (List<Usuarios>) sessionFactory
				.getCurrentSession()
				.createSQLQuery(
						"select * from usuarios where usuario='" + usuario
								+ "' and contrasena='" + password
								+ "' and valido=1").addEntity(Usuarios.class)
				.list();

		if (users.size() > 0) {
			Usuarios usu = users.get(0);
			return usu;
		} else {
			return null;
		}

	}

	public List<RolUsuarios> generarRoles(String usuario) {
		return sessionFactory.getCurrentSession()
				.createQuery("from RolUsuarios where usuario=?")
				.setParameter(0, usuario).list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
