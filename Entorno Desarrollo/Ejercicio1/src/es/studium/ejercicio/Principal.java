package es.studium.ejercicio;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Persona persona1 = new Persona ();		
		persona1.setNombre("Julia ");
		persona1.setApellidos("Beltran Coronado ");
		persona1.setdni("30250334 ");
		persona1.setdomicilio("Ciudad Grande, nº2, Puerta 30 ");
		persona1.settelefono (689555210);
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getDni());
		System.out.println(persona1.getDomicilio());
		System.out.println(persona1.gettelefono());
		
	
		
	Persona persona2 = new Persona ("Jorge", "Sanchez Garcia", "34231232", "Avda, La Paz, Nº3", 954654756);
		
	
	System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getDni() + " " + persona2.getDomicilio() +  " " + persona2.gettelefono());
	
	
	}

}
