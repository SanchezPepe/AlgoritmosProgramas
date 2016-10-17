package General;

import java.util.Scanner;

public class Fruta {
	
	public static int id = 2000;
	private String nombre;
	private String color;
	private String ciudad;
	private double precio;
	private int numero;
	
	public Fruta(int numero){
		id = id + 1;
		this.numero = id;
	}
	public Fruta(String nombre, String color, String ciudad, double precio){
		id = id + 1;
		this.numero = id;
		this.nombre = nombre;
		this.color = color;
		this.ciudad = ciudad;
		this.precio = precio;
	}

	public int getNumero(){
		return numero;
	}

	public String getNombre(){
		return nombre;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getCiudad(){
		return ciudad;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setCiudad(String otraCiudad){
		this.ciudad = otraCiudad;
	}
	
	public void setPrecio(double otroPrecio){
		this.precio = otroPrecio;
	}
	
	public int compareTo(Fruta otraFruta){
		int resp = otraFruta.getNumero();
		if (Fruta.this.numero < otraFruta.getNumero())
			resp = Fruta.this.numero;
		return resp;
	}
	
		public String toString() {
		return "Fruta = " + nombre + ", ID = "+ numero + ", color = " + color + ", ciudad = " + ciudad + ", precio = " + precio;
	}

	public double calcCosto(double numKg){
		double costo;
		costo = this.precio * numKg;
		return costo;
		
	}
	
	public double calcDesc(double costo){
		double des;
		if(costo > 10000)
			des = 10;
		else
			if(costo >= 1500 && costo <= 10000)
				des = ((costo -1500)/8500)*10;
			else
				des = 0;
		return des;
	}
	

}