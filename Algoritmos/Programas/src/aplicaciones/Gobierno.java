package aplicaciones;

import general.OficinaGob;

public class Gobierno {

	public static void main(String[] args) {
		double prom;
		OficinaGob oG = new OficinaGob();
		oG.altaDatos("Michoacán", 1209871);
		oG.altaDatos("Coahuila", 3420123);
		oG.altaDatos("Yucatán", 4429123);
		oG.altaDatos("Zacatecas", 6234457);
		
		
		prom = oG.calPromHab();
		
		System.out.println("\nPromedio habitantes: " + prom);
		
		System.out.println("\nEstado con mayor habitantes: " + oG.estadoMp());
		                                                                                                                     
		System.out.println("\nTotal estados con pob < prom: " + oG.edPobMenorProm(prom));
	}

}
