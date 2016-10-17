package General;

public class Pan {
	private static int id = 1111;
	private int tipoPan, numIng, numPan, tipoHar, numPanes;
	private String nombre;
	private char figura;
	
	public Pan(String nombre, int tipoPan){
		this.id = this.id + 1;
		this.numPan = this.id;
		this.nombre = nombre;
		this.tipoPan = tipoPan;
	}
		
	public Pan(String nombre, int tipoPan, int numIng, int tipoHar, char figura){
		this.id = this.id + 1;
		this.numPan = this.id;
		this.nombre = nombre;
		this.tipoPan = tipoPan;
		this.numIng = numIng;
		this.tipoHar = tipoHar;
		this.figura = figura;
	}

	public int getNumIng() {
		return numIng;
	}

	public void setNumIng(int numIng) {
		this.numIng = numIng;
	}

	public int getTipoHar() {
		return tipoHar;
	}

	public void setTipoHar(int tipoHar) {
		this.tipoHar = tipoHar;
	}

	public char getFigura() {
		return figura;
	}

	public void setFigura(char figura) {
		this.figura = figura;
	}

	public int getTipoPan() {
		return tipoPan;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPan() {
		return numPan;
	}
	
	public int compareTo(Pan otroPan){
		int resp;
		if(this.numPan == otroPan.getNumPan())
			resp = 0;
		else
			if(this.numPan > otroPan.getNumPan())
				resp = 1;
			else
				resp = 2;
		return resp;
	}

	public String toString() {
		return "Nombre: " + nombre + ", TipoPan: " + tipoPan + ", NumIng: " + numIng + ", TipoHar: " + tipoHar
				+ ", Figura: " + figura + ", NumPan: " + numPan;
	}
	
	public double calcCosto(){
		double costo = 0, harina = 0;
			switch (this.tipoHar){
			case 0: harina = 0.20;
				break;
			case 1: harina = 0.32;
				break;
			case 2: harina = 0.18;
				break;
			}
		if(this.numIng <= 4)
			costo = 4.75 + harina;
		else
			if(this.numIng > 4 && this.numIng < 6)
				costo = 5.60 + harina;
			else
				if(this.numIng >= 6)
					costo = 6.60 + harina;
		return costo;
	}
	
	public double calcTiempo(int numPanes){
		double tiempo = 0;
		int tiempoH = 0;
		this.numPanes = numPanes;
		switch (tipoHar){
			case 0: tiempoH = 3;
				break;
			case 1: tiempoH = 5;
				break;
			case 2: tiempoH = 3;
				break;
		}	
		switch(this.figura){
		case 'r': tiempo = 2 * numPanes + tiempoH;
			 	break;
		case 'c': tiempo = 1 * numPanes + tiempoH;
		}
		return tiempo;
	}
}
