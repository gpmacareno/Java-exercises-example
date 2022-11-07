package es.studium.ejercicio6;


public class TestCarrera
{

	public static void main(String[] args)
	{
	      
		Coche coche1 = new Coche ();
		coche1.setFabricante("Industrias Acerita");
		coche1.setModelo("Bombardete");
		coche1.setAno(2019);
		coche1.setGasolina(true);
		
		System.out.println(coche1.getFabricante());
		System.out.println(coche1.getModelo());
		System.out.println(coche1.getAno());
		System.out.println(coche1.getGasolina());
		
		Piloto piloto1 = new Piloto ("Mandela", "Kenia");

		System.out.println( "Hi, my name is " + piloto1.getNombre() + " " + "from" + " " + piloto1.getNacion());

		Coche coche2 = new Coche ();
		coche2.setFabricante("Industria Cabaña de la abuela");
		coche2.setModelo("A todo Gas");
		coche2.setAno(2022);
		coche2.setGasolina(false);
		
		System.out.println(coche2.getFabricante());
		System.out.println(coche2.getModelo());
		System.out.println(coche2.getAno());
		System.out.println(coche2.getGasolina());
		
		Piloto piloto2 = new Piloto ("Boris", "Rusia");

		System.out.println( "Hi, my name is " + piloto2.getNombre() + " " + "from" + " " + piloto2.getNacion());
		
		
		
		

	}

}
