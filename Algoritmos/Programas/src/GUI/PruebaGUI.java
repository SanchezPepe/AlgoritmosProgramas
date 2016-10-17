package GUI;

import java.awt.*;

import javax.swing.*;

public class PruebaGUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel promedio, nombre;
	private String materias[] = {"IMS", "Algoritmos", "ECE"};
	protected JTextField calificacion;
	protected JTextArea promedios;
	protected JComboBox materia;
	protected JButton promedia;
	
	public PruebaGUI(String titulo){
		promedio = new JLabel("Calcula hueueueh");
		nombre = new JLabel("Usuario: ");
		calificacion = new JTextField(8);
		promedios = new JTextArea(3,8);
		
		materia = new JComboBox(materias);
		promedia = new JButton("LOL");
		
		this.setLayout(new FlowLayout()); 
		
		JPanel c3 = new JPanel();
		c3.setBackground(Color.BLACK);
		c3.add(nombre);
		c3.add(materia);
		c3.add(promedio);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
