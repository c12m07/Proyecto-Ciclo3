package com.DAO.TiendaVirtualSB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.DTO.TiendaVirtualSB.UsuarioVO;


/**
 * Clase que permite el acceso a la base de datos
 * 
 *
 */
public class ClienteDAO 
{

 /**
  * Permite registrar un Cliente nuevo
  * @param persona
  */
	
// METODO VALIDACION
	public int Validar (UsuarioVO persona) {
		java.sql.Connection con;
	    Conexion conex = new Conexion();
	    PreparedStatement ps;
	    ResultSet rs;
	    int r=0;
    String sql="Select * from usuarios where usuarioUsuario=? and contrasenaUsuario=?";
	    try {
	    	con=conex.getConnection();
	        ps=con.prepareStatement(sql);
	        ps.setString(1, persona.getUsuarioUsuario());
	        ps.setString(2, persona.getContrasenaUsuario());
	    	rs=ps.executeQuery();
	    	while(rs.next()) {
	    		r=r+1;
	    		persona.setUsuarioUsuario(rs.getString("usuarioUsuario"));
	    		persona.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
	    	}
	    	if(r==1) {
	    		return 1;
	    	}else {
	    		return 0;
	    	}
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return 0;
	    }
	}
	
// METODOS CLIENTES	
	
 public void registrarCliente(ClienteVO persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO clientes VALUES ('"+persona.getCedulaCliente()+"', '"
     +persona.getDireccionCliente()+"', '"+persona.getEmailCliente()+"', '"+persona.getNombreCliente()+"', '"+persona.getTelefonoCliente()+"')");
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
  }
 }
   
 public void modificarCliente(ClienteVO persona) {
    Conexion conex = new Conexion();
    try {
        Statement estatuto = conex.getConnection().createStatement();
        estatuto.executeUpdate("update clientes set cedula_cliente='"+persona.getCedulaCliente()+"', direccion_cliente ='" + persona.getDireccionCliente()+"', email_cliente ='" + persona.getEmailCliente()+"', nombre_cliente ='" + persona.getNombreCliente()+"', telefono_cliente ='" + persona.getTelefonoCliente()+"' where cedula_cliente='" + persona.getCedulaCliente()+"'");
        estatuto.close();
        conex.desconectar();
    } catch (SQLException e) {
    }
}
 
 public void eliminarCliente(ClienteVO persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("delete from clientes where cedula_cliente= '"+persona.getCedulaCliente()+"'");
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
  }
 }
 
 
 // METODOS USUARIO
 
 public void registrarUsuario(UsuarioVO persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO usuarios VALUES ('"+persona.getCedulaUsuario()+"', '"
     +persona.getNombreUsuario()+"', '"+persona.getCorreoUsuario()+"', '"+persona.getNombreUsuario()+"', '"+persona.getContrasenaUsuario()+"')");
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
  }
 }
   
 public void modificarUsuario(UsuarioVO persona) {
    Conexion conex = new Conexion();
    try {
        Statement estatuto = conex.getConnection().createStatement();
        estatuto.executeUpdate("update usuarios set cedula_usuario='"+persona.getCedulaUsuario()+"', email_usuario ='" + persona.getCorreoUsuario()+"', nombre_usuario ='" + persona.getNombreUsuario()+"', contrasenaUsuario ='" + persona.getContrasenaUsuario()+"', usuarioUsuario ='" + persona.getUsuarioUsuario()+"' where cedula_usuario='" + persona.getCedulaUsuario()+"'");
        estatuto.close();
        conex.desconectar();
    } catch (SQLException e) {
    }
}
 
 public void eliminarUsuario(UsuarioVO persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("delete from usuarios where cedula_usuario= '"+persona.getCedulaUsuario()+"'");
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
  }
 }
/**
 * permite consultar el Cliente asociado al documento enviado
 * como parametro 
 * @param documento 
 * @return
 */
public ArrayList<ClienteVO> consultarPersona(int cedulaCliente) {
  ArrayList< ClienteVO> miCliente = new ArrayList< ClienteVO>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM clientes where cedula_cliente = ? ");
   consulta.setInt(1, cedulaCliente);
   ResultSet res = consulta.executeQuery();
   
  if(res.next()){
    ClienteVO persona= new ClienteVO();
    persona.setCedulaCliente(Integer.parseInt(res.getString("cedula_cliente")));
    persona.setNombreCliente(res.getString("nombre_cliente"));
    persona.setEmailCliente(res.getString("email_cliente"));
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return miCliente;
 }



/**
 * permite consultar la lista de Clientes
 * @return
 */
public ArrayList< ClienteVO> listaDePersonas() {
  ArrayList< ClienteVO> miCliente = new ArrayList< ClienteVO>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM clientes");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    ClienteVO persona= new ClienteVO();
    persona.setCedulaCliente(Integer.parseInt(res.getString("cedula_cliente")));
    persona.setNombreCliente(res.getString("nombre_cliente"));
    persona.setEmailCliente(res.getString("email_cliente"));
  
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
  }
  return miCliente;
 }

}