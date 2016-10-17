package Examen2;

public class Ej3 {
	//Llanta
	private int modelo;
	double costo;
	
	public Ej3(){
	}
	
	public Ej3(int modelo, double costo){
		this.modelo = modelo;
		this.costo = costo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getModelo() {
		return modelo;
	}
}
