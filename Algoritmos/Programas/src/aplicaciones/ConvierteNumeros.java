package aplicaciones;

import java.util.Scanner;

public class ConvierteNumeros {

	public static void main(String[] args) {
		int x=0,n,k;
		Scanner lee=new Scanner(System.in);
		System.out.print("Ingrese el número");
		n=lee.nextInt();
		while(n>0){
			k=n%10;
			x=x*10+k;
			n=n/10;
		}
		System.out.print("\nResultado: "+x);
		// TODO Auto-generated method stub

	}

}
