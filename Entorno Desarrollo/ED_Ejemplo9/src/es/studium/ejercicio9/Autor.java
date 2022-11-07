package es.studium.ejercicio9;

public class Autor
{

	private String nombre;
	private String apellido;
	private String nacion;

	public Autor()
	{

		nombre = "";
		apellido = "";
		nacion = "";
	}

	public Autor(String nombre, String apellido, String nacion)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacion = nacion;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
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
