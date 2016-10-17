package aplicaciones;

import java.util.Scanner;

import general.Rectangulo;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner lee= new Scanner (System.in);
		double ld1,ld2, area, tarea=0;
		int n, i=1;
		System.out.print("¿Cuántas mesas son?");
		n=lee.nextInt();
			for (i=1;i<n;i++){
		System.out.print("¿Cuál es el lado de la mesa "+i+ " ?");
		ld1=lee.nextDouble();
		ld2=lee.nextDouble();
		
		Rectangulo mesa=new Rectangulo(ld1,ld2);
		area=mesa.calArea();
		tarea= area+tarea;
			}
		System.out.print("El espacio que ocupan las mesas es: "+tarea);
			
		// TODO Auto-generated method stub

	}

}
