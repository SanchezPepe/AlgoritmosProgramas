package general;

public class Alumno implements Comparable <Alumno> {
    
    private String nom; 
    private double calif[];
    private int tC;
    private final int MAX = 15;
    
    public Alumno(){
    	calif = new double[MAX];
    }
    
    public Alumno(int cU){
    	this();
    }
    
    public Alumno(String nom){
    	this.nom = nom;
    }
 
	public double[] getCalif() {
		return calif;
	}

	public boolean altaCalif(double cal){
		boolean resp = false;
		if(calif.length > tC){
			resp = true;
			calif[tC] = cal;
			tC++;
		}
		return resp;
	}
	
	public double calculaProm(){
    	double prom, suma = 0;
    	int i, cont = 0;
    	for(i = 0; i < this.calif.length; i++){
    		suma = suma + this.calif[i];
    		cont++;
    	}
    	prom = suma/cont;
    	return prom;
    }

	@Override
	public int compareTo(Alumno arg0) {
		return 0;
	}
	
	public boolean equals(Object otro){
		Alumno a = (Alumno) otro;
		return false;
	}
	
	
}
