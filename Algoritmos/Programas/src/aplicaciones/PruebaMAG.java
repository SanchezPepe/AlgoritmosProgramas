package aplicaciones;

import java.util.Arrays;

import general.MAG;

public class PruebaMAG {

	public static void main(String[] args) {
		
		String arre1[] = {"rojo","verde","azul"};
		Double arre2[] = {6.5,5.8,4.3,1.2,-2.0};
		
		System.out.print(Arrays.toString(arre1));
		
		MAG.elimOrdenado(arre1, arre1.length, "azul");
		
		System.out.print(Arrays.toString(arre1));
		
		
	}

}
