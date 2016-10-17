package general;

import java.util.Arrays;

public class PruebasManejadorDeArreglos {

	public static void main(String[] args) {
		int res, res3, res4, res5, res6, res7, res9;
		boolean res8;
		double res2;
		int param = 5;
		int arre[] = new int[] {1,2,2,3,5,9,10};
		int tam = arre.length;
		
		res = ManArreglos.sumaArreglo(arre, tam);
		res2 = ManArreglos.promArreglo(arre, tam);
		res3 = ManArreglos.elemMayor(arre, tam);
		res4 = ManArreglos.elemMenor(arre, tam);
		res5 = ManArreglos.elemsMay(arre, param, tam);
		res6 = ManArreglos.elemsMen(arre, param, tam);
		res7 = ManArreglos.busqBin(arre, tam, 2);
		res8 = ManArreglos.encuentraDos(arre, tam, 2);
		
		System.out.println("Arreglo: " + Arrays.toString(arre));
		System.out.println("Tamaño del arreglo: " + tam);
		System.out.println("\nSuma: " + res);
		System.out.println("Promedio: " + res2);
		System.out.println("Posición elemento mayor: " + res3);
		System.out.println("Posición elemento menor: " + res4);
		System.out.println("Elementos mayores que " + param + " : " + res5);
		System.out.println("Elementos menores que " + param + " : " + res6);
		System.out.println("\nBusqueda Binaria: " + res7);
		System.out.println("\nDos numeros iguales: " + res8);
		
		ManArreglos.eliminaRepe(arre, tam);
		System.out.println("Eliminados los repetidos: " + Arrays.toString(arre));
		
	}

}
