package es.studium.ejercicio9;

public class Libro
{
	private String titulo;
	private Autor autor; // UNIENDO LA CLASE AUTOR CON LA CLASE LIBRO
	private int ano;
	private String editorial;
	private int paginas;

	public Libro()
	{
		titulo = "";
		autor = new Autor(); //VALOR NULO LLAMANDO A LA CLASE AUTOR
		ano = 0;
		editorial = "";
		paginas = 0;
	}

	public Libro(String titulo, Autor autor, int ano, String editorial, int paginas)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.editorial = editorial;
		this.paginas = paginas;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public Autor getAutor()
	{
		return autor;
	}

	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public String getEditorial()
	{
		return editorial;
	}

	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}

	public int getPaginas()
	{
		return paginas;
	}

	public void setPaginas(int paginas)
	{
		this.paginas = paginas;
	}
}
