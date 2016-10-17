package aplicaciones;

import java.util.Scanner;

import general.Circulo;

public class EjemCir {

	public static void main(String[] args) {
		Scanner lee= new Scanner (System.in);
		double r,area,per;
		
		System.out.println("\nDame el radio de la mesa "); 
		r= lee.nextDouble();
		
		Circulo mesa = new Circulo (r);
		area=mesa.calArea();
		per=mesa.calPer();
		System.out.print("\nArea de la mesa: "+area);
		System.out.print("\nPerímetro de la mesa: "+per);
		}
		// TODO Auto-generated method stub

	}

