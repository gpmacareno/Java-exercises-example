package es.studium.ejemplo3;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		Empleado empleado1 = new Empleado ();		
		empleado1.setNombre("Marta");
		empleado1.setApellidos("Coronado");
		empleado1.setdni("30250334");
		empleado1.setdomicilio("Ciudad Grande, nº2, Puerta 30 ");
		empleado1.setpuesto("Peón");
		empleado1.settelefono (689555210);
		
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getApellidos());
		System.out.println(empleado1.getDni());
		System.out.println(empleado1.getDomicilio());
		System.out.println(empleado1.getpuesto());
		System.out.println(empleado1.gettelefono());
	
	
		Empleado empleado2 = new Empleado ("Jorge", "Sanchez Garcia", "34231232", "Avda, La Paz, Nº3", "Programador", 954654756);
	
		System.out.println(empleado2.getNombre() + " " + empleado2.getApellidos() + " " + empleado2.getDni() + " " + empleado2.getDomicilio()+ " " + empleado2.getpuesto() + " " + empleado2.gettelefono());
		
    }

		
}
