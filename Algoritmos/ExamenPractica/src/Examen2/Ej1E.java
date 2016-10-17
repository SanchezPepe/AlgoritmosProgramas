package Examen2;

public class Ej1E {

	public static void main(String[] args) {
		
		int m = 2, n = 3, o = 4;
		
		Ej1 x = new Ej1(m);
		Ej1 y = new Ej1(n);
		Ej1 z = new Ej1(o);
		
		x.leeDatos();
		x.imprimeArre();
		x.sumaElem();
		
		y.leeDatos();
		y.imprimeArre();
		y.sumaElem();
		
		z.leeDatos();
		z.imprimeArre();
		z.sumaElem();

	}

}
