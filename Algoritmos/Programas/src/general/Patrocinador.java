
public class Patrocinador {
	private int claveP;
	private String nom;
	private String periodicidad;
	private double monto;
	
	public Patrocinador(){
	}
	
	public Patrocinador(int claveP, String nom) {
		super();
		this.claveP = claveP;
		this.nom = nom;
		this.periodicidad = periodicidad;
		this.monto = monto;
	}

	public int getClaveP() {
		return claveP;
	}

	public void setClaveP(int claveP) {
		this.claveP = claveP;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getNom() {
		return nom;
	}
	
	

}
