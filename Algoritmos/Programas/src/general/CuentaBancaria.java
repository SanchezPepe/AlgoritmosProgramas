package general;

public class CuentaBancaria {
	
	private String nom;
	private double saldo;
	private static int serie = 0;
	private int numCta;	
	
	public CuentaBancaria(String nom){
		this.nom = nom;
		serie = serie + 1;
		numCta = serie;
		saldo = 0;
	}
	
	public CuentaBancaria(String nom, double saldo){
		this.nom = nom;
		this.saldo = saldo;
		serie = serie +1;
		numCta = serie;
	}
	
	//FUNCIONALIDAD MINIMA
	
	public boolean depositar(double cant){
		boolean resp = false;
		if(cant>0){
			saldo = saldo + cant;
			resp = true;
		}
		return resp;
	}
	
	public boolean retirar(double cant){
		boolean resp = false;
		if(cant > 0 && cant <= saldo){
			saldo = saldo - cant;
			resp = true;
		}
		return resp;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNom() {
		return nom;
	}

	public int getNumCta() {
		return numCta;
	}

	public static int getSerie() {
		return serie;
	}
	
	
}

