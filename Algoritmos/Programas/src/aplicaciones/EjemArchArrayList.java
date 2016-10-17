package aplicaciones;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class EjemArchArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> arre = new ArrayList();
		try{
			Scanner lee = new Scanner(new File("Datos"));
			while(lee.hasNext())
				arre.add(lee.nextInt());
			lee.close();
			prueba(arre);	
		} catch(Exception e) {
			System.out.print("\nNo se pudo abrir el archivo");
			System.exit(-1);
		}
	}
	
	public static void prueba(ArrayList <Integer> arre) {
		System.out.print("\n P1: " + arre);
		arre.add(19);
		arre.add(0,25);
		System.out.print("\n P2: " + arre);
		if (arre.contains(15))
			System.out.print ("\nP3: el 15 si está");
		else
			System.out.print ("\nP3: el 15 no está");
		
		System.out.print ("\nP4: " + arre.indexOf(20));
		System.out.print ("\nP5: " + arre.indexOf(20));
		System.out.print ("\nP5: " + arre.indexOf(20));
		
		
	}

}
