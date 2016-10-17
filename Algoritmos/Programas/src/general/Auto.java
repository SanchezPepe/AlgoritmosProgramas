package general;

public class Auto implements Comparable <Auto>{
	
	private int clave;
	private String marca, color;
	private double precio;
	
	public Auto(){
	}
	
	public Auto(int clave, String color, double precio){
		this.clave = clave;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	public Auto(int clave){
		this.clave = clave;
	}
	
	public int compareTo(Auto otro){
		return clave - otro.clave;
	}
	
	public boolean equals(Object otro){
		Auto a = (Auto) otro;
		return clave == a.clave;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getClave() {
		return clave;
	}

	public String getMarca() {
		return marca;
	}

	public String toString() {
		return "Auto [clave=" + clave + ", marca=" + marca + ", color=" + color
				+ ", precio=" + precio + "]";
	}
	
	
	

}
