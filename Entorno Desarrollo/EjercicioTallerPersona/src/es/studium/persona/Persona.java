package es.studium.persona;  //ESTA ES UNA PLANTILLA ESPECIAL PARA CREAR OBJETOS, SIN MAIN, LLAMADA POJO

public class Persona {
	

	//Attributes
	private String nombre; //String es para el valor de la variable Cadena.
	private String apellidos; 
	private int edad; //Int es para el valor de la variable de numeros Enteros, estos van sin comillas.
	private boolean haPagado; //Boolean es para el valor de la variable cuando tenemos "verdadero" o "falso"

/* TIPOS DE CONSTRUCTORES:    
 * 
 * 1º Constructores Vacios o por defectos
 * 
 * 2º Constructores con Parametros
 * 
 * */
	
	//Constructor por defecto
	
	
public Persona () { //con esto creamos los objetos y le damos valores a la variables que hemos puesto antes.

	nombre = ""; //para string su valor nulo es una cadena vacia.
	apellidos = ""; //para string su valor nulo es una cadena vacia.
	edad = 0; //para enteros su valor nulo es 0
	haPagado = false; //para boolean su valor nulo es false.
	
}

//Constructor con parametros

public Persona (String nomb, String apell, int ed, boolean hpgdo) {

	nombre = nomb;
	apellidos = apell;
	edad = ed;
	haPagado = hpgdo;
	
}

//Metodos diferentes: (GETTER AND SETTERS) EL METODO GET ME PERMITE OBTENER EL VALOR DEL ATRIBUTO QUE CORRESPONDA
									     //El METODO SET ME PERMITE DARLE EL VALOR DEL ATRIBUTO QUE CORRESPONDA


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public boolean getHaPagado() {
	return haPagado;
}

public void setHaPagado(boolean haPagado) {
	this.haPagado = haPagado;
}


}








