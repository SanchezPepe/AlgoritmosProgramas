package Lab1;

public class Pan {
    
    //Atributos requeridos por la clase
    
	private int id;
    private int tipoDePan;
    private int numeroDeIngredientes;
    private String nombre;
    private String tipoDeHarina;
    private char figura;
    //Esta variable estática nos ayuda a generar las ID's únicas
    private static int contadorID  = 1110;
    
    /*Programamos la asignación del ID en nuestro constructor por omisión para
      poder utilizarlo en nuestros dos constructores. Recuerden que para ejectuar
      las instrucciones del constructor vacío debemos utilizar la instrucción:
      'this();'.
    */
    public Pan(){
        /*Les sumamos 1 al contadorID antes de asignaralo para que nuestras ID's
        empiecen en 1111 ya que la variable la inicializamos en 1110.
        */
        contadorID = contadorID + 1; 
        this.id = contadorID; 
    }
    
    /*Este es el constructor donde pedimos toda la información requerida por 
    el objeto exceptuando el ID porque la generamos automáticamente en el 
    constructor vacío.
    */
    public Pan(int tipoDePan, int numeroDeIngredientes, String nombre, 
               String tipoDeHarina, char figura) {
        //Con esta instrucción ejecutamos el constructor vacío.
        this();
        //Asignamos los parámetros a nuestro atributos.
        this.tipoDePan = tipoDePan;
        this.numeroDeIngredientes = numeroDeIngredientes;
        this.nombre = nombre;
        this.tipoDeHarina = tipoDeHarina;
        this.figura = figura;
    }

    /*Este constructor sólo pide el tipo de pan y el nombre, en el ejercicio
    nos dicen que necesitamos este contructor también.
    */
    public Pan(int tipoDePan, String nombre) {
        //Con esta instrucción ejecutamos el constructor vacío.
        this();
        //Asignamos nuestros parámetros a nuestro atributos.
        this.tipoDePan = tipoDePan;
        this.nombre = nombre;
    }
    
    /*Esta función calcula el costo toatal de hacer un pan dependiendo de la 
      cantidad de ingredientes que usa y el tipo de harina. Programamos otras
      dos funciones para que nuestro código se vea más límpio.
    */
    public double calcularCosto(){
        //Calculamos el costo de la harina (La función esta abajo).
        double costoHarina = costoDeLaHarina();
        //Calculamos el costo del pan (La función esta abajo).
        double costoPan = costoDelPan();
        //Sumamos ambos costos para tener el costo total.
        double costoTotal = costoHarina + costoPan;
        return costoTotal;
    }
    
    /*Cálculamos con esta función el costo del pan que depende de la cantidad
      de ingredientes.
    */
    public double costoDelPan(){
        double costo = 0;
        if(numeroDeIngredientes <= 4)
            costo = 4.75;
        else
            if(numeroDeIngredientes <= 6)
                costo = 5.6;
        else
                costo = 6.6;
        return costo;
    }
    
    /*Cálculamos con esta función el costo de la harina que depende del tipo
      de harina.
    */
    public double costoDeLaHarina(){
        double ans = 0;
        if(tipoDeHarina.equals("maiz"))
            ans = 0.2;
        else
            if(tipoDeHarina.equals("integral"))
                ans = 0.32;
        else
                if(tipoDeHarina.equals("avena"))
                    ans = 0.18;
        return ans;
    }
    
    
    public int tiempoDeHornadeo(int numPanes){
        int tiempo;
        if(figura == 'r')
            if(tipoDeHarina.equals("maiz") || tipoDeHarina.equals("avena"))
                tiempo = 2*numPanes + 3;
            else
                tiempo = 2*numPanes + 5;
        else
            if(tipoDeHarina.equals("maiz") || tipoDeHarina.equals("avena"))
                tiempo = numPanes + 3;
            else
                tiempo = numPanes + 5;
        return tiempo;
    }
    
    public int comapareTo(Pan other){
    /*
    El auxiliar funciona así, supongamos que mi ID es a y el ID de other es b:
        1) Si a > b entonces (a - b) > 0
        2) Si a < b entonces (a < b) < 0
        3) Si a = b entonces (a - b) = 0
        
    Entonces es más simple guardar a - b en auxiliar y ver si este es mayor a 0,
    menor a 0 o igual a 0.
    */
        int auxiliar = id - other.getId();
        int ans;
        if(auxiliar > 0)
            ans = 1;
        else
            if(auxiliar < 0)
                ans = -1;
        else
                ans = 0;
        return ans;
    }
    
    /*Requerimos el getId() para el compareTo ya que el ID es el criterio de
      comparación.
    */
    public int getId(){
        return this.id;
    }

    public String toString() {
        return "\nInformación del pan: " + "\nID: " + id + "\nTipo de pan: " + tipoDePan 
               + "\nCantidad de ingredientes: " + numeroDeIngredientes 
               + "\nNombre: " + nombre + "\nTipo de harina: " + tipoDeHarina 
               + "Figura: " + figura;
    }

    public void setNumeroDeIngredientes(int numeroDeIngredientes) {
        this.numeroDeIngredientes = numeroDeIngredientes;
    }
    
}
