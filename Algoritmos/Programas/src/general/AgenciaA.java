package general;

public class AgenciaA {
	
	private String nom, direc;
	private int contM, contA;
	private LIO <String> nomM;
	private LIO <Auto> datosA;

	public AgenciaA(){
		nomM = new LIO <String>();
		datosA = new LIO <Auto>();
	}
	
	public AgenciaA(String nom, String direc){
		this();
		this.nom = nom;
		this.direc = direc;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		cad.append(nom).append("\n");
		cad.append("\nTotal de marcas: ").append(nomM.size());
		cad.append("\nMarcas: ").append(nomM.toString());
		cad.append("\nTotal de autos: ").append(datosA.size());
		cad.append("\nAutos: ").append(datosA.toString());
		
		return cad.toString();		
	}
	
	public boolean altaMarca(String nueva){
		boolean resp;
		resp = nomM.add(nueva);	
		return resp;
	}
	
	public boolean bajaMarca(String marca){
		return nomM.remove(marca);
	}
	
	public boolean altaAuto(int clave, String color, double precio){
		Auto nuevo = new Auto(clave, color, precio);
		return datosA.add(nuevo);
	}
	
	public boolean ventaAuto(int clave){
		Auto vend  = new Auto(clave);
		return datosA.remove(vend);
	}
	
	public String consMasCaro(){
		int i, n, pos = 0;
		double max = 0;
		n = datosA.size();
		for(i = 0; i < n; i++)
			if(datosA.get(i).getPrecio() > max){
				max = datosA.get(i).getPrecio();
				pos = i;
			}
		return datosA.get(pos).toString();
	}
	
	public int consPorMarca(String marca){
		int cont = 0, n, i;
		n = datosA.size();
		if(nomM.contains(marca))
			for(i = 0; i < n; i++)
				if(datosA.get(i).getMarca().equals(marca))
					cont++;
		return cont;			
	}
}
