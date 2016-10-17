package general;

public class OficinaGob {
	private int[] hab;
	private String [] nom;
	private int tE = 0;
	private final int TOTAL = 50;
	private String tel, nResp;
	
	public OficinaGob(){
		hab = new int [TOTAL];
		nom = new String [TOTAL];	
	}
	
/*	public String toString(){
		StringBuilder cad = new StringBuilder();
		int i;
		cad.append("\nNombre del encargado: " + nResp);
		for(i = 0; i < tE; i++);
			cad.append("\n" + nom[i]).append(": " + hab [i]);
		return cad.toString();
	}
*/
	
	public String estadoMp(){
		int pos;
		pos = ManArreglos.elemMayor(hab, tE);
		return nom[pos];
	}
	
	public double calPromHab(){
		return ManArreglos.promArreglo(hab, tE);
	}
	
	public int edPobMenorProm(double prom){
		int valor = (int) prom;
		return ManArreglos.elemsMen(hab, valor, tE);
	}
	
	public void altaDatos(String nE, int pE){
		if(tE < hab.length){
			nom[tE] = nE;
			hab[tE] = pE;
			tE = tE + 1;
			}
		}
		
}
