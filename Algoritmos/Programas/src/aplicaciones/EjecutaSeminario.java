package aplicaciones;

import java.io.File;
import java.util.Scanner;

import general.Seminario;

public class EjecutaSeminario {
	
	public static void main(String[] args) {
		
		
		
	public static void cargaDatos(Seminario s1){
		String nom;
		try{
			Scanner arch = new Scanner(new File ("Asistencia"));
			while(arch.hasNext()){
				nom = arch.nextLine();
				s1.agregaAsist(nom);
			}
			arch.close();
		} catch (Exception e){
			System.out.print("\nNo se pudo agregar. ");
			System.exit(-1);
		}
	}
	
	public static int menu(Scanner lee){
		int resp;
		do{
			System.out.print("\nQué quiere hacer: ");
			System.out.print("\n1.- Agregar ");
			System.out.print("\n2.- Eliminar ");
			System.out.print("\n3.- Consultar ");
			System.out.print("\n4.- Genera ");
			System.out.print("\n5.- Salir " + "\n");
			resp = lee.nextInt();
		} while(resp >= 5 || resp <= 1);
		return resp;
	}
		
		Seminario s1 = new Seminario("Etica", "Febrero 2015");
		Scanner lee = new Scanner(System.in);
		int epc;
		String nom;
		cargaDatos(s1);
		epc = menu(lee);
		while(epc != 5){
			switch(epc){
			case 1: System.out.print("Nombre del Asistente: ");
			lee.nextLine();
					nom = lee.nextLine();
					if(s1.agregaAsist(nom))
						System.out.print("Alta exitosa");
					else
						System.out.print("Ya está registrado");
					break;
			case 2: System.out.print("Asistente a eliminar: ");
					lee.nextLine();
					nom = lee.nextLine();
					if(s1.eliminaAsist(nom))
						System.out.print("Baja exitosa.");
					else
						System.out.print("El asistente no se encontró ");
					break;
			case 3: System.out.print("Ingresa el nombre: ");
					lee.nextLine();
					nom = lee.nextLine();
					if(s1.consAsist(nom))
						System.out.print("\n" + nom + " si está registrado.");
					else
						System.out.print("No está registrado");
					break;
			case 4: System.out.print(s1.generaRep());	
			}
			epc = menu(lee); 
		}
		
	}
	

}
