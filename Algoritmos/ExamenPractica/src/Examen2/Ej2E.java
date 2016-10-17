package Examen2;

public class Ej2E {

	public static void main(String[] args) {
		int res;
		double res2;
		double ventas [] = {1,1,1,1,1,1,1,1,1,1,1,2};
		
		res = Ej2.mesMayor(ventas);
		System.out.print("Mes con mayor venta: " + res);
		
		res2 = Ej2.ventasMax(ventas);
		System.out.print("\nMayor venta: " + res2);

		res2 = Ej2.sumaVentas(ventas);
		System.out.print("\nTotal ventas: " + res2);
		
		res2 = Ej2.promVentas(ventas);
		System.out.print("\nPromedio ventas: " + res2);
	}

}
