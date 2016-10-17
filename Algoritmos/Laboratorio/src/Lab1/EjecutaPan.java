package Lab1;

import java.util.Scanner;

public class EjecutaPan {
    
    public static void main(String args[]){
        
    /*
    Hay un error en la redacción del examen porque te piden crear 3 panes con
    datos que ellos te dan pero solo vienen los datos de 2 panes, por lo
    que trabajaremos solo con dos. En el segundo pan la figura y el tipo de harina
    es dado por el usuario por lo que requerimos usar un Scanner.
    */
     
    //Recuerden que dentro de un System.out.print("\n"), \n da un salto de linea.
        Scanner lee = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de ingredientes del"
                            + "pan 2.");
        
        int numIngredientesPan2 = lee.nextInt();
        
        System.out.println("Ingresa el tipo de harina del pan 2.");
        
        String tipoHarinaPan2 = lee.next();
        
        Pan pan1 = new Pan(35,4,"dona","avena",'r');
        Pan pan2 = new Pan(45,numIngredientesPan2,"ladrillo",tipoHarinaPan2,'c');
        
    // b) Calcula e imprime el costo de cada pan.
        System.out.println("\nCosto del pan 1: $"+pan1.calcularCosto());
        System.out.println("\nCosto del pan 2: $"+pan2.calcularCosto());
        
    // c) Calcula e imprime el tiempo de horneado de 10 donas
        System.out.println("\nTiempo de horneado de 10 donas: "
                           + pan1.tiempoDeHornadeo(10)+" min.");
        
    // d) Imprime la información completa del pan con clave 35.
    // Aquí nos damos cuenta que requerimos programar el toString().
        
        System.out.println(pan1.toString());
        
    // e) Cambia el número de ingredientes para el pan con clave 45 a 6.
    // Aquí nos damos cuenta que requerimos programar el setNumeroDeIngredientes().
        
        pan2.setNumeroDeIngredientes(6);
        
    // f) Imprime de nuevo su costo actualizado.
        
        System.out.println("\nCosto del pan 2 (Actualizado): $"+pan2.calcularCosto());
    
    }
    
}
