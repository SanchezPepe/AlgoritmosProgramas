package general;

public class Negocio {
	
	private String nom;
	private Producto prods [];
	private int tProd;
	private final int MAX = 100;
	
	public Negocio(){
		tProd = 0;
		prods = new Producto [MAX];
	}
	
	public Negocio(String nom){
		this();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Producto[] getProds() {
		return prods;
	}

	public int gettProd() {
		return tProd;
	}
	
	public int buscaProd(int clave){
		int i = 0;
		while(i < tProd && prods[i].getClave() != clave)
			i++;
		if(i == tProd)
			i = -1; //No lo encontró
		
		return i;
	}
	
	
	public boolean altaProd(String nom, int clave){
		boolean resp = false;
		if(prods.length > tProd){
			int pos;
			pos = buscaProd(clave);
			if(pos < 0){
				resp = true;
				prods[tProd] = new Producto(nom, clave);
				tProd++;
			}
		}
		return resp;
	}
	
	public String consultaCli(int clave){
		int pos;
		String resultado;
		pos = buscaProd(clave);
		if(pos < 0)
			resultado = "Producto no encontrado";
		else
			resultado = prods[pos].getClientes();
		return resultado;
	}
	
	public boolean altaProv(int clave, String nuevo){
		boolean resp = false;
		int pos;
		pos = buscaProd(clave);
		if(pos >= 0)
			resp = prods[pos].altaProv(nuevo);
		return resp;
	}
	
	public boolean altaCliente(int clave, String nuevo){
		boolean resp = false;
		int pos;
		pos = buscaProd(clave);
		if(pos >= 0)
			resp = prods[pos].altaCliente(nuevo);
		return resp;
	}
		
}	
