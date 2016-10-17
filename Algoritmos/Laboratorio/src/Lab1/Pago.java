package Lab1;

public class Pago {
	public static int cont = 0;
	private int id, status;
	private double monto, desc;
	private String tipo;
	
	public Pago(){
		this.id = cont;
		cont = cont + 1;		
	}
	
	public Pago (int status, double monto, String tipo){
		this.status = status;
		this.monto = monto;
		this.tipo = tipo;
	}
	
	public double IVA(){
		return monto * 0.16;
	}
	
	
	public double montoPagar(String bandera){
		double montoTotal;
		
		if(bandera.equals("Si")){
			if(monto >= 200 && monto < 500)
				desc = 0.02;
			else
				
				if(monto >= 500 && monto < 1000)
					desc = 0.025;
				else
				
					if(monto >= 1000)
						desc = 0.03;
		}
		else
			desc = 0;
		monto = monto - monto * desc;
	montoTotal = monto + IVA();
	return montoTotal;
	}
	
}
