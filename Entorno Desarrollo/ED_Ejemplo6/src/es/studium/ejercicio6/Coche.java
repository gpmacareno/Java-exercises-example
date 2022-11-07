package es.studium.ejercicio6;

public class Coche
{
	
	private String fabricante; 
	private String modelo; 
	private int ano;
	private boolean gasolina;

public Coche ()	
{	
	fabricante = ""; 
	modelo = ""; 
	ano = 0;
	gasolina = false;
}

public Coche (String fab, String model, int anos, boolean oil )
{

	fabricante = fab;
	modelo = model;
	ano = anos;
	gasolina = oil;
}

public String getFabricante()
{
	return fabricante;
}

public void setFabricante(String fabricante)
{
	this.fabricante = fabricante;
}

public String getModelo()
{
	return modelo;
}

public void setModelo(String modelo)
{
	this.modelo = modelo;
}

public int getAno()
{
	return ano;
}

public void setAno(int ano)
{
	this.ano = ano;
}

public boolean getGasolina()
{
	return gasolina;
}

public void setGasolina(boolean gasolina)
{
	this.gasolina = gasolina;
}





}