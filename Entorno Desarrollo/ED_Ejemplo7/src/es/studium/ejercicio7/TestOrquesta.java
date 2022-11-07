package es.studium.ejercicio7;


public class TestOrquesta
{

	public static void main(String[] args)
	{
		
		Instrumento instrumento1 = new Instrumento ();
		instrumento1.setNombre("Banjo");
		instrumento1.setAfinacion('G');
		
		Musico musico1 = new Musico ();
		musico1.setNombre("Armando");
		musico1.setSexo('H');
		
		System.out.println("Hola, mi nombre es " + musico1.getNombre() + " " + "y toco el" + " " + instrumento1.getNombre() + ", la afinación de mi instrumento es " + instrumento1.getAfinacion() + " " +" y mi genero es " + musico1.getSexo() );
		
		Instrumento instrumento2 = new Instrumento ();
		instrumento2.setNombre("Trombon");
		instrumento2.setAfinacion('H');
		
		Musico musico2 = new Musico ();
		musico2.setNombre("Carolina");
		musico2.setSexo('M');
		
		System.out.println("Hola, mi nombre es " + musico2.getNombre() + " " + "y toco el" + " " + instrumento2.getNombre() + ", la afinación de mi instrumento es " + instrumento2.getAfinacion() + " " +" y mi genero es " + musico2.getSexo());
	}

}
