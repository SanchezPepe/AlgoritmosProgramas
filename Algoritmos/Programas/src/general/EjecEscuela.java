package general;

public class EjecEscuela {

	public static void main(String[] args) {
		Escuela e = new Escuela();
		
		e.altaAlumno("Juan Perez");
		
		
		System.out.print(e.getClaveU());
		
		e.altaCalif(e.getClaveU(), 9.8);

			System.out.print(e.consAlumnoCalNMasAlta());
			
			e.bajaAlumno(1);
	}

}
