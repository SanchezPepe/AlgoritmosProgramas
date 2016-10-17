package aplicaciones;

import java.util.Scanner;

import general.Rectangulo;

public class Fabrica {
	private String nomF,giro;
	public Fabrica(){}
	public Fabrica (String nom, String g){
		nomF=nom;
		giro= g;
	}
	public String getNomF(){
		return nomF;
	}
	public void setG(String nuevo){
		giro= nuevo;
	}
	public String toString(){
		return nomF+"dedicada a: "+giro;
	}
	public int calArec(int n,int m, double l1,double l2){
		Rectangulo pa�o= new Rectangulo(m,n);
		Rectangulo tapete=new Rectangulo(l1,l2);
		int total=(int)(pa�o.calArea()/tapete.calArea());
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee=new Scanner(System.in);
		Fabrica fab=new Fabrica();
	
		
	}

}
