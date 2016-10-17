package general;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		StringBuilder cad = new StringBuilder();
		Scanner lee = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++){
			System.out.print("Ingresa cadena: ");
			String lel = lee.nextLine();
			cad.append(" " + lel);	
		}
		
		System.out.print("\n" + cad);
	}

}
