package general;

public class Tarjeta {
	private int numTC, cat, numCta, a�oA, a�oV, nip;
	private static int serie = 1000;
	private String tipo;
	private double limite, saldo;

	public Tarjeta(int numTC, String tipo, int cat, int a�oA){
		this.numTC = numTC;
		this.tipo = tipo;
		this.cat = cat;
		this.a�oA = a�oA;
		serie = serie + 1;
		this.a�oV = a�oV + 5;
		
		switch (cat){
			case 0: limite = 20000;
				break;
			case 1: limite = 30000;
				break;
			case 2: limite = 50000;
				break;
			default: limite = 0;
		}
		saldo = 0;
	}
	
	public int getCat() {
		return cat;
	}

	public void setCat(int cat) {
		this.cat = cat;
	}

	public int getA�oV() {
		return a�oV;
	}

	public void setA�oV(int a�oV) {
		this.a�oV = a�oV;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumTC() {
		return numTC;
	}

	public int getNumCta() {
		return numCta;
	}

	public int getA�oA() {
		return a�oA;
	}

	public static int getSerie() {
		return serie;
	}

	public String getTipo() {
		return tipo;
	}

	public double getLimite() {
		return limite;
	}

	public int compareTo(Tarjeta otra){
		return numCta - otra.numCta;
	}
	
	public String toString(){
		return "Num cta: " + numCta + " Num TC: " + numTC;
	}
	
	public void activaTarj(int nip){
		this.nip = nip;
	}
	
	public double calCredDis(){
		return limite - saldo;
	}
	
	public double calComision(){
		double comision;
		comision = 0;
		
		if(tipo.equals("titular"))
			if(cat == 2)
			comision = limite * 0.001;	
			else
			comision = limite * 0.005;
		else
			switch (cat){
			case 0: comision = limite * 0.005;
				break;
			case 1: comision = limite * 0.002;
				break;
			case 2: comision = limite * 0.0001;
			}
		return comision;
	}	
}
