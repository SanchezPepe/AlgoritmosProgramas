package Examen2;

import java.util.Arrays;

public class PracticaManArre {

	public static int busqDesord(int arre[], int aBuscar){
		int i, pos = -1;
		for(i = 0; i < arre.length; i++)
			if(arre[i] == aBuscar){
				pos = i;
			}	
		return pos;
	}
	
	public static void inDesord(int arre[], int tam, int aInsertar){
		if(tam < arre.length){
			arre[tam] = aInsertar;
			tam++;
		}	
	}
	
	public static void correIzq(int arre[], int tam, int pos){
		int i;
		for(i = pos; i < tam; i++)
			arre[i] = arre[i+1];
		tam--;
	}
	
	public static void elimDesord(int arre[], int tam, int aElim){
		int i = 0, pos;
		while(i < tam && arre[i] != aElim)
			i++;
		correIzq(arre, tam, i);
		tam--;
	}
	
	public static int busqBin(int arre[], int tam, int aBusq){
		int c, d = tam-1, i = 0;
		c = tam/2;
		while (i <= d && aBusq != arre[c]){
			if(aBusq < arre[c]){
				d = c - 1;
			} else{
				i = c + 1;
			}
			c = (i + d)/2;
		}
		if(i > d){
			c = (i + 1) * -1;
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		int prueba[] = {2,3,5,7,8,9,11,14,15,0,0,0,0};
		int res, tam = 9;
		
		System.out.print(Arrays.toString(prueba));
		
		res = busqBin(prueba, tam, 7);
		
		System.out.println("\n" + res);

	}

}
