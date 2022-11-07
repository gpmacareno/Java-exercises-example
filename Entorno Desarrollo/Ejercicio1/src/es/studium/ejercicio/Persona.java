package es.studium.ejercicio;

public class Persona
{
	
	private String nombre; 
	private String apellidos; 
	private String dni;
	private String domicilio;
	private int telefono;
	
	public Persona () { 

		nombre = ""; 
		apellidos = ""; 
		dni = "";
		domicilio = "";
		telefono = 0; 
		
	}
		
	public Persona (String nomb, String apell, String id, String dom, int tlf) {

		nombre = nomb; 
		apellidos = apell; 
		dni = id;
		domicilio = dom;
		telefono = tlf; 
		
		
		
	}
		
		
	public String getNombre() {
			return nombre;
	}

	public void setNombre(String nombre) {
			this.nombre = nombre;
	}

	public String getApellidos() {
			return apellidos;
	}

	public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
	}

	public String getDni() {
			return dni;
	}

	public void setdni (String dni) {
		
		    this.dni = dni;
	
	}
	
	public String getDomicilio() {
		return domicilio;
	
	}
		
	public void setdomicilio (String domicilio) {
			
		 this.domicilio = domicilio;
		 
	}
	
	public int gettelefono() {
		return telefono;
		
		
	}
		
	public void settelefono(int telefono) {
		this.telefono = telefono;
	
	}

		
}
