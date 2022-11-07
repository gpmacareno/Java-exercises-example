package es.studium.persona;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona ();		//para crear con New cualquier objeto
		persona1.setNombre("María Jose");
		persona1.setApellidos("Martínez Navas");
		persona1.setEdad(22);
		persona1.setHaPagado(true);
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getEdad());
		System.out.println(persona1.getHaPagado());

		
		Persona persona2 = new Persona ("Javier", "Romero Martínez", 20, true );
		
		System.out.print(persona2.getNombre() + " ");
		System.out.println(persona2.getApellidos());
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getHaPagado());
		
		Persona persona3 = new Persona ("Sara", "Colmenero Gonzalez", 29, false );

		System.out.println(persona3.getNombre() + " " + persona3.getApellidos() + " " + persona3.getEdad() + " " + persona3.getHaPagado());
		
	}
}