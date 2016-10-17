package aplicaciones;

import general.AgenciaA;

public class EjecAA {

	public static void main(String[] args) {
		AgenciaA autos = new AgenciaA();
		
		autos.altaMarca("FORD");
		autos.altaMarca("NISSAN");
		autos.altaMarca("VW");

		autos.altaAuto(100, "rojo", 75231.1);
		autos.altaAuto(145, "verde", 45651.1);
		autos.altaAuto(179, "negro", 87451.1);
		
		System.out.print(autos);
		System.out.print("Auto más caro: " + autos.consMasCaro());
		System.out.print("Total FORD'S: " + autos.consPorMarca("FORD"));

		autos.ventaAuto(100);
		autos.bajaMarca("NISSAN");
		
		System.out.print(autos);
		
		
	}

}
