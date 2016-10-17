package Examen;

public class Inmueble {
	//Jose de Jesus Sanchez Aguilar 156190
	private double meConst, meTerr, meJardin;
	private int añoC, numCasa;
	private static int numU = 1000;
	private String nombreP;
	private char tipoC;
	private boolean alberca;
	
	public Inmueble(String nombreP, double meConst, double meTerr, double meJardin, int añoC, char tipoC, boolean alberca){
		this.numU = this.numU +1;
		this.numCasa = this.numU;
		this.nombreP = nombreP;
		this.meConst = meConst;
		this.meJardin = meJardin;
		this.meTerr = meTerr;
		this.añoC = añoC;
		this.tipoC = tipoC;
		this.alberca = alberca;
		this.numCasa = numCasa;
	}

	public double getMeConst() {
		return meConst;
	}

	public void setMeConst(double meConst) {
		this.meConst = meConst;
	}

	public double getMeJardin() {
		return meJardin;
	}

	public void setMeJardin(double meJardin) {
		this.meJardin = meJardin;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public double getMeTerr() {
		return meTerr;
	}

	public int getAñoC() {
		return añoC;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public static int getNumU() {
		return numU;
	}

	public char getTipoC() {
		return tipoC;
	}

	public boolean Alberca() {
		return alberca;
	}
	
	public String toString() {
		return "Inmueble M2 Const= " + this.meConst + ", M2 Terr=" + this.meTerr
				+ ", M2 Jardin=" + this.meJardin + ", Año de construcción= " + this.añoC + ", NumCasa= "
				+ this.numCasa + ", Propietario= " + this.nombreP + ", tipo de casa= " + this.tipoC
				+ ", alberca= " + this.alberca + ".";
	}

	public int compareTo(Inmueble otroInmueble){
		int resp = 0;
		if(this.numCasa == otroInmueble.getNumCasa())
			resp = 1;
		return resp;
	}
	
	public double calcPre(){
		double porc = 0, costo = 0, pAlb = 1;
			if(this.añoC >= 2010 && this.meConst > 400)
				porc = 1.05;
			else
				if (this.añoC < 2010 && this.meConst > 400)
					porc = 1.035;
				else
					porc = 1.0;
			
			if (this.alberca = true)
					pAlb = 1.01;
	
		switch(this.tipoC){
			case 'L': costo = 202 * this.meConst *  porc * pAlb;
				break;
			case 'M': costo = 96 * this.meConst * porc * pAlb;
				break;
			case 'E': costo = 22 * this.meConst * porc * pAlb;
			}
		return costo;
	}
	
	public String detCat(){
		String cat;
		cat = "No es popular";
		if(this.tipoC == 'E' && this.meJardin == 0 && this.alberca == false && this.meConst < 60)
			cat = "Es popular";
		return cat;
	}
}
