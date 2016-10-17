package general;

public class Calculadora {
	
	public static int calFactorial(int n){
		int i, fact;
		fact = 1;
		
		for(i = n; i >= 2; i--){
			fact = fact * i;
		}
		return fact;
	}
	
	public static int MCD(int m, int n){
		int aux;
		while(n > 0){
			aux = m;
			m = n;
			n = aux % n;
		}
		return m;
	}	
}	

