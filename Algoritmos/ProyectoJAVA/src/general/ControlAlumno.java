package general;

/*Jos� de Jes�s S�nchez Aguilar
 * CU: 156190
 * 
 * Definici�n de la clase ControlAlumno.
 */

public class ControlAlumno {
	
	private String nom;
	private LID <Materia> tiraM;
	private double promGen;
	
	//CONSTRUCTORES
	public ControlAlumno(){
		tiraM = new LID <Materia>();
		this.promGen = 0;
	}
	
	public ControlAlumno(String nom){
		this();
		this.nom = nom;
	}

	//FUNCIONALIDAD M�NIMA
	public String getNom() {
		return nom;
	}
	
	public double getPromGen() {
		this.promGen = promGen();
		return promGen;
	}

	public LID<Materia> getTiraM() {
		return tiraM;
	}

	public String toString() {
		String lista = "\nTira de materias:" + "\n" +"\n" + tiraM.toString() + "\nCarga de materias: " + tiraM.size();
		return lista;
	}
	
	//M�TODO QUE REGRESA UN TRUE/FALSE SI LA CLAVE INGRESADA(PAR�METRO) PERTENECE A UNA MATERIA EXISTENTE.
	public boolean containsMat(int clave){
		boolean resp = false;
		int pos, i = 0, tam = tiraM.size();
		while(i < tam && tiraM.get(i).getClaveU() != clave)
			i++;
		pos = i;
		if(pos < tiraM.size())
			resp = true;
		return resp;
		
	}
	
	//METODO QUE PERMITE DAR DE ALTA UNA MATERIA TOMANDO COMO PARAMETRO UN STRING
	public boolean altaMateria (String mat) {
		int pos = buscaPorNombre(mat), tam = tiraM.size();
		boolean resp = false;
		if(pos < 0){
			Materia una = new Materia(mat);
			tiraM.addLast(una);
		}	
			if(tiraM.size() > tam){
			resp = true;	
			promGen();
			}
		return resp;
	}
	
	/*M�TODO QUE REGRESA UN INT CON LA POSICION EN LA QUE SE ENCUENTRA 
	* UNA MATERIA DADO COMO PARAMETRO SU NOMBRE Y HACE COMPARACIONES 
	* PARA EVITAR QUE SE D� DE ALTA UNA MISMA MATERIA.*/
	public int buscaPorNombre(String nom){
		int pos = 0, i = 0;
		while(i < tiraM.size() && !tiraM.get(i).getNom().equalsIgnoreCase(nom))
			i++;
		pos = i;
		if(i == tiraM.size())
			pos = -1;
		return pos;
	}
	
	/*M�TODO REGRESA UN INT CON LA POSICI�N DONDE SE ENCUENTRA LA MATERIA DADA
	 * UNA CLAVE COMO PAR�METRO */
	public int buscaPorClave(int clave) {
		int pos, i = 0, tam = tiraM.size();
		if(containsMat(clave)){
			while(i < tam && tiraM.get(i).getClaveU() != clave)
				i++;
			pos = i;
		}	
		else
			pos = -1;
		return pos;
	}
	
	//M�TODO PERMITE ELIMINAR UNA MATERIA DADA UNA CLAVE COMO PAR�METRO
	public boolean bajaMateria (int clave) {
		int pos;
		boolean resp = false;
		if(containsMat(clave)){
			pos = buscaPorClave(clave);
			tiraM.remove(pos);
			if(tiraM.get(tiraM.size()) == null){
				resp = true;
				promGen();
			}
		}
		return resp;
	}
	
	//M�TODO QUE ASIGNA UNA CALIFICACION DADA LA CLAVE DE MATERIA Y LA CALIFICACION.
	public boolean altaCalifMat(int clave, double cal) {
		boolean resp;
		int pos = buscaPorClave(clave);
		if(!tiraM.contains(tiraM.get(pos)))
			resp = false;
		else
			if(resp = tiraM.get(pos).altaCal(cal))
				resp = true;
		return resp;
	}
	
	//M�TODO QUE ELIMINA UNA CALIFICACI�N DADA LA CLAVE Y EL PARCIAL DE LA CALIFICACION.
	public boolean eliminaCal(int clave, int parcial) {
		boolean resp;
		if(containsMat(clave)){
			int pos = buscaPorClave(clave);
			resp = tiraM.get(pos).elimCalif(parcial);
			if(resp = true)
				promGen();
		}
		else
			resp = false;
		return resp;
	}
	
	//M�TODO QUE BRINDA INFORMACI�N DE UNA MATERIA DADA SU CLAVE
	public String infoMateria(int clave){
		int pos = buscaPorClave(clave);
		String cad = tiraM.get(pos).desglosar();
		return cad;
	}
	
	/*M�TODO QUE CALCULA EL PROMEDIO GENERAL CONTANDO S�LO LAS MATERIAS QUE
	 * TIENEN CALIFICACIONES DADAS DE ALTA */
	public double promGen(){
		double suma = 0, aux = 0, cont = 0; 
		int tam = tiraM.size();
		if(tam > 0){
			for(int i = 0; i < tam; i++){
				aux = tiraM.get(i).getProm();
				if(aux > 0){
					suma = suma + aux;
					cont++;
				}
			}
			
		}
		return this.promGen = suma / cont;	
	}
}
