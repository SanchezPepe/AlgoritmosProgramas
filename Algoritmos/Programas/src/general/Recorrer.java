package general;

import java.util.Arrays;

public class Recorrer {

	public static void main(String[] args){
		int arre[] = new int[] {1,2,3,4,5,6,7,8};
		int tam = arre.length;
		int kLug = 3;
		
		System.out.println("Array original: " + "\n" + Arrays.toString(arre));
		
		ManArreglos.mueveDer(arre, tam, kLug);
		
		System.out.println("\nArreglo derecha: " + "\n" + Arrays.toString(arre));
		
		ManArreglos.mueveIzq(arre, tam, kLug);
		ManArreglos.mueveIzq(arre, tam, kLug);
		
		System.out.println("\nArreglo izquierda: " + "\n" + Arrays.toString(arre));

	}
}
