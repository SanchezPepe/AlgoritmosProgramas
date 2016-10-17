package general;

public class Seminario {
	
	private String nom, fecha;
	private LIO<String> asist;
	
	public Seminario(){
		asist = new LIO <String>();
	}
	
	public Seminario(String nom, String fecha){
		this();
		this.nom = nom;
		this.fecha = fecha;
	}
	
	public String generaRep(){
		return "\nLista de Asistentes: " + asist.toString();
	}
	
	public boolean agregaAsist(String nuevo){
		return asist.add(nuevo);
	}
	
	public boolean consAsist(String nom){
		return asist.contains(nom);
	}
	
	public boolean eliminaAsist(String nom){
		return asist.remove(nom);
	}

}
