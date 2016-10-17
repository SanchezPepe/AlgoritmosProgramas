package aplicaciones;

import java.util.Scanner;

import general.Tarjeta;

public class CreaTarjeta {

	public static void main(String[] args) {
		Tarjeta t1 = new Tarjeta(100, "titular", 0, 2014);
		Tarjeta t2 = new Tarjeta(101, "titular", 1, 2015);
		Scanner lee = new Scanner(System.in);
		int nip;
		System.out.println("Ingresa tu nip: ");
		nip = lee.nextInt();
		t1.activaTarj(nip);
		
		System.out.println("\nDatos tajeta 1: " + t1.toString());
		System.out.print("Comision: " + t1.calComision());
		
		System.out.println("\nDatos tajeta 2: " + t2.toString());
		System.out.print("Comision: " + t2.calComision());
	}

}
