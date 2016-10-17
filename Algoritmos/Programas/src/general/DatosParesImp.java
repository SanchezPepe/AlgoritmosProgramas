package general;

import java.util.ArrayList;

public class DatosParesImp {
	public static ArrayList <Integer> encuentraPI(int arrePar[], int arreIm[]){
		ArrayList<Integer> ArrayListFiltro = new ArrayList<Integer>();
			for(int i = 0; i < arrePar.length; i++)
				if(arrePar[i] % 2 == 0)
					ArrayListFiltro.add(arrePar[i]);
			
			for(int j = 0; j < arreIm.length; j++)
				if(arreIm[j] % 2 != 0)
					ArrayListFiltro.add(arreIm[j]);
	
		return ArrayListFiltro;
	}
	
	
	
	public static void main(String[] args) {
		int[] arrePar = {10,7,3,12,9,8,1,22};
		int[] arreIm = {11,13,10,15,8,4,2,1,44};
		
		encuentraPI(arrePar, arreIm);
		
		System.out.println("ArrayList: " + encuentraPI(arrePar, arreIm));
		
		}
}
