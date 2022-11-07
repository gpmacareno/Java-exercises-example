package es.studium.peliculas;

public class Pelicula
{
	private String titulo; 
	private int ano; 
	private String duracion;
	
public Pelicula ()
{

		titulo = ""; 
		ano = 0; 
		duracion = "";

}

public String getTitulo()
{
	return titulo;
}

public void setTitulo(String titulo)
{
	this.titulo = titulo;
}

public int getAno()
{
	return ano;
}

public void setAno(int ano)
{
	this.ano = ano;
}

public String getDuracion()
{
	return duracion;
}

public void setDuracion(String duracion)
{
	this.duracion = duracion;
}

}