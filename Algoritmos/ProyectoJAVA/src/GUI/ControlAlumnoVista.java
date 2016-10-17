package GUI;

import java.awt.*;

import javax.swing.*;

/*José de Jesús Sánchez Aguilar
 * CU: 156190
 * 
 * Definición de la clase ControlAlumnoVista.
 */

public class ControlAlumnoVista extends JFrame {
	
	
	
	private static final long serialVersionUID = 1L;
	static String[] acciones = {"Selecciona","Agregar materia","Agregar calficación","Elimina calificación","Dar de baja una materia","Información de una materia","Promedio general","Salir"};
	protected JComboBox menuCB;
	protected JButton aceptar;
	protected JPanel pan;
	protected JTextArea res;
	
	public static String[] getAcciones() {
		return acciones;
	}

	public JComboBox getMenuCB() {
		return menuCB;
	}
	
	public JTextArea getRes() {
		return res;
	}
	
	public ControlAlumnoVista(String titulo){
		super(titulo);
		
		/*DECLARACION E INTANCIACION DE FONTS PARA CAMBIAR DISEÑO*/
		Font segoe = new Font("Segoe UI", Font.ITALIC, 13);
		Font segoe2 = new Font("Segoe UI", Font.BOLD, 12);
		
		/*DECLARACION E INTANCIACION DEL COLOR DE FONDO DE LA INTERFAZ*/
		Color fondo = new Color(238,238,238);
		
		aceptar = new JButton("Aceptar");
		
		pan = new JPanel();
		menuCB = new JComboBox (acciones);
		res = new JTextArea(12,20);	
		res.setBackground(fondo);
		res.setEditable(false);
		Menu.carga();
		res.setText(Menu.getCon().toString());
		res.setFont(segoe);
	
		pan.add(new Label("Elija una de las opciones")).setFont(segoe2);
		pan.add(menuCB);
		pan.add(aceptar);
		pan.add(res);
		
		this.add(pan);	
		this.setBounds(0,0, 300,340);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}	
}
