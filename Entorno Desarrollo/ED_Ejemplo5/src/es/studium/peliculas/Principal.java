package es.studium.peliculas;

public class Principal
{

	public static void main(String[] args)
	{
		
		Pelicula pelicula1 = new Pelicula ();		
		pelicula1.setTitulo("El amanecer de las ardillas");
		pelicula1.setAno(1950);
		pelicula1.setDuracion("190 minutos");
		
		System.out.println(pelicula1.getTitulo());
		System.out.println(pelicula1.getAno());
		System.out.println(pelicula1.getDuracion());
		
		Pelicula pelicula2 = new Pelicula ();		
		pelicula2.setTitulo("La trompa del abedul");
		pelicula2.setAno(2022);
		pelicula2.setDuracion("260 minutos");
		
		Pelicula pelicula3 = new Pelicula ();		
		pelicula3.setTitulo("Gangrena Asesina");
		pelicula3.setAno(1990);
		pelicula3.setDuracion("120 minutos");
		
		System.out.println(pelicula3.getTitulo());
		System.out.println(pelicula3.getAno());
		System.out.println(pelicula3.getDuracion());
		
		Pelicula pelicula4 = new Pelicula ();		
		pelicula4.setTitulo("Mi amigo el orangután");
		pelicula4.setAno(1988);
		pelicula4.setDuracion("60 minutos");
		
		Pelicula pelicula5 = new Pelicula ();		
		pelicula5.setTitulo("Espacio Raro");
		pelicula5.setAno(2000);
		pelicula5.setDuracion("30 minutos");
		

	}

}
