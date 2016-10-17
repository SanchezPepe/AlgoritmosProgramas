package Examen2;

import java.util.Scanner;

public class Ej32 {
	//Compañia llantas
	private Ej3 llantas[];
	private final int MAX = 10;
	private int tLlantas = 0;
	
	public Ej3[] getLlantas() {
		return llantas;
	}

	public int gettLlantas() {
		return tLlantas;
	}

	public Ej32(){
		llantas = new Ej3[MAX];
	}
	
	public void altaLlanta(Ej3 nuevo){
		if(tLlantas <= llantas.length){
			llantas[tLlantas] = nuevo;
			tLlantas++;
		}
	}
	
	public double costoLlanta(int llanta, int prod){
		double costo;
		costo = llantas[llanta].getCosto() * prod;
		return costo;
	}
	
	public double costoTodas(){
		Scanner lee = new Scanner(System.in);
		int i, prod;
		double costo = 0, costoT = 0;
		for(i = 0; i < tLlantas; i++){
			System.out.print("Ingrese la producción total de la llanta " + llantas[i].getModelo() + " : ");
			prod = lee.nextInt();
			costo = costoLlanta(llantas[i].getModelo(), prod);
			costoT = costoT + costo;
		}
		return costoT;
	}
	
}