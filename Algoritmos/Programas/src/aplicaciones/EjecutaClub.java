package aplicaciones;

import general.Club;

public class EjecutaClub {
    public static void main(String[] args) {
        Club nuevo = new Club();
        nuevo.altaAlb(5.0, 6.0);
        System.out.print("\nCosto Total: " + nuevo.calPrecio(1000.0));
    }
}