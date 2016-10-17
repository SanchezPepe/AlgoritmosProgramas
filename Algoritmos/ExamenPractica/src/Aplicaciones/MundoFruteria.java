package Aplicaciones;
import General.Fruta;

public class MundoFruteria {

	public static void main(String[] args) {
		double venta1, venta2, costo1, costo2;
		
		Fruta Fruta1 = new Fruta ("Manzana", "Roja", "Campeche", 14.50);
		Fruta Fruta2 = new Fruta ("Plátano", "Amarillo", "Veracruz", 6.85);
		
		venta1 = 8500/14.50;
		venta2 = 8500/6.85;
		
		costo1 = Fruta1.calcCosto(venta1);
		costo2= Fruta2.calcCosto(venta2);
		
		System.out.print("Descuento de Manzanas: " + Fruta1.calcDesc(costo1));
		System.out.println("\nDescuento de Platanos: " + Fruta2.calcDesc(costo2));
		
		System.out.println("\nCosto de Manzanas: " + Fruta1.calcCosto(122));
		System.out.println("Costo de Platanos: " + Fruta2.calcCosto(122));
		
		System.out.println(Fruta1.toString());
		System.out.print(Fruta2.toString());
		

		System.out.println("\nLa fruta que se registró primero fue: " + Fruta1.compareTo(Fruta2));
	
	}

}
