package Lab2;

public class Auto {
    private static int claveUnica = 0;
    private String marca, nombreCliente;
    private int ano, numLic;
    private double numKm;
    
    //Este es el constructor vacio
    public Auto(){
    }
    
    //Este es el constructor util
    public Auto(String unaMarca, int unAño, double unKm){
        claveUnica = claveUnica +1;
        this.marca = unaMarca;
        this.ano = unAño;
        numKm = unKm;
        //Al momento de crear al Auto nadie lo ha rentado, entonces, el nombre y lic son vacios.
        this.nombreCliente = null;
        //Los tipos de dato int no pueden ser igual a null
        this.numLic = 0;
    }
    
    //Funcionalidad minima
    
    public String getMarca(){
        return this.marca;
    }
   
    public int getAño(){
        return this.ano;
    }
    
    public double getNumKm(){
        return this.numKm;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public int getNumLic(){
        return this.numLic;
    }
    
    public void setNumKm(double nuevosKm){
        numKm = numKm + nuevosKm;
    }
    
    public void setNombreCliente(String unNuevoNombre){
        nombreCliente = unNuevoNombre;
    }
    
    public void setNumLic(int nuevaLic){
        numLic = nuevaLic;
    }
    
    public boolean equals(Auto otroAuto){
        boolean resp = false;
        //En las comparaciones entre tipos String se utiliza equals en vez de "==" 
        if(otroAuto.getAño() == this.ano && otroAuto.getMarca().equals(this.marca))
            resp = true;
        return resp;
    }
    
    public int compareTo(Auto otroAuto){
        int resp;
        if(this.ano > otroAuto.getAño())
            resp = 1;
        else{
            if(this.ano == otroAuto.getAño())
                resp = 0;
            else
                resp = -1;
        }
        
        return resp;
    }

    public String toString() {
        return "Auto{" + "marca=" + marca + ", nombreCliente=" + nombreCliente + ", Año=" + ano + ", numLic=" + numLic + ", numKm=" + numKm + '}';
    }
    
    
    //Aqui empieza la funcionalidad extra del problema
    //En este metodo solo aceptamos la renta de un coche en dias enteros.
    public double Renta(String nombre, int lic, int dias){
        double precio;
        
        if(nombreCliente != null && numLic != 0){
            System.out.println("El auto está rentado.");
            return 0;
        }
        
        this.nombreCliente = nombre;
        this.numLic = lic;
        
        if(this.ano < 2005){
            precio = 200 * dias;
        }
        else
            precio = 300 * dias;
        
        if(this.numKm < 20000){
            precio = precio + (20*dias);
        }
        
       return precio;
    }
    
    //Funcion devolucion
    public boolean Devolucion(double Kmfinal){
        boolean resp = false;
        
        if(nombreCliente == null && numLic == 0){
            System.out.println("Este auto no esta prestado");
            return resp;
        }
        else{
            this.setNombreCliente(null);
            this.setNumLic(0);
        
            this.setNumKm(Kmfinal);
            resp = true;
        
            return resp;
        }
    }
    
    
}
