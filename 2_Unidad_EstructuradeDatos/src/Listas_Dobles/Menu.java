package Listas_Dobles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setFont(new Font("Arial", Font.BOLD, 13));
		setTitle("ESTRUCTURA DE DATOS | MIGUEL GALINDO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElTipo = new JLabel("> Ingrese el tipo de Canci\u00F3n");
		lblIngreseElTipo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIngreseElTipo.setBounds(121, 73, 192, 30);
		contentPane.add(lblIngreseElTipo);
		
		JLabel lblIngreseLaCancin = new JLabel("> Ingrese la Canci\u00F3n");
		lblIngreseLaCancin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIngreseLaCancin.setBounds(121, 106, 172, 30);
		contentPane.add(lblIngreseLaCancin);
		
		JLabel lblIngreseElAlbum = new JLabel("> Ingrese el Album");
		lblIngreseElAlbum.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIngreseElAlbum.setBounds(121, 147, 152, 30);
		contentPane.add(lblIngreseElAlbum);
		
		JLabel lblIngreseElAutor = new JLabel("> Ingrese el Autor");
		lblIngreseElAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIngreseElAutor.setBounds(121, 188, 152, 24);
		contentPane.add(lblIngreseElAutor);
		
		JLabel lblIngreseElId = new JLabel("> Ingrese el ID");
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIngreseElId.setBounds(121, 237, 135, 17);
		contentPane.add(lblIngreseElId);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(317, 78, 119, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setBounds(260, 114, 122, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setBounds(250, 152, 119, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setBounds(250, 190, 119, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setBounds(250, 235, 119, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnIngresarNodoAdelante = new JButton("Ingresar Nodo Adelante ");
		btnIngresarNodoAdelante.setFont(new Font("Arial", Font.BOLD, 11));
		btnIngresarNodoAdelante.setBounds(10, 427, 188, 23);
		contentPane.add(btnIngresarNodoAdelante);
		
		JButton btnInsertarNodoAtras = new JButton("Insertar Nodo Atras");
		btnInsertarNodoAtras.setFont(new Font("Arial", Font.BOLD, 11));
		btnInsertarNodoAtras.setBounds(230, 427, 152, 23);
		contentPane.add(btnInsertarNodoAtras);
		
		JButton btnEliminarPrimerNodo = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimerNodo.setFont(new Font("Arial", Font.BOLD, 11));
		btnEliminarPrimerNodo.setBounds(420, 427, 165, 23);
		contentPane.add(btnEliminarPrimerNodo);
		
		JButton btnRecorridoHaciaAdelante = new JButton("Recorrido hacia Adelante ");
		btnRecorridoHaciaAdelante.setFont(new Font("Arial", Font.BOLD, 11));
		btnRecorridoHaciaAdelante.setBounds(10, 476, 181, 23);
		contentPane.add(btnRecorridoHaciaAdelante);
		
		JButton btnRecorridoHaciaAtras = new JButton("Recorrido hacia Atras ");
		btnRecorridoHaciaAtras.setFont(new Font("Arial", Font.BOLD, 11));
		btnRecorridoHaciaAtras.setBounds(230, 476, 165, 23);
		contentPane.add(btnRecorridoHaciaAtras);
		
		JButton btnEliminarUltimoNodo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimoNodo.setFont(new Font("Arial", Font.BOLD, 11));
		btnEliminarUltimoNodo.setBounds(420, 476, 165, 23);
		contentPane.add(btnEliminarUltimoNodo);
		
		JButton btnSalir = new JButton("SALIR ");
		btnSalir.setFont(new Font("Arial", Font.BOLD, 11));
		btnSalir.setBounds(250, 517, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblMEN = new JLabel("M E N U");
		lblMEN.setFont(new Font("CentSchbkCyrill BT", Font.BOLD, 15));
		lblMEN.setBounds(273, 11, 122, 30);
		contentPane.add(lblMEN);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\migue\\workspace\\2_Unidad_EstructuradeDatos\\Imagenes\\00-linea-separadora2.png"));
		label_1.setBounds(10, 39, 547, 14);
		contentPane.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(26, 283, 523, 105);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\migue\\workspace\\2_Unidad_EstructuradeDatos\\Imagenes\\12_bg_Modified.jpg"));
		label.setBounds(0, 0, 595, 565);
		contentPane.add(label);
	}
}
