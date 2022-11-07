package es.studium.ejercicio7;

public class Instrumento
{

	private String nombre;
	private char afinacion;
	
	
public Instrumento ()
{
	nombre = "";
	afinacion = ' ';
	
}

public Instrumento (String name, char afin) 
{
	
	nombre = name;
	afinacion = afin;
	
}

public String getNombre()
{
	return nombre;
}

public void setNombre(String nombre)
{
	this.nombre = nombre;
}

public char getAfinacion()
{
	return afinacion;
}

public void setAfinacion(char afinacion)
{
	this.afinacion = afinacion;
}
	

	
	
	
	
}
