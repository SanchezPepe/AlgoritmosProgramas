package general;

public class LIO <T extends Comparable <T>> {
	//LISTA INDEXADA ORDENADA
	private T colec[];
	private int tam;
	private final int MAX = 20;
	
	public LIO(){
		colec = (T[]) new Comparable[MAX];
		tam = 0;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		for(int i = 0; i < tam; i++)
			cad.append(colec[i]).append("\n");
		return cad.toString();
	}
	
	public int indexOf(T obj){
		int pos;
		pos = MAG.busqBin(colec, tam, obj);
		if(pos < 0)
			pos = -1;
		return pos;
	}
	
	public boolean contains(T obj){
		return MAG.busqBin(colec, tam, obj) >= 0;
	}
	
	public T get(int indice){
		T resp = null;
		if(indice >= 0 && indice < tam)
			resp = colec[indice];
		return resp;
	}
	
	public int size(){
		return tam;
	}
	
	public boolean isEmpty(){
		return tam == 0;
	}
	
	public void clear(){
		colec = (T[]) new Comparable[MAX];
		tam = 0;
	}
	
	public T set(int indice, T nuevo){
		T res = null;
		if(indice >= 0 && indice < tam){
			res = colec[indice];
			colec[indice] = nuevo; 
		}
		return res;
	}
	
	private void ensureCapacity(int max){
		T nuevo[] = (T[])new Comparable[MAX];
		for(int i = 0; i < tam; i++)
			nuevo[i] = colec[i];
		colec = nuevo;
	}
	
	public boolean add(T nuevo){
		boolean resp = false;
		int pos;
		if(tam == colec.length)//Est� lleno
			ensureCapacity(colec.length*2);
		pos = MAG.busqBin(colec, tam, nuevo);
		if(pos < 0){ //No est� en el arreglo
			pos = pos * -1 - 1;
			MAG.recorreDer(colec, tam, pos);
			colec[pos] = nuevo;
			resp = true;
			tam++;
		}	
	return resp;
	}
		
	public boolean remove(T obj){
		boolean resp = false;
		int nuevoTam;
		nuevoTam = MAG.elimOrdenado(colec, tam, obj);
		if(nuevoTam < tam){
			resp = true;
			tam = nuevoTam;
		}
		return resp;
	}
	
	public T remove (int indice){
		T resp = null;
		if(indice >= 0 && indice < tam){
			resp = colec[indice];
			MAG.recorreIzq(colec,tam, indice);
			colec[tam-1] = null;
			tam--;
		}
		return resp;
	}
	
	public boolean equals(T nuevo[]){
		boolean resp = false;
		if(colec == nuevo)
			resp = true;
		return resp;
	}
	
	public boolean equals (Object otro){
		LIO <T> lista = (LIO) otro;
		boolean resp;
		resp = tam == lista.tam && colec.length == lista.colec.length;
		if(resp){
			int i = 0;
			while(i < tam && colec[i].equals(lista.colec[i]))
				i++;
			resp = i == tam;
		}
		return resp;
	}
	
	public boolean verificaOrden(){
		int i = 0;
		boolean resp;
		while(i < tam-1 && colec[i].compareTo(colec[i+1]) < 0)
			i++;
		resp = tam == 0 || i == tam-1;
		return resp;
	}
}
