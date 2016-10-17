package GUI;

    /* Ejemplo de GUI
	 * Silvia Guardati
	 * Agosto - diciembre de 2014
	 * Módulo "Controlador".
	 */

// Se importan clases para el manejo de eventos
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CasaDeCambioControlador extends CasaDeCambioVista{
			
		public CasaDeCambioControlador(String titulo) {
			super(titulo);
			calcular.addActionListener(new Escuchador());
		}
		
		
			
		//Método que convierte pesos a divisas extranjeras. ESTÁ INCOMPLETO
		private double conPesosAOtras(String monD, double cantidad){
			double res;
			if (monD.equals("Euros"))
				res = cantidad / 18;
			else if (monD.equals("Dólar EUA"))
				res = cantidad / 17.4;
			else
				res = cantidad / 18.5;
			return res;	
		}
		

		
		private class Escuchador implements ActionListener { //Clase privada
		
			//INCOMPLETO.
			public void actionPerformed(ActionEvent ev) {
				double cantidad, resultado;
				String monO, monD;
				
				resultado = -1;
				resultadoTA.setText("");
				monO = (String) origenCB.getSelectedItem();	
				monD = (String) destinoCB.getSelectedItem();	
				cantidad = Double.parseDouble(cantidadTF.getText());
				
				if (!monO.equals(monD))
					if (monO.equals("Pesos"))
						resultado = conPesosAOtras(monD, cantidad);
		
				resultadoTA.append("$" + resultado);
			}
	}
		public static void main(String[] args) {

			CasaDeCambioControlador of = new CasaDeCambioControlador("Casa de Bolsa LA HONESTA");
		}
	}
