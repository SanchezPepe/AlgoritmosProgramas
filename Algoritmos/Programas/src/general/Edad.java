package general;

public class Edad {
	public static String a;
	private char dia;
	private char mes;
	private char año1;
	private char año2;
			
	public Edad(String a){
		this.a = a;
	}
	
	public Edad(char dia, char mes, char año1, char año2){
		this.dia = a.charAt(9);
		this.mes = a.charAt(7);
		this.año1 = a.charAt(4);
		this.año2 = a.charAt(5);
	}
	
	public String toString() {
		return "Fecha de nacimiento:" + "\nAño: " + año1 + año2 + "\nMes: " + mes + "\nDía: " + dia;
	}

}