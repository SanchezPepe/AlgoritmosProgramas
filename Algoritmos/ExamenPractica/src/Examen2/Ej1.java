package Examen2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
	
	private int arre [];
	private int tam;
	private final int MAX = 5;
	
	public Ej1(){
		arre = new int[MAX];
	}
	
	public Ej1(int tam){
		this();
		this.tam = tam;
	}
	
	public void leeDatos(){
		int i;
		@SuppressWarnings("resource")
		Scanner lee = new Scanner(System.in);
		for(i = 0; i < tam; i++){
			System.out.println("\nIngresa dato: ");
			arre[i] = lee.nextInt();
		}	
	}
	
	public int sumaElem(){
		int suma = 0, i;
		for(i = 0; i < tam; i++)
			suma = suma + arre[i];
		System.out.print("\nSuma de los elementos del arreglo: " + suma);
		return suma;
	}
	
	public void imprimeArre(){
		System.out.println("\n" + Arrays.toString(arre));
	}
}
