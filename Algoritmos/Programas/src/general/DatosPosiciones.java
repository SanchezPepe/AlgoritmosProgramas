package general;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DatosPosiciones {
	
	public static void main(String[] args) {
		double[] arre = new double[10];
		try{
			int i=0;
			
			Scanner lee = new Scanner(new File("Datos2"));
			while(i < arre.length && lee.hasNext()){
				arre[i]=lee.nextDouble();
				i = i + 1;
			}
			lee.close();
			System.out.print("Arreglo: " + datosPosiciones(arre, 2));
		} catch(Exception e) {
			System.out.print("\nNo se pudo abrir el archivo");
			System.exit(-1);
		}
	}
	
	public static ArrayList<Double> datosPosiciones(double arre[], int x){
	//Declara y construye	
	ArrayList<Double> lista = new ArrayList();
		for(int i = 0; i < arre.length; i++)
			if(i % x == 0)
			/*for(i=x; i<lista.length; i=i+x;
			 	lista.add(arre[i]);*/	
				lista.add(arre[i]);
		return lista;

	}
	
	
}