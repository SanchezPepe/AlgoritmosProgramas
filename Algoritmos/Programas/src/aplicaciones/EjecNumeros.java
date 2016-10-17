package aplicaciones;

import general.NumerosReales;

public class EjecNumeros {

	public static void main(String[] args) {
		NumerosReales x = new NumerosReales();
		NumerosReales y = new NumerosReales();
		NumerosReales z = new NumerosReales();
		int tam = 2;
		
		x.leeDatos(tam);
		y.leeDatos(tam);
		z.leeDatos(tam);
		
		System.out.print(x);

	}

}
