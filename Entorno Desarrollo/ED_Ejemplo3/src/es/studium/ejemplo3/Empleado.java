package es.studium.ejemplo3;

public class Empleado
{

	private String nombre; 
	private String apellidos; 
	private String dni;
	private String domicilio;
	private String puesto;
	private int telefono;
	
	public Empleado () { 

		nombre = ""; 
		apellidos = ""; 
		dni = "";
		domicilio = "";
		puesto = "";
		telefono = 0;
		
	}
		
	public Empleado (String nomb, String apell, String id, String dom, String puest, int tlf) {

		nombre = nomb; 
		apellidos = apell; 
		dni = id;
		domicilio = dom;
		puesto = puest;
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
	 
	 
	 public String getpuesto() {
			return puesto;

		}
			
	public void setpuesto (String puesto) {
				
			 this.puesto = puesto;
	 
}

	public int gettelefono() {
	return telefono;
	
	
}
	
	public void settelefono(int telefono) {
	this.telefono = telefono;
	
	}
	
	
	
	
	
	
	
	
}
