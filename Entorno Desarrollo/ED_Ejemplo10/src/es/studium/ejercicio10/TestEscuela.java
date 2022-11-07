package es.studium.ejercicio10;

public class TestEscuela
{

	public static void main(String[] args)
	{

		Aula aula1 = new Aula("DAM", 30);
		Alumno alumno1 = new Alumno("Manolo", "Lopetegui Urrialde", 58, true, aula1);
		System.out.println(
				alumno1.getNombre() + " " + alumno1.getApellido() + " estudia en " + alumno1.getAula().getNombre());

		Aula aula2 = new Aula("DAW", 25);
		Alumno alumno2 = new Alumno("Lara", "Donosti Zoriark", 208, false, aula2);
		System.out.println(
				alumno2.getNombre() + " " + alumno2.getApellido() + " estudia en " + alumno2.getAula().getNombre());

		Aula aula3 = new Aula("ASIR", 20);
		Alumno alumno3 = new Alumno("Carmen", "Del Rio Montero", 19, true, aula3);
		System.out.println(
				alumno3.getNombre() + " " + alumno3.getApellido() + " estudia en " + alumno3.getAula().getNombre());

	}

}
