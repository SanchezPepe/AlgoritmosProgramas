 package general;

import java.util.ArrayList;

public class Producto {
	
	private int clave, tProv;
	private String nombre;
	private final int MAX = 10;
	private String nomProv[];
	private ArrayList <String> nomCli;
	
	public Producto(){
		nomProv = new String [MAX];
		tProv = 0;
		nomCli = new ArrayList<String>();
	}
	
	public Producto(String nombre, int clave){
		this();
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public String[] getNomProv() {
		return nomProv;
	}
	
	public void setNomProv(String[] nomProv) {
		this.nomProv = nomProv;
	}
	
	public String getClientes() {
		return nomCli.toString();
	}
	
	public void setClientes(ArrayList<String> clientes) {
		this.nomCli = clientes;
	}
	
	public int getClave() {
		return clave;
	}
	
	public int gettProv() {
		return tProv;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean altaProv(String nuevo){
		boolean resp = false;
		if(tProv < nomProv.length){
			nomProv[tProv] = nuevo;
			tProv++;
			resp = true;
		}	
		return resp;
	}
	
	public boolean altaCliente(String nuevo){
		boolean resp;
		resp = nomCli.contains(nuevo);
		if(resp == false) //!resp
			nomCli.add(nuevo);
		resp = !resp;
		return resp;
	}
	
	public boolean equals(Producto p){
		return clave == p.clave;
	}
}
