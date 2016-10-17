import general.LIO;
import general.MAG;

public class Zoo {
	
	private String nom, direc;
	private LIO <Animal> anim;
	private Patrocinador[] patro;
	private int totalP;
	private final int MAX = 100;
	
	public Zoo(){
		anim = new LIO <Animal>();
		patro = new Patrocinador[MAX];
		totalP = 0;
	}

	public Zoo(String nom, String direc, Patrocinador[] patro, int totalP) {
		super();
		this.nom = nom;
		this.direc = direc;
		this.patro = patro;
		this.totalP = totalP;
	}
	
	public boolean altaAnimal(int clave, String nom){
		Animal a = new Animal(clave, nom);
		return anim.add(a);
	}
	
	public boolean altaPatro(int clave, String nom){
		boolean resp = false;
		if(totalP < patro.length){
			Patrocinador p1 = new Patrocinador(clave, nom);
			int pos;
			pos = MAG.busqSec(patro, totalP, p1);
			if(pos < 0){
				resp = true;
				patro[totalP] = p1;
				totalP++;
			}
		}
	}
	
	public double calMontoPeriodo(String per) {
		double total = 0;
		int i;
		for(i = 0; i < totalP; i++)
			if(patro[i].getPeriodicidad().equalsIgnoreCase(per))
				total = total + patro[i].getMonto();
		return total;
	}
	
	public int cuentaPorEspecie(String esp){
		int cont = 0, tam = anim.size(), i;
		for(i = 0; i < tam; i++)
			if(anim.get(i).getEspecie().equalsIgnoreCase(esp))
				cont++;
		return cont;
	}
	
	public boolean detPatroc(int min){
		boolean resp;
		int cont = 0, i = 0;
		while(i < totalP && cont < min){
			if(patro[i].getPeriodicidad().equalsIgnoreCase("otra"))
				cont++;
		i++;
		}
		resp = cont == min;
		return resp;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		int i;
		
		cad.append(nom);
		cad.append(anim.toString());
		cad.append("\nLIsta de patrocinadores");
		for(i = 0; i < totalP; i++)
			cad.append(patro[i]);
		return cad.toString();
	}
	
	
}
