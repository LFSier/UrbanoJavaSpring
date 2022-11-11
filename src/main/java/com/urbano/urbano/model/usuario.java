package com.urbano.urbano.model;

public class usuario {
    private Integer id;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;

	public Usuario(Integer id, String nombre, String username, String email, String direccion, String telefono, String tipo, String password) {
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
	} 

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsername() {
		return username;
	}
    public Integer getEmail(Integer email) {
		return email;
	}
    public Integer getDireccion(Integer direccion) {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", nombre='" + getNombre() + "'" +
			", username='" + getUsername() + "'" +
			", email='" + getEmail() + "'" +
			", direccion='" + getDireccion() + "'" +
			", telefono='" + getTelefono() + "'" +
			", tipo='" + getTipo() + "'" +
			", password='" + getPassword() + "'" +
			"}";
	}

	
}
