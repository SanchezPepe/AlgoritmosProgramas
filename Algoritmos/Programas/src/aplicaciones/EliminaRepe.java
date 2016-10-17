package aplicaciones;

import general.ManArreglos;

import java.io.File;
import java.util.Scanner;

public class EliminaRepe {

	public static void main(String[] args) {
		int claves[];
		int n;
		Scanner lee = new Scanner(System.in);
		
		do{
			System.out.println("\nTotal de claves: ");
			n = lee.nextInt();
		} while(n <= 0);
		
		claves = leeDatos(n);
		ManArreglos.ordenInt(claves);
		n = eliminaRep(claves, n);
		System.out.print("\ngfdf" + generaCad(claves, n));
		}

	public static int [] leeDatos(int n){
		int [] datos = new int [n];
		try{
			Scanner lee = new Scanner(new File ("Claves.txt"));
			int i = 0, cl;
			while(i<n && lee.hasNext()){
				cl = lee.nextInt();
				datos[i] = cl;
				i++;
			}
			lee.close();
			return datos;
		} catch (Exception e){
			System.out.print("\n No se realizó: ");
			System.exit(-1);
		}
		return datos;
	}
}
