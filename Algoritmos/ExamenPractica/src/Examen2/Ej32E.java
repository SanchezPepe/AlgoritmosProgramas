package Examen2;

import java.util.Arrays;

public class Ej32E {
	
	public static void main(String[] args){
		
		Ej3 llanta1 = new Ej3(0, 12.05);
		Ej3 llanta2 = new Ej3(1, 10.35);
		Ej3 llanta3 = new Ej3(2, 11.65);
		
		Ej32 llantera = new Ej32();
		
		llantera.altaLlanta(llanta1);
		llantera.altaLlanta(llanta2);
		llantera.altaLlanta(llanta3);
		
		System.out.print("Costo de producción total de todos los neumaticos: " + llantera.costoTodas());
	}
	
}	

