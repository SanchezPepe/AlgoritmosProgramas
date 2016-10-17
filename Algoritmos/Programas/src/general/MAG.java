package general;

public class MAG {

	public static <T> void recorreIzq(T arre[], int cant, int pos){
		for(int i = pos; i < cant-1 ;i++)
			arre[i] = arre[i+1];
	}
	
	public static <T> void recorreDer(T arre[], int cant, int pos){
		for(int i = cant-1; i > pos; i--)
			arre[i] = arre[i-1];
	}
	
	public static <T> String toString(T arre[], int cant){
		StringBuilder cad = new StringBuilder ();
		for(int i = 0; i < cant; i++)
			cad.append(arre[i]).append("\n");
		return cad.toString();
	}
	
	public static <T> int insertaDesord(T arre[], int cant, T dato){
		if(arre.length > cant){
			arre[cant] = dato;
			cant++;
		}
		return cant;
	}
	
	public static <T> int busqSec(T arre[], int cant, T aBuscar){
		int i = 0;
		while(i < cant && arre[i].equals(aBuscar))
			i++;
		if(i == cant)
			i = -1;
		return i;
	}
	
	public static <T extends Comparable<T>> int busqBin(T[] arre, int cant, T aBuscar){
		int cen, der, izq = 0;
		der = cant-1;
		cen = (izq + der) / 2;
		while(izq <= der && !arre[cen].equals(aBuscar)){
			if(arre[cen].compareTo(aBuscar) > 0)
				der = cen - 1;
			else
				izq = cen + 1;
			cen = (izq + der) / 2;
			if(izq > der)
				cen = (izq +1) * -1;
		}
		return cen;
		
	}		
		
	public static <T> void swap(T arre[], int pos1, int pos2){
	    T aux;
	    aux = arre[pos1];
	    arre[pos1] = arre[pos2];
	    arre[pos2] = aux;
	}
		
	public static <T> void ordenaSelec(T arre[], int tam){
	   	int i, pos, j;
		T min;
	   	for(i = 0; i < tam - 1; i++){
	   		min = arre[i];
	   		pos = i;
	   		for(j = 1; j < tam ; j++)
	   			if(arre[j].equals(min)){
	   				min = arre[j];
	   				pos = j;
	   			}
	   	swap(arre, i, pos);	
	   	}
	}
	
	public static <T> int elimOrdenado(T arre[], int tam, T aEliminar){
		int pos;
		pos = busqSec(arre, tam, aEliminar);
		if(pos >= 0){ //Si está en el arreglo
			recorreIzq(arre, tam, pos);
			arre[tam-1] = null;  //Limpieza 
			tam--;
		}
		return tam;
	}
}