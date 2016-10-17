package Lab2;

public class RentaAutomoviles {

    public static void main(String[] args) {
        Auto auto1, auto2, auto3, auto4, auto5;
        double precio, precio1;
        boolean respuesta1;
        
        auto1 = new Auto("Ford", 2004, 15000);
        auto2 = new Auto("Chrysler", 2008, 10000);
        auto3 = new Auto("Ford", 2010, 5000);
        auto4 = new Auto("BMW", 2002, 30000);
        auto5 = new Auto("GMC", 2015, 5000);
        
        System.out.println(auto1.toString() + "\n");
        System.out.println(auto2.toString() + "\n");
        System.out.println(auto3.toString() + "\n");
        System.out.println(auto4.toString() + "\n");
        System.out.println(auto5.toString() + "\n");
        
        precio = auto2.Renta("Julio", 12345, 5);
        System.out.println(precio + " pesos");
        
        //En este caso, ya esta rentado, deberia mandarme una alerta y el precio 0
        precio1 = auto2.Renta("Julio", 12345, 5);
        System.out.println(precio1 + " pesos");
        
        respuesta1 = auto2.Devolucion(5000);
        System.out.println(respuesta1);
        
        //En este caso, el auto no esta rentado, debe mandar un mensaje.
        respuesta1 = auto3.Devolucion(5000);
        System.out.println(respuesta1);
        
    }
    
}
