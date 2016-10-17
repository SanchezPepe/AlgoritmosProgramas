package aplicaciones;

import java.util.Scanner;

public class EjCompania {

	public static void main(String[] args) {
		Scanner lee = new Scanner (System.in);
		Compania una = new Compania(//Parametros constructor)
			int i, v;
		for (i=1; i<=12, i ++){
			System.out.print("TYOgklsfasjl");
			v = lee.nextInt();
			una.altaVentas(v);
		}
		
		System.out.print ("\nPromedio" + una.calProm());
		

	}

}
