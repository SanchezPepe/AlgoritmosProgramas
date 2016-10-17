package general;

public class SalonMateria {

	private int tAlum;
	private final int MAX = 30;
	private Estudiante salon [];
	
	public SalonMateria(){
	}
	
	public SalonMateria(Estudiante salon[], int tAlum){
		this.salon = salon;
		this.tAlum = tAlum;
	}
	
	
	//Método que calcula y regresa el promedio de un salon
	
	private double calcPromS(){
		double prom, suma = 0;
		int i;
		for(i = 0; i < tAlum; i++){
			suma = suma + salon[i].calculaPromedio();
		}
		prom = suma/tAlum;
		
		return prom;
	}
	
    public static void main(String[] args) {
    	double arre1[] = {10,10,10};
    	double arre2[] = {10,10,10};
    	
    	Estudiante e1 = new Estudiante(arre1, true, "Pablo");
    	Estudiante e2 = new Estudiante(arre2, true, "Raúl");
    	
    	Estudiante salon [] = {e1, e2};
   
    	SalonMateria Algoritmos = new SalonMateria(salon, 2);
    	System.out.print("Promedio salón: " + Algoritmos.calcPromS());
    }
}
