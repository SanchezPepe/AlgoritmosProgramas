package general;

public class Edad {
	public static String a;
	private char dia;
	private char mes;
	private char a�o1;
	private char a�o2;
			
	public Edad(String a){
		this.a = a;
	}
	
	public Edad(char dia, char mes, char a�o1, char a�o2){
		this.dia = a.charAt(9);
		this.mes = a.charAt(7);
		this.a�o1 = a.charAt(4);
		this.a�o2 = a.charAt(5);
	}
	
	public String toString() {
		return "Fecha de nacimiento:" + "\nA�o: " + a�o1 + a�o2 + "\nMes: " + mes + "\nD�a: " + dia;
	}

}