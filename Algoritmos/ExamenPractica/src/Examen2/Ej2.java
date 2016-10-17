package Examen2;

public class Ej2 {
	
	//Función que determina el mes con mayor venta
	public static int mesMayor(double arre[]){
		int i, pos = 0;
		double max = 0;
		for(i = 0; i < arre.length; i++)
			if(arre[i] > max){
				max = arre[i];
				pos = i + 1;
			}	
		return pos;
	}
	
	public static double ventasMax(double arre[]){
		int i;
		double max = 0;
		for(i = 0; i < arre.length; i++)
			if(arre[i] > max){
				max = arre[i];
			}
		return max;
	}
	
	public static double sumaVentas(double arre[]){
		double suma = 0;
		for(int i = 0; i < arre.length; i++)
			suma = suma + arre[i];
		return suma;
	}
	
	public static double promVentas(double arre[]){
		double prom;
		prom = sumaVentas(arre)/arre.length;
		return prom;
	}
}
