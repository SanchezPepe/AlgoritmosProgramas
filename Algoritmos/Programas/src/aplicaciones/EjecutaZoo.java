package aplicaciones;

import java.util.Arrays;

import general.Zoologico;

public class EjecutaZoo {

	public static void main(String[] args) {
		Zoologico nuevo = new Zoologico();
		nuevo.altaAnimales("Perro", "Europeo", 9);
		nuevo.altaAnimales("Delfin", "Asiatico", 10);
		nuevo.altaAnimales("Delfin", "Asiatico", 10);
		nuevo.altaAnimales("Delfin", "Asiatico", 10);
		nuevo.altaAnimales("Delfin", "Asiatico", 10);
		
		String raza ="Asiatico";
		
		System.out.println("Promedio de todas edades: " + nuevo.promEdad());
		

		System.out.println("\nAnimales de raza " + raza + ": " + nuevo.cuantosRaza(raza));
	}
}
