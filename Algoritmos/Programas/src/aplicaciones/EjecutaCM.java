package aplicaciones;

import java.util.Scanner;

import general.Ejercicio8;

public class EjecutaCM {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.print("Números a comparar: ");
		int n1 = l.nextInt(), n2 = l.nextInt();
		Ejercicio8 objejer8= new Ejercicio8("Juan", " Cálculo");
		
	if(objejer8.eOc(n1, n2))
		System.out.print("Los números están ordenados");
	else System.out.print("No hay orden");
	
	System.out.print("Ingresa un número");
	double x=l.nextDouble(),y=objejer8.calFun(x);
	System.out.print("F1= "+y);
	y=objejer8.calFun2(n1);
	System.out.print("F2= "+y);
	}
}