package general;

public class CalcCompleja {
	
	private String marca;
	private Complejo n1,n2;
	
	
	public CalcCompleja(){
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setN1(Complejo c){
		n1 = c;
	}
	
	public void setN2(Complejo c){
		n2 = c;
	}
	
	public Complejo suma(){
		Complejo res = new Complejo();
		double r = n1.getReal() + n2.getReal(), i = n1.getImag() + n2.getImag();
		res.setReal(r);
		res.setImag(i);
		return res;
	}
	
	public Complejo resta(){
		Complejo res = new Complejo();
		double r = n1.getReal() - n2.getReal(), i = n1.getImag() - n2.getImag();
		res.setReal(r);
		res.setImag(i);
		return res;
	}
	
	public Complejo mult(){
		Complejo res = new Complejo();
		double r = n1.getReal() * n2.getReal(), i = n1.getImag() * n2.getImag();
		res.setReal(r);
		res.setImag(i);
		return res;
	}
	
	public Complejo div(){
		Complejo res = null;
		double den = Math.pow(n2.getReal(),2) + Math.pow(n2.getImag(),2);
		if (den!=0){
			double r = (n1.getReal()*n2.getReal()/den), i = n1.getImag()*n2.getImag()/den;
			res = new Complejo(r,i);
		}
		return res;
	}
}

