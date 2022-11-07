package es.studium.perro;

public class Perro
{

	private String raza; 
	private String weight; 
	private int edad;
	private String color;
	
	
public Perro () 
{ 

		raza = ""; 
		weight = ""; 
		edad = 0;
		color = "";
				
}
		

		
public Perro (String raz, String we, int age, String col) {

		raza = raz; 
		weight = we; 
		edad = age;
		color = col;
}
		
		public String getRaza() {
			return raza;
	}

		public void setRaza(String raza) {
			this.raza = raza;
	}

		public String getWeight() {
			return weight;
	}

		public void setWeight(String weight) {
			this.weight = weight;
	}


		public int getEdad()
		{
			return edad;
		}



		public void setEdad(int edad)
		{
			this.edad = edad;
		}



		public String getColor()
		{
			return color;
		}



		public void setColor(String color)
		{
			this.color = color;
		}
		

}
