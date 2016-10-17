package aplicaciones;

import java.util.Scanner;
import general.Edad;

public class FechaDeNacimiento {

	public static void main(String[] args) {
		
		System.out.println("Ingrese su CURP: ");
		Scanner lee = new Scanner (System.in);
		Edad.a = lee.nextLine();
		Edad Edad1 = new Edad (Edad.a);
		System.out.print (Edad1.toString());
	}

}
