package general;

public class Rectangulo {
	private double base, altura;
	
	
	
	public Rectangulo() {
	}

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	public double calArea(){
		double area;	
		area= base * altura;
		return area;
	}
	
	public double calPer(){
		double perim;
		perim = 2*(base + altura);
		return perim;
	}
}
