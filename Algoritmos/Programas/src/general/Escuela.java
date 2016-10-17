package general;

public class Escuela {
	
	private String nombre;
	private LIO <Alumno> als;
	
	public Escuela(){
		als = new LIO <Alumno>();
	}
	
	public boolean altaAlumno(String nom){
		boolean resp = false;
		Alumno nuevo = new Alumno(nom);
		resp = als.add(nuevo);
		
		return resp;
	}
	
	public boolean altaCalif(int cU, double cal){
		boolean resp = false;
		Alumno a1 = new Alumno();
		int pos;
		
		pos = als.indexOf(a1);
		if(pos >= 0){
			resp = als.get(pos).altaCalif(cal);
		}
		return resp;
	}
	
	public boolean bajaAlumno(int cU){
		boolean resp;
		Alumno a1 = new Alumno();
		resp = als.remove(a1);
		return resp;
	}
	
	public String consAlumnoCalNMasAlta(){
		String resul = null;
		double max = 0, prom;
		int i, pos = 0, n = als.size();
		if(n > 0){
			for(i = 0; i < n; i++){
				prom = als.get(i).calculaProm();
				if(prom > max){
				max = prom;
				pos = i;
				}
			}
			resul = "Mejor alumno" + als.get(pos).toString();
		}
		return resul;
	}

	public int getClaveU() {
		Alumno a1 = new Alumno();
		return 0;
	}
	
	
}