package es.studium.ejercicio12;

public class Cuenta
{

	private int numerocuenta;
	private int saldo;
	private Cliente cliente;

	public Cuenta()
	{
		numerocuenta = 0;
		saldo = 0;
		cliente = new Cliente();

	}

	public Cuenta(int numerocuenta, int saldo, Cliente cliente)
	{
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumerocuenta()
	{
		return numerocuenta;
	}

	public void setNumerocuenta(int numerocuenta)
	{
		this.numerocuenta = numerocuenta;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}
