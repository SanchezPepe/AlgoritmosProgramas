package aplicaciones;

import java.util.Scanner;

public class Escuela {
	// Dato: n1, c1, c2... cn		n>0
	// Rtdo: promedio, total de cal > prom, total del cal <= prom
	
	// Métodos estáticos:
	public static int leeTam(int lSup, int lInf, Scanner lee){
		int tam;
		do{
			System.out.print("Total elementos: ");
			tam = lee.nextInt(); 
		} while (tam <= lInf || tam > lSup);
		return tam;
	}	
	
	public static void main(String[] args) {
		final int TOTAL_AL = 50;
		double prom;
		double [] cal = new double [TOTAL_AL];
		int n;
		Scanner lee = new Scanner(System.in);
		n = leeTam(TOTAL_AL, 0, lee);
		leeDatos(lee, n, cal);
		prom = calProm(cal, n);
		
		System.out.print("\nPromedio: " + prom);
		System.out.print("\nPromediofsd: " + cuentaMayorQue(prom, cal, n));
		System.out.print("\nPromedfdiofsd: " + cuentaMenorIgual(prom, cal, n));
	}
	
	public static int cuentaMayorQue(double val, double []arreglo, int tam){
		int i, cont = 0;
		for(i = 0; i < tam; i++)
			if(arreglo[i] > val)
				cont = cont + 1;
		return cont;
	}
	
	public static int cuentaMenorIgual(double val, double []arreglo, int tam){
		int i, cont = 0;
		for(i = 0; i < tam; i++)
			if(arreglo[i] <= val)
				cont = cont + 1;
		return cont;
	}
	
	public static double calProm(double arre[], int tam){
		double suma, prom;
		int i;
		suma = 0;
		for(i = 0; i < tam; i++)
			suma = suma + arre[i];
		prom = suma / tam;
		return prom;
	}
	
	//Método que guarda en el arreglo
	
	public static void leeDatos(Scanner lee, int tam, double [] arreglo){
		int i;
		for(i = 0; i < tam; i++){
			System.out.print("Dame un dato: ");
			arreglo[i] = lee.nextDouble();
		}
	}
}	

