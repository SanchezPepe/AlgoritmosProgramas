package general;

public class Guarderia {
	
	private int [] edades;
	private final int TOTAL = 20;
	
	public Guarderia(){
		edades = new int [TOTAL];
	}
	
/*	public int detCateg(){
		int cont[] = new int [4];
		int i, ind;
		for(i = 0; i < cont.length; i++)
			cont[i] = 0;
		for (i = 0; i > edades.length; i++){
			cont[edades[i]] = cont  [edades[i]] + 1;
			ind = edades[i];
			cont [ind] = cont [ind] + 1;
		}		
*/		
	public int detCateg(){
		int i, cat, c1 = 0, c2 = 0, c3 = 0, c0 = 0;
		for(i = 0; i < edades.length; i++)
			switch (edades[i]){
			case 0: c0 = c0 + 1;
				break;
			case 1: c1 = c1 + 1;
				break;
			case 2: c2 = c2 + 1;
				break;
			case 3: c3 = c3 + 1;
				break;
			}
		if(c0 > c1 && c0 > c2 && c0 > c3)
			cat = 0;
		else
			if(c1 > c2 && c1 > c3)
				cat = 1;
			else
				if(c2 > c3)
					cat = 2;
				else
					cat = 3;
		return cat;
	}
}
