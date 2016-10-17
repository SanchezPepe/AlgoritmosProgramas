package aplicaciones;

import general.CuentaBancaria;

public class EjecutableBanco {

	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria("Jose", 3000);
		CuentaBancaria c2 = new CuentaBancaria("Juana");
		
		c2.depositar(4000);
		if(c2.depositar(4000))
			System.out.print("Deposito exitoso");
		else
			System.out.print("Fall� deposito");
		
		if(c1.retirar(10000))
			System.out.print("Se retir�, y su saldo actual es: " + c1.getSaldo());
		else
			System.out.print("No se puede realizar");
		
		c2.depositar(1000);
		if(c2.depositar(1000))
			System.out.print("Dep�sito exitoso");
		else
			System.out.print("Fall� dep�sito");
		
		if(c1.depositar(1000))
			System.out.print("Se retir� y su saldo actual es: " + c1.getSaldo());
		else
			System.out.print("No se puede realizar");
	}

}
