package general;

public class ManArreglos {
	
	//Método estático que suma los elementos de un arreglo int
	public static int sumaArreglo(int arre[], int tam){
		int suma = 0;
		for(int i = 0; i < tam; i++)
			suma = suma + arre[i];
		return suma;
	}
	
	//Método estático que calcula el promedio de los elementos de un arreglo int
	public static double promArreglo(int arre[], int tam){
		double prom, suma = 0;
		for(int i = 0; i < tam; i++){
			suma = suma + arre[i];
		}
		prom = suma / tam;
		return prom;
	}
	
	//Método estático que obtiene el indice donde se encuentra el elemento mayor de un arreglo int
	public static int elemMayor(int arre[], int tam){
		int posMax = 0, max = 0;
		for(int i = 0; i < tam; i++){
			if(arre[i] > max){
				max = arre[i];
				posMax = i;
				}
		}	
		return posMax;
	}
	
	//Método estático que obtiene el indice donde se encuentra el elemento menor de un arreglo int
	public static int elemMenor(int arre[], int tam){
		int posMin = 0, min = 1000;
		for(int i = 0; i < tam; i++){
			if(arre[i] < min){
				min = arre[i];
				posMin = i;
			}	
		}	
		return posMin;
	}
	
	//Método estático que determina cuantos elementos de un arreglo son mayores a cierto parámetro
	public static int elemsMay(int arre[], int param, int tam){
		int contador = 0; 
		int pos = 0;
		for(int i = 0; i < tam; i++){
			pos = arre[i];
			if(pos > param)
				contador++;
		}
		return contador;	
	}
	
	//Método estático que determina cuantos elementos de un arreglo son menores a cierto parámetro
	public static int elemsMen(int arre[], int param, int tam){
		int contador = 0; 
		int pos = 0;
		for(int i = 0; i < tam; i++){
			pos = arre[i];
			if(pos < param)
				contador++;
		}
		return contador;	
	}
	
	//Método que permite correr los elementos del un arreglo de doubles k lugares a la izquierda
	public static void mueveIzq(int arre[], int tam, int k){
		int i, ret = 0;
		for(int j = k; j > 0; j--){
			ret = arre[0];	
			for(i = 1; i < tam; i++)
			arre[i-1] = arre[i];
		
		arre[tam-1] = ret;
		}
	}
	
	//Método que permite correr los elementos del un arreglo de doubles k lugares a la derecha
	public static void mueveDer(int []arre, int tam, int k){
		int i, ret = 0;
		for(int j = k; j > 0; j--){
			ret = arre[tam-1];
			for(i = tam-2; i >= 0 ; i--)
			arre[i+1] = arre[i];
		
		arre[0] = ret;
		}
	}
	
	//Búsqueda Secuencial
	public static int busqSec(int arre[], int tam, int aBuscar){
		int i = 0;
		while (i < tam && arre[i] != aBuscar)
			i++;
		if(i == tam)
			i = -1;
		return i;
	}
		
	//Inserción desordenada
	public static int inserDes(int arre [], int tam, int dato){
		if(arre.length > tam){
			tam = tam + 1;
			arre[tam] = dato;
		}
		return tam;
	}	
	
	//Metodo que elimina un elemento del arreglo
	public static int elimDes(int arre[], int tam, int dato){
		int pos;
		pos = busqSec(arre, tam, dato);
		if(pos >= 0){  //El dato está en el arreglo
			arre[pos] = arre[tam-1];
			tam = tam - 1;
		}
		return tam;
	}
	
	//Metodo que recorre a la derecha a partir de un indice
	private static int recorreDer(int arre[], int tam, int indIn){
		int i;
		for(i = tam-1; i > indIn; i--)
			arre[i] = arre[i+1];
		return i;
	}
	
	//Método que recorre a la izquierda a partir de un indice
	public static int recorreIzq(int arre[], int tam, int indIn){
		int i;
		for(i = indIn; i < tam-1; i++)
			arre[i] = arre[i+1];
		return i;
	}
	
	//Método que realiza una busqueda en un arreglo de datos ordenados (Búsqueda binaria)
    public static int busqBin(int[] arre, int tam, int dato) {
        int izq = 0;
        int der = tam - 1;
        int cen = der / 2;
        while (izq <= der && dato != arre[cen]) {
            if (dato < arre[cen]) {
                der = cen - 1;
            } else {
                izq = cen + 1;
            }
            cen = (izq + der) / 2;
        }
        if (izq > der) {
            cen = (izq + 1) * -1;
        }
        return cen;
    }
    
    //Método que inserta un dato de un arreglo de datos ordenados (Inserción ordenada)
    public static int insertaOrd(int[] arre, int n, int n2){
        return recorreDer(arre, n, n2);
    }

  //Método que elimina un dato de un arreglo de datos ordenados (Eliminación ordenada)
    public static int elimOrd(int[] arre, int n, int n2){
    	return recorreIzq(arre, n, n2);
    }
    
   //Método que ordena los elementos de un arreglo (Ordenacion Interna)
    public static void ordenInt(int arre[], int tam){
    	int i, min, pos, j;
    	for(i = 0; i < tam - 1; i++){
    		min = arre[i];
    		pos = i;
    		for(j = 1; j < tam ; j++)
    			if(arre[j] < min){
    				min = arre[j];
    				pos = j;
    			}
    	swap(arre, i, pos);	
    	/*arre[pos] = arre[i];
    	arre[i] = min; */
    	}
    }
    
    //Método que intercambia 2 valores de un arreglo (Swap).
    public static void swap(int arre[], int pos1, int pos2){
    	int aux;
    	aux = arre[pos1];
    	arre[pos1] = arre[pos2];
    	arre[pos2] = aux;
    }
    
    //Método que elimina elementos repetidos de un arreglo ordenado
    public static void eliminaRep(int arre[]){
    	int aux;
    	for(int i = 0; i < arre.length; i++){

    		for(int j = arre[i+1]; j < arre.length; j++ )
    		arre[i]=arre[i+1];
    	}		
    }
    
  //Método que elimina los enteros repetidos de un arreglo de int's
  	public static int eliminaRepe(int arre[], int tam){
  		int i = 0;
  	while(i < tam-1)
  		if(arre[i] == arre[i+1])
  			tam = ManArreglos.elimOrd(arre, tam , arre[i]);
  		else
  			i = i +1;
	return i;
  	}
  	
  	//Método que genera una cadena con los elementos de un arreglo
  	public static String generaCad(int arre[], int n){
  		StringBuilder cad = new StringBuilder();
  		int i;
  		for(i = 0; i < n; i++)
  			cad.append(arre[i]).append(" ");
  		return cad.toString();
  	}
  	
  	/*Método que recibe un arreglo de ints, cantidad de elementos que almacena y un numero.
  	Regresa true si el numero está en el arreglo por lo menos dos veces, caso contrario regresa false
  	*/
  	
  	public static boolean encuentraDos(int arre[], int tam, int num){
  		boolean resp = false;
  		int cont = 0;
  		for(int i = 0; i < tam; i++){
  			if(arre[i] == num)
  				cont++;
  		}
  		if(cont >= 2)
  			resp = true;
  		
  		return resp;
  				
  	}
  	
  }
