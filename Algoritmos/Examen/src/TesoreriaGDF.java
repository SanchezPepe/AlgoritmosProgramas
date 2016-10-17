
public class TesoreriaGDF {

	public static void main(String[] args) {
		//Jose de Jesus Sanchez Aguilar 156190
		double predial1, predial2, nvoC;
		String cat3;
		Inmueble Inmueble1 = new Inmueble ("Alicia Juarez", 650, 1100, 450, 1995,'L', true);
		Inmueble Inmueble2 = new Inmueble ("José García", 450, 600, 150, 2000, 'M', false);
		Inmueble Inmueble3 = new Inmueble ("Delia Buendia", 53, 53, 0, 2012, 'E', false);
		
		predial1 = Inmueble1.calcPre();
		predial2 = Inmueble2.calcPre();
		
		System.out.print("El predial de Alicia Juarez es: " + predial1);
		System.out.println ("\nEl predial de José García es: " + predial2);
		
		System.out.println("El propietario de la segunda casa es: " + Inmueble2.getNombreP());
		
		Inmueble2.setMeConst(500);
		
		cat3 = Inmueble3.detCat();
		
		System.out.println("El tercer inmueble: " + cat3);
		
		System.out.println(Inmueble1.toString());
		
		
		
	}

}
