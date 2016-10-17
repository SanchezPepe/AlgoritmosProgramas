package Lab1;

public class Ejecuta {

	public static void main(String[] args) {
		int var = 3;
		Pago ma = new Pago(0, 100, "TD");
		ma.IVA();
		System.out.print(ma.montoPagar("Si"));
	}

}
