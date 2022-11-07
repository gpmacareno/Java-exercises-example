package es.studium.ejercicio11;

public class TestLiga
{

	public static void main(String[] args)
	{

		Equipo equipo1 = new Equipo("Los Malitos", 1910, 120000);
		Futbolistas futbolistas1 = new Futbolistas("Hernesto", "Dior Bjron", true, equipo1);
		System.out.println(futbolistas1.getNombre() + " " + futbolistas1.getApellido() + " juega en el equipo "
				+ " con un número actual de socios de " + futbolistas1.getEquipo().getSocios());

		Equipo equipo2 = new Equipo("Coyotes Locos", 1945, 200000);
		Futbolistas futbolistas2 = new Futbolistas("Lucia", "Santa Clara", false, equipo2);
		System.out.println(futbolistas2.getNombre() + " " + futbolistas2.getApellido() + " juega en el equipo "
				+ futbolistas2.getEquipo().getNombre() + " fundado en el año " + futbolistas2.getEquipo().getAno()
				+ " con un número actual de socios de " + futbolistas2.getEquipo().getSocios());
		
		Equipo equipo3 = new Equipo("Buitres Borrachos", 1980, 50000);
		Futbolistas futbolistas3 = new Futbolistas("Catalina", "Mal Tiro", false, equipo3);
		System.out.println(futbolistas3.getNombre() + " " + futbolistas3.getApellido() + " juega en el equipo "
				+ futbolistas3.getEquipo().getNombre() + " fundado en el año " + futbolistas3.getEquipo().getAno()
				+ " con un número actual de socios de " + futbolistas3.getEquipo().getSocios());
		
		Equipo equipo4 = new Equipo("Tabernas Cerradas", 2000, 3000);
		Futbolistas futbolistas4 = new Futbolistas("Diego", "Malavida", true, equipo4);
		System.out.println(futbolistas4.getNombre() + " " + futbolistas4.getApellido() + " juega en el equipo "
				+ futbolistas4.getEquipo().getNombre() + " fundado en el año " + futbolistas4.getEquipo().getAno()
				+ " con un número actual de socios de " + futbolistas4.getEquipo().getSocios());
		
		
		
	}

}
