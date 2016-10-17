package aplicaciones;

import java.util.Scanner;

import general.Rectangulo;

public class EjemRec {

	public static void main(String[] args) {
		Scanner lee = new Scanner (System.in);
		double ld1, ld2, area, per;
		
		System.out.print("\nDame los lados del piso "); 
		ld1= lee.nextDouble();
		ld2= lee.nextDouble();
		
		Rectangulo piso = new Rectangulo (ld1,ld2);
		area=piso.calArea();
		per= piso.calPer();
		
		System.out.print("\nArea del piso: "+area);
		System.out.print("\nPerímetro del piso: "+per);
		// TODO Auto-generated method stub

	}

}
