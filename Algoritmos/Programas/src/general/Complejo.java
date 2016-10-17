package general;

public class Complejo {
	
	double real;
	double imag;
	
	public Complejo(){
	}
	
	public Complejo(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal(){
		return real;
	}
	
	public double getImag(){
		return imag;
	}
	
	public void setReal(double nuevo){
		real = nuevo;
	}
	
	public void setImag(double nuevo){
		imag = nuevo;
	}
	
	public boolean equals(Complejo otroComp){
		boolean res;
		res = false;
		if(real == otroComp.real && imag == otroComp.imag)
			res=true;
		return res;
	}
	
	public int compareTo(Complejo otroComp){
		int res;
		if(real < otroComp.real)
			res= -1;
		else
			if(real > otroComp.real)
				res=1;
			else
				res=0;
		return res;
	}
	
	public String toString(){
		return real + "r" + imag + "i";
	}
}
