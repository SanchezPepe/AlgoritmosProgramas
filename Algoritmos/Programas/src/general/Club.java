package general;

public class Club {
    private String nom;
    private String dom;
    private int tAlbs = 0;
    private Rectangulo[] alb = new Rectangulo[20];
    private final int MAX = 20;

    public Club() {
    }

    public Club(String nom, String dom) {
        this();
        this.nom = nom;
        this.dom = dom;
    }

    public boolean altaAlb(double lad1, double lad2) {
    	//Comprobar si hay espacio
        boolean resp = false;
        if (this.alb.length > this.tAlbs) {
            resp = true;
            //Si hay espacio, crea un objeto Rectángulo en el arreglo
            this.alb[this.tAlbs] = new Rectangulo(lad1, lad2);
            this.tAlbs++;
        }
        return resp;
    }

    public double calPrecio(double precio) {
        double total = 0.0;
        for (int i = 0; i < this.tAlbs; ++i) {
            total += this.alb[i].calArea();
        }
        return total *= precio;
    }
}