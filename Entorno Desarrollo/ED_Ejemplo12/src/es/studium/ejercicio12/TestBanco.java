package es.studium.ejercicio12;

public class TestBanco
{

	public static void main(String[] args)
	{

		Cliente Cliente1 = new Cliente("2563214K", "Beatriz","Calle de la Amargura, 16");
		Cuenta cuenta1 = new Cuenta(2000, 230, Cliente1);
		System.out.println(
			"La cuenta de " + " " +	cuenta1.getCliente().getNombre() + " " + " tiene " + cuenta1.getSaldo() + " euros ");

		Cliente Cliente2 = new Cliente("951423l", "Antonio","Calle Precipicio, 20");
		Cuenta cuenta2 = new Cuenta(3010, 800, Cliente2);
		System.out.println(
			"La cuenta de " + " " +	cuenta2.getCliente().getNombre() + " " + " tiene " + cuenta2.getSaldo() + " euros ");
		
		cuenta1.setSaldo(cuenta1.getSaldo()-50);
		cuenta2.setSaldo(cuenta2.getSaldo()+50);

		System.out.println(
				"La cuenta de " + " " +	cuenta1.getCliente().getNombre() + " " + " tiene " + cuenta1.getSaldo() + " euros ");		
		System.out.println(
				"La cuenta de " + " " +	cuenta2.getCliente().getNombre() + " " + " tiene " + cuenta2.getSaldo() + " euros ");		
		
	}

}
