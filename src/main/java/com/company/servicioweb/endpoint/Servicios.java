package com.company.servicioweb.endpoint;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.company.modelo.RolUsuarios;
import com.company.modelo.Usuarios;
import com.company.servicio.LogServicio;
import com.company.servicioweb.serviciologeo.LogeoRequest;
import com.company.servicioweb.serviciologeo.LogeoResponse;
import com.company.servicioweb.serviciologeo.RolesRequest;
import com.company.servicioweb.serviciologeo.RolesResponse;
import com.company.servicioweb.usuario.RolesUsuario;
import com.company.servicioweb.usuario.Usuario;




@Endpoint
public class Servicios {

	
	
	
	private static final String TARGET_NAMESPACE = "http://com/company/servicioweb/servicioLogeo";
	
	@Autowired
	LogServicio logServicio;
	
	@PayloadRoot(localPart = "LogeoRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload LogeoResponse getLogeoRequest(@RequestPayload LogeoRequest request) {
		LogeoResponse log = new LogeoResponse(); 
		if(logServicio.findByUsernameAndPassword(request.getUsuario(), request.getPasword()) != null)
			log.setUsuarioValido(true);
			else log.setUsuarioValido(false);
		return log; 
	}
	

	public LogServicio getLogServicio() {
		return logServicio;
	}

	public void setLogServicio(LogServicio logServicio) {
		this.logServicio = logServicio;
	}

}
