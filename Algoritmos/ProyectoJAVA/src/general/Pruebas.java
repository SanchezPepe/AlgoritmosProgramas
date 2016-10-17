package general;
import java.io.File;
import java.util.Scanner;
import GUI.ControlAlumnoControlador;

/*José de Jesús Sánchez Aguilar
 * CU: 156190
 * 
 * Definición de la clase Pruebas.
 */


public class Pruebas {
	
	public static void cargaDatos(ControlAlumno control){
		String nom;
		try{
			Scanner archivo = new Scanner(new File("Materias"));
			while(archivo.hasNext()){
				nom = archivo.nextLine();
				control.altaMateria(nom);
			}
			archivo.close();
		} catch (Exception e) {
			System.out.print("\nNo se pudo leer el archivo");
			System.exit(-1);
		}
	}
	private static void menu(){
		System.out.print("\n" + "\nAcciones: ");
		System.out.print("\n1.- Consulta tira de materias.");
		System.out.print("\n2.- Agregar materia.");
		System.out.print("\n3.- Agregar calificacion.");
		System.out.print("\n4.- Eliminar una calificacion.");
		System.out.print("\n5.- Dar de baja una materia.");
		System.out.print("\n6.- Información de una materia");
		System.out.print("\n7.- Consulta promedio general.");
		System.out.println("\n8.- Salir ");
	}
	
	public static void acciones(){
		ControlAlumno con = new ControlAlumno();
		cargaDatos(con);
		menu();
		Scanner lee = new Scanner(System.in);
		int sel = lee.nextInt();
		while(sel != 8){
			String nom;
			int num, par;
			double cal;
			switch(sel){
			case 1: System.out.print(con.toString());
					break;
			case 2: System.out.print("Ingresa nombre de la nueva materia: ");
					lee.nextLine();
					nom = lee.nextLine();
					if(con.altaMateria(nom))
						System.out.print("Alta exitosa");
					else
						System.out.print("Ya está registrada la materia");
					break;
			case 3: System.out.print("Clave de materia: ");
					num = lee.nextInt();
					if(!con.containsMat(num))
						System.out.print("La materia no existe.");
					else{
						System.out.print("Calificación: ");
						cal = lee.nextDouble();
					if(con.altaCalifMat(num, cal))
						System.out.print("Se guardó la calificación");
					else
						System.out.print("No se guardó");
					}
					break;
			case 4: System.out.print("Clave de materia: ");
					num = lee.nextInt();
					if(con.containsMat(num)){
						System.out.print("Parcial a eliminar: ");
						par = lee.nextInt();
						if(con.eliminaCal(num, par))
							System.out.print("Se eliminó correctamente.");
						else
							System.out.print("No se eliminó.");
					}
					else
						System.out.print("La materia no existe.");
					break;
			case 5: System.out.print(con.toString());
					System.out.print("\nClave de la materia a eliminar: ");
					num = lee.nextInt();
					if(con.bajaMateria(num))
						System.out.print("Baja exitosa");
					else
						System.out.print("La materia no existe");
					break;
			case 6: System.out.print("Clave de materia: ");
					num = lee.nextInt();
					System.out.print(con.infoMateria(num));
					break;
			case 7: System.out.print("Promedio general: " + con.getPromGen());
			} 
			menu();
			sel = lee.nextInt();
			
		}		
	}
	
	public static void main(String[] args) {
		acciones();
		
	}
	
}