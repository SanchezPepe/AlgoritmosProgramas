package general;

public class Circulo {
	private double radio;


	public Circulo(){
	}
	
	public Circulo(double r){
	radio= r;
	}
	
	public double calArea(){
	double area;
	
	area= Math.PI *(radio*radio);
	return area;
	}
	
	public double calPer(){
	return Math.PI*(2*radio);
	}
	
}