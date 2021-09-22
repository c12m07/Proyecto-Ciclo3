package com.DTO.TiendaVirtualSB;

public class ClienteVO {

    private Integer cedulaCliente;
    private String direccionCliente;
    private String emailCliente;
    private String nombreCliente;
    private Integer telefonoCliente;

    public ClienteVO(){};

    public ClienteVO(Integer cedulaCliente, String direccionCliente, String emailCliente, String nombreCliente, Integer telefonoCliente){
        this.cedulaCliente=cedulaCliente;
        this.direccionCliente=direccionCliente;
        this.emailCliente=emailCliente;
        this.nombreCliente=nombreCliente;
        this.telefonoCliente=telefonoCliente;
    };

	public Integer getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(Integer cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(Integer telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}    
}