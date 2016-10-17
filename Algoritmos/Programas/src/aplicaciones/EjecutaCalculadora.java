package aplicaciones;

import general.Calculadora;

public class EjecutaCalculadora {

	public static void main(String[] args) {
			
			int f, resMCD;
			f = Calculadora.calFactorial(9);
			resMCD = Calculadora.MCD(12, 4);
			System.out.println("\nEl factorial es: " + f);
			System.out.println("\nEl máximo común divisor es: " + resMCD);
		}	
	}