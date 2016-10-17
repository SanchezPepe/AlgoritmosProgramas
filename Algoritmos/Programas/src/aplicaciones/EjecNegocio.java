package aplicaciones;

import general.Negocio;

public class EjecNegocio {

	public static void main(String[] args) {
		
		Negocio n1 = new Negocio();
		n1.altaProd("Mesa", 100);
		n1.altaProd("Silla", 105);
		n1.altaProd("Comedor", 110);
		
		n1.altaProv(180, "Juan");
		n1.altaProv(181, "Ana");
		
		n1.altaCliente(02, "Jose");
		n1.altaCliente(01, "Pedro");
		
		System.out.print("Clientes: " + n1.consultaCli(02));

	}

}
