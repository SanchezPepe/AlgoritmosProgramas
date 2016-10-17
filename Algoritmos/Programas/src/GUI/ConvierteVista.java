package GUI;

/* Ejemplo de GUI
 * Silvia Guardati
 * Agosto - diciembre de 2014
 * Módulo "Vista".
 */

// Se importan las clases necesarias para el manejo de GUI
import javax.swing.*;
import java.awt.*;

public class ConvierteVista extends JFrame {
		protected JTextField kilometros, millas;
		private JLabel km, mi;
		
		public ConvierteVista(String titulo) {
			super(titulo);
			
			// Se construyen los componentes de la GUI
			km = new JLabel("Kilómetros:");
			kilometros = new JTextField(16);
			mi  = new JLabel("Millas:");
			millas = new JTextField(16);
			
			// Se agregan al contenedor
			this.setLayout(new FlowLayout());
			this.add(km);
			this.add(kilometros);
			this.add(mi);
			this.add(millas);
			
			// Visualización
			this.setBounds(100, 100, 200, 135);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);			
		}	
	}


/* ACTIVIDAD A DESARROLLAR POR LOS ALUMNOS:
 * 
 *  1) Analiza el código.
 *  2) Modifica el código adaptándolo a tu gusto (color, etc.)
 */