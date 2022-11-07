package es.studium.ejercicio6;

public class Piloto
{

	private String nombre;
	private String nacion;
	
public Piloto ()
{
	nombre = "";
	nacion = "";	
}

public Piloto (String name, String country)
{
	
	nombre = name;
	nacion = country;
	
}

public String getNombre()
{
	return nombre;
}

public void setNombre(String nombre)
{
	this.nombre = nombre;
}

public String getNacion()
{
	return nacion;
}

public void setNacion(String nacion)
{
	this.nacion = nacion;
}





}
