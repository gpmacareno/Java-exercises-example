package es.studium.ejercicio11;

public class Equipo
{

	private String nombre;
	private int ano;
	private int socios;

	public Equipo()
	{
		nombre = "";
		ano = 0;
		socios = 0;

	}

	public Equipo(String nombre, int ano, int socios)
	{
		this.nombre = nombre;
		this.ano = ano;
		this.socios = socios;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public int getSocios()
	{
		return socios;
	}

	public void setSocios(int socios)
	{
		this.socios = socios;
	}

}
