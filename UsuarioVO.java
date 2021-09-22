package com.DTO.TiendaVirtualSB;

public class UsuarioVO {
	
    private Integer cedulaUsuario;
    private String correoUsuario;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private String usuarioUsuario;
    
    public UsuarioVO() {};
    
    public UsuarioVO(Integer cedulaUsuario, String correoUsuario, String nombreUsuario, String contrasenaUsuario, String usuarioUsuario) {
        this.cedulaUsuario=cedulaUsuario;
        this.correoUsuario=correoUsuario;
        this.nombreUsuario=nombreUsuario;     
        this.contrasenaUsuario=contrasenaUsuario;
        this.usuarioUsuario=usuarioUsuario;
    };
    
    public Integer getCedulaUsuario() {
        return cedulaUsuario;
    }
    public void setCedulaUsuario(Integer cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    public String getCorreoUsuario(){
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }
    public String getUsuarioUsuario() {
        return usuarioUsuario;
    }
    public void setUsuarioUsuario(String usuarioUsuario) {
        this.usuarioUsuario = usuarioUsuario;
    }  
}