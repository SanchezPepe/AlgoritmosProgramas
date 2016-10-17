package general;

/*José de Jesús Sánchez Aguilar
 * CU: 156190
 * 
 * Definición de la clase LID.
 */


public class LID <T>{
	//LISTA INDEXADA DESORDENADA
	private T colec[];
	private int tam;
	private final int MAX = 20;
	
	public LID(){
		colec = (T[]) new Object [MAX];
		tam = 0;
	}

	public String toString(){
		StringBuilder cad = new StringBuilder();
		for(int i = 0; i < tam; i++)
			cad.append(colec[i]).append("\n");
		return cad.toString();
	}
	
	public T get(int indice){
		T resp = null;
		if(indice >= 0 && indice < tam)
			resp = colec[indice];
		return resp;
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
		T nuevo[] = (T[])new Object[max];
		for(int i = 0; i < tam; i++)
			nuevo[i] = colec[i];
		colec = nuevo;
	}
	
	public int size(){
		return tam;
	}
	
	public boolean isEmpty(){
		return tam == 0;
	}
	
	public void clear(){
		colec = (T[]) new Object[MAX];
		tam = 0;
	}
	
	public int indexOf(T obj){
		return MAG.busqSec(colec, tam, obj);
	}
	
	public boolean contains(T obj){
		return MAG.busqSec(colec, tam, obj) >= 0;	
	}
	
	public void addFist(T obj){
		if(tam == colec.length)
			ensureCapacity(tam*2);
		MAG.recorreDer(colec, tam, 0);
		colec[0] = obj;
		tam++;
	}
	
	public void addLast(T obj){
		if(tam == colec.length)
			ensureCapacity(tam*2);
		colec[tam] = obj;
		tam++;
	}
	
	public void add(int pos, T obj){
		if(pos >= 0 && pos < tam)
			if(tam == colec.length)
				ensureCapacity(tam*2);
			MAG.recorreDer(colec, tam, pos);
			colec[pos] = obj;
			tam++;
	}
	
	public T remove(int pos){
		T res = null;
		if(pos >= 0 && pos < tam){
			res = colec[pos];
			MAG.recorreIzq(colec, tam, pos);
			tam--;
			colec[tam] = null;
		}
		return res;
	}
	
	public boolean remove(T obj){
		boolean resp = false;
		int i = indexOf(obj);
		if(i >= 0){
			MAG.recorreIzq(colec, tam, i);
			tam--;
			colec[tam] = null;
			resp = true;
		}
		return resp;
	}
}
