package aplicaciones;

import java.util.Scanner;

import general.CalcCompleja;
import general.Complejo;

public class EjemCalcC {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		CalcCompleja c = new CalcCompleja();
		String res;
		Complejo c1 = new Complejo(), c2 = new Complejo(), c3 = new Complejo();
		char op;
		double real,im;
		System.out.print("Qué operacion quiere hacer?");
		res = a.nextLine();
		op = res.charAt(0);
		while (op!='s'){
			System.out.print("Primer complejo: ");
			real = a.nextDouble();
			im = a.nextDouble();
			c1.setReal(real);
			c1.setImag(im);
			
			System.out.print("Segundo complejo: ");
			real = a.nextDouble();
			im = a.nextDouble();
			c2.setReal(real);
			c2.setImag(im);
			c.setN1(c1);
			c.setN2(c2);
			
			switch (op){
			case '+': c3 = c.suma();
			break;
			
			case '-': c3=c.resta();
			break;
			
			case '*': c3=c.mult();
			break;
			
			case '/': c3=c.div();
			break;
			
			default: c3=null;
			
			}	
		}
	}
}
