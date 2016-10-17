
public class Animal {
	
	private int claveA;
	private String nom, especie, info;
	
	public Animal(){
	}
	
	public Animal(int claveA, String nom) {
		super();
		this.claveA = claveA;
		this.nom = nom;
		this.especie = especie;
		this.info = info;
	}

	public int getClaveA() {
		return claveA;
	}

	public void setClaveA(int claveA) {
		this.claveA = claveA;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public int compareTo(Animal otro){
		return this.claveA - otro.getClaveA();
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
