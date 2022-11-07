package es.studium.ejercicio10;

public class Alumno
{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean hapagado;
	private Aula aula;

	public Alumno()
	{
		nombre = "";
		apellido = "";
		edad = 0;
		hapagado = false;
		aula = new Aula();
	}

	public Alumno(String nombre, String apellido, int edad, boolean hapagado, Aula aula)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.hapagado = hapagado;
		this.aula = aula;
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

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean getHapagado()
	{
		return hapagado;
	}

	public void setHapagado(boolean hapagado)
	{
		this.hapagado = hapagado;
	}

	public Aula getAula()
	{
		return aula;
	}

	public void setAula(Aula aula)
	{
		this.aula = aula;
	}

}
