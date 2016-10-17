package Aplicaciones;

import java.util.Scanner;

import General.Pan;

public class EjecutablePanaderia {

	public static void main(String[] args) {
		int ingPan2, harPan2;
		double costo1, costo2, tiempoDonas, costoPan1;
		Pan Pan1 = new Pan("Dona", 35, 4, 2, 'r');
		
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese número de ingredientes del Ladrillo: ");
		ingPan2 = lee.nextInt();
		
		System.out.print("Ingrese el tipo de harina (Maiz 0, Integral 1 o Avena 2): ");
		harPan2 = lee.nextInt();
		
		Pan Pan2 = new Pan ("Ladrillo", 45, ingPan2, harPan2, 'c');
		Pan2.setNumIng(ingPan2);
		Pan2.setTipoHar(harPan2);
		
		costo1 = Pan1.calcCosto();
		costo2 = Pan2.calcCosto();
		
		System.out.println("\nEl costo de la Dona es : " + costo1);
		System.out.println("El costo del Ladrillo es : " + costo2);
		
		tiempoDonas = Pan1.calcTiempo(10);
		System.out.println("\nEl tiempo de horneado de 10 donas: " + tiempoDonas + " minutos");
		
		System.out.println("\n" + Pan1.toString());
		System.out.println("\n" + Pan2.toString());
		
		Pan1.setNumIng(6);
		
		System.out.println("\n" + Pan1.toString());
		
		costoPan1 = Pan1.calcCosto();
		
		System.out.println("\nNuevo costo de la dona: " + costoPan1);
	}

}
