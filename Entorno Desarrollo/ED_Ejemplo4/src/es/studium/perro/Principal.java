package es.studium.perro;

public class Principal
{

	public static void main(String[] args)
	{
		
		Perro perro1 = new Perro ();		
		perro1.setRaza("Egipcio");
		perro1.setWeight("Pequeño");
		perro1.setEdad(10);
		perro1.setColor("Blanco");
		
		System.out.println(perro1.getRaza());
		System.out.println(perro1.getWeight());
		System.out.println(perro1.getEdad());
		System.out.println(perro1.getColor());
		
		Perro perro2 = new Perro ();		
		perro2.setRaza("Danes");
		perro2.setWeight("Grande");
		perro2.setEdad(3);
		perro2.setColor("Pardo");
		
		System.out.println(perro2.getRaza());
		System.out.println(perro2.getWeight());
		System.out.println(perro2.getEdad());
		System.out.println(perro2.getColor());
		
		Perro perro3 = new Perro ();		
		perro3.setRaza("Maltes");
		perro3.setWeight("Mediano");
		perro3.setEdad(8);
		perro3.setColor("Negro");
		
		System.out.println(perro3.getRaza());
		System.out.println(perro3.getWeight());
		System.out.println(perro3.getEdad());
		System.out.println(perro3.getColor());
		
		
	}

}
