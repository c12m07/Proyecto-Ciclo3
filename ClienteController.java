package com.BO.TiendaVirtualSB;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.DTO.TiendaVirtualSB.UsuarioVO;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
public class ClienteController {
	
	// METODO VALIDACION
	@RequestMapping("/validar")
	public void validar(UsuarioVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.Validar(persona);
	    
	 }
	
	// METODOS CLIENTES
	@RequestMapping("/registrarCliente")
	public void registrarCliente(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarCliente(persona);
	    
	 }
	   
	@RequestMapping("/modificarCliente")
	public void modificarCliente(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.modificarCliente(persona);
	    
	 }
	
	@RequestMapping("/eliminarCliente")
	public void eliminarCliente(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.eliminarCliente(persona);
	    
	 }
	 
	// METODOS USUARIOS
	@RequestMapping("/registrarUsuario")
	public void registrarUsuario(UsuarioVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarUsuario(persona);
	    
	 }
	   
	@RequestMapping("/modificarUsuario")
	public void modificarUsuario(UsuarioVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.modificarUsuario(persona);
	    
	 }
	
	@RequestMapping("/eliminarUsuario")
	public void eliminarUsuario(UsuarioVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.eliminarUsuario(persona);
	    
	 }
	/**
	 * permite consultar el Cliente asociado al documento enviado
	 * como parametro 
	 * @param documento 
	 * @return
	 */
	
	@RequestMapping("/consultarPersona")
	public ArrayList<ClienteVO> consultarPersona(int documento) {
		ClienteDAO Dao=new ClienteDAO(); 
	return 	Dao.consultarPersona(documento);
		
	}
}
