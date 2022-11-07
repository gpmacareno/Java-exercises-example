package es.studium.ejercicio9;

public class Biblioteca
{

	public static void main(String[] args)
	{

		Autor autor1 = new Autor("Prior George", "Winston", "Ingles");

		Libro libro1 = new Libro();
		libro1.setTitulo("Las maravillas de cocinar Setas");
		libro1.setAutor(autor1);
		libro1.setAno(1777);
		libro1.setEditorial("Editorial Abadia de Westminster");
		libro1.setPaginas(400);

		System.out.println(libro1.getTitulo() + " del " + libro1.getAutor().getNombre() + " "
				+ libro1.getAutor().getApellido() + " de orígen " + libro1.getAutor().getNacion() + ". Año " + libro1.getAno() + ", "
				+ libro1.getEditorial() + ". Numero de páginas: " + libro1.getPaginas());

		Autor autor2 = new Autor("Philippe", "Garçon", "Frances");

		Libro libro2 = new Libro("Baguette, tu amiga", autor2, 1850, "Editorial Eiffel", 800);

		System.out.println(libro2.getTitulo() + " del autor " + libro2.getAutor().getNombre() + " "
				+ libro2.getAutor().getApellido() + " de orígen " + libro2.getAutor().getNacion() + ". Año " + libro2.getAno() + ", "
				+ libro2.getEditorial() + ". Numero de páginas: " + libro2.getPaginas());

		Autor autor3 = new Autor("Esteban", "Beltran", "Venezolano");
		Libro libro3 = new Libro("Palomas y otros manjares", autor3, 2010, "Editorial Terremoto", 50);
		System.out.println(libro3.getTitulo() + " del autor " + libro3.getAutor().getNombre() + " "
				+ libro3.getAutor().getApellido() + " de origen " + libro3.getAutor().getNacion() + ". Año " + libro3.getAno() + ", "
				+ libro3.getEditorial() + ". Numero de páginas: " + libro3.getPaginas());

	}
}
