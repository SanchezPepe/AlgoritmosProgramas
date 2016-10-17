package general;

public class Compania {
	
	private String nom, dir, cd, direc;
	private int [] ventas;
	private int TOTAL_MESES = 12;
	private int tMes;
	
	public Compania(){
		ventas = new int [TOTAL_MESES];
		tMes = 0;
	}
	
	public Compania(String nom, String dir, String cd, String direc){
		this();
		this.nom = nom;
	}
	
	public double calProm(){
		return ManArreglos.promArreglo(ventas, tMes);
	}
	
	public double obtMesMas(){
		return ManArreglos.elemMayor(ventas, tMes) + 1;
	}
	
	public double obtMesMenos(){
		return ManArreglos.elemMenor(ventas, tMes) + 1;
	}
	
	public double obtMesesSupProm(){
		int valor;
		valor = (int) ManArreglos.promArreglo(ventas, tMes);
		return ManArreglos.elemsMay(ventas, valor, tMes);
	}
	
	public double calTotal(){
		return ManArreglos.sumaArreglo(ventas, tMes);
	}
	
	public boolean altaVenta(int ven){
		boolean resp = false;
		if(tMes < ventas.length){
			ventas [tMes] = ven;
			tMes = tMes + 1;
			resp = true;
		}
		return resp;
	}
	
}
