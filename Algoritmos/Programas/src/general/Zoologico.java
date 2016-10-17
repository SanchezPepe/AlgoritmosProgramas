package general;

public class Zoologico {
	
	private String nombre, direc;
	private Animal animales [] = new Animal[20];
	private int tAnim = 0;
	
	public Zoologico(){
	}
	
	public Zoologico(String nombre, String direc){
		this.nombre = nombre;
		this.direc = direc;
	}
		
	public boolean altaAnimales(String nombre, String raza, int edad){
		boolean resp = false;
		if(animales.length > tAnim)
			//Sí hay espacio
			this.animales[this.tAnim] = new Animal(nombre, raza, edad);
			tAnim++;
		return resp;
	}
	
	public double promEdad(){
		double prom, suma = 0;
		int i;
		for(i = 0; i < tAnim; i++)
			suma = suma + this.animales[i].getEdad();
		prom = suma / tAnim;
		return prom;
	}
	
	public int cuantosRaza(String raza){
		int i, cont = 0;
		for(i = 0; i < tAnim; i++){
			if(this.animales[i].getRaza() == raza)
				cont++;
		}	
		return cont;
	}
}
