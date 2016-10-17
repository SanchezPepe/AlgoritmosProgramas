package general;

/*Jos� de Jes�s S�nchez Aguilar
 * CU: 156190
 * 
 * Definici�n de la clase Materia.
 */

import java.awt.Color;

public class Materia {
	
	private String nom;
	private static int clave = 100;
	private LID <Double> califM;
	private int claveU;
	private double prom;
	
	/*CONSTRUCTORES*/
	public Materia(){
		califM = new LID <Double>();
		claveU = this.clave++;	
	}
	
	public Materia(String nom){
		this();
		this.nom = nom;
		this.prom = 0;
	}

	/*FUNCIONALIDAD MINIMA*/
	public String getNom() {
		return nom;
	}

	public int getClaveU() {
		return claveU;
	}
	
	public double getProm() {
		return prom;
	}

	public LID<Double> getCalifM() {
		return califM;
	}
	
	public String toString() {
		String cal = this.nom + " (Clave: " + this.claveU + ")";
		return cal;
	}
	
	public int compareTo(Materia otra){
		return this.clave - otra.clave;
	}
	
	public boolean equals(Materia otra){
		Materia una = (Materia) otra;
		return clave == una.clave;
	}
	
	/*M�TODO QUE IMPRIME LAS CALIFICACIONES REGISTRADAS, EL PROMEDIO Y UN
	 * MENSAJE ADECUADO AL PROMEDIO CALCULADO*/
	public String desglosar(){
		String desglose;
		String cad = "Todo en orden, vas bien!";
		if(prom >= 6 && prom < 7.5)
			cad = "Puedes esforzarte m�s!";
		if(prom >= 0 && prom < 6)
			cad = "Al momento est�s reprobado";
		if(prom == 0)
			cad = "No tienes calificaciones registradas";
		desglose = this.nom + ":" + "\n" + califM.toString() + "\nPromedio: " + prom + "\n"+ cad;
		return desglose;
	}

	/*M�TODO ALMACENA UNA CALIFICACI�N  Y RECALCULA EL PROMEDIO*/
	public boolean altaCal(double cal){
		boolean resp = false;
		int tam = califM.size();
		califM.addLast(cal);
		if(califM.size() > tam){
			resp = true;
			promParcial();
		}	
		return resp;
	}
	
	/*M�TODO QUE CALCULA EL PROMEDIO DE LA MATERIA */
	public double promParcial(){
		double sum = 0;
		int tam = califM.size();
		if(califM.size() != 0){
			for(int i = 0; i < tam; i++)
			sum = sum + califM.get(i);
		}	
		return this.prom = sum / tam;
	}
	
	/*M�TODO QUE BORRA UNA CALIFICACI�N ALMACENADA Y RECALCULA EL PROMEDIO*/
	public boolean elimCalif(int parcial){
		boolean resp = false;
		int tam = califM.size();
		califM.remove(parcial-1);
		if(califM.size() < tam){
			resp = true;
			promParcial();
		}	
		return resp;
	}
}
