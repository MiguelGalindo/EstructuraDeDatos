package Listas_Dobles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txttipo;
	private JTextField txtcancion;
	private JTextField txtalbum;
	private JTextField txtautor;
	private JTextField txtid;
	listadoble ld=new listadoble();
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
		

		TextArea txtresultado = new TextArea();
		txtresultado.setBounds(10, 296, 569, 98);
		contentPane.add(txtresultado);
		
		
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
		
		txttipo = new JTextField();
		txttipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txttipo.setBounds(323, 78, 119, 20);
		contentPane.add(txttipo);
		txttipo.setColumns(10);
		
		txtcancion = new JTextField();
		txtcancion.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtcancion.setBounds(262, 114, 122, 20);
		contentPane.add(txtcancion);
		txtcancion.setColumns(10);
		
		txtalbum = new JTextField();
		txtalbum.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtalbum.setBounds(262, 152, 119, 20);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		txtautor = new JTextField();
		txtautor.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtautor.setBounds(250, 190, 119, 20);
		contentPane.add(txtautor);
		txtautor.setColumns(10);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtid.setBounds(250, 235, 119, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JButton btnIngresarNodoAdelante = new JButton("Ingresar Nodo Adelante ");
		btnIngresarNodoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIngresarNodoAdelante.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				if(txtid.getText().isEmpty()||txtcancion.getText().isEmpty()||txtalbum.getText().isEmpty()||txtautor.getText().isEmpty()||txttipo.getText().isEmpty())
				{
				JOptionPane.showMessageDialog(null, "Campos Vacios");
				
			}
			else
			{
				musica nuevo=new musica();
				nuevo.setId(txtid.getText());
				nuevo.setGenero(txttipo.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setArtista(txtautor.getText());
				
				
				ld.insertarnodoadelante(nuevo);
				JOptionPane.showMessageDialog(null, "Valor Agregado");
				
			
				
			}
			}
				
			
		});
		btnIngresarNodoAdelante.setFont(new Font("Arial", Font.BOLD, 11));
		btnIngresarNodoAdelante.setBounds(10, 427, 188, 23);
		contentPane.add(btnIngresarNodoAdelante);
		
		JButton btnInsertarNodoAtras = new JButton("Insertar Nodo Atras");
		btnInsertarNodoAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtid.getText().isEmpty()||txtcancion.getText().isEmpty()||txtalbum.getText().isEmpty()||txtautor.getText().isEmpty()||txttipo.getText().isEmpty())
				{
				JOptionPane.showMessageDialog(null, "Campos Vacios");
				
			}
			else
			{
				musica nuevo=new musica();
				nuevo.setId(txtid.getText());
				nuevo.setGenero(txttipo.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setArtista(txtautor.getText());
			
				
				ld.insertaratras(nuevo);
				JOptionPane.showMessageDialog(null, "VALOR INGRESADO");
				
			
				
			}
			}
		});
		btnInsertarNodoAtras.setFont(new Font("Arial", Font.BOLD, 11));
		btnInsertarNodoAtras.setBounds(230, 427, 152, 23);
		contentPane.add(btnInsertarNodoAtras);
		
		JButton btnEliminarPrimerNodo = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimerNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int x= JOptionPane.showConfirmDialog(null, "Desea Eliminar este Valor de la primera Posicion");
				if(JOptionPane.YES_OPTION==x)
				{
					ld.eliminarprimer();
					JOptionPane.showMessageDialog(null, "Valor eliminado de la Primera Posicion");
					txtresultado.setText("");
					
					
				}
			}
		});
		btnEliminarPrimerNodo.setFont(new Font("Arial", Font.BOLD, 11));
		btnEliminarPrimerNodo.setBounds(420, 427, 165, 23);
		contentPane.add(btnEliminarPrimerNodo);
		
		JButton btnRecorridoHaciaAdelante = new JButton("Recorrido hacia Adelante ");
		btnRecorridoHaciaAdelante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				txtresultado.setText(ld.recorrerhaciaadelante().toString());
			}
		});
		btnRecorridoHaciaAdelante.setFont(new Font("Arial", Font.BOLD, 11));
		btnRecorridoHaciaAdelante.setBounds(10, 476, 181, 23);
		contentPane.add(btnRecorridoHaciaAdelante);
		
		JButton btnRecorridoHaciaAtras = new JButton("Recorrido hacia Atras ");
		btnRecorridoHaciaAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRecorridoHaciaAtras.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				txtresultado.setText(ld.recorrerhaciaatras().toString());
				
			}
		});
		btnRecorridoHaciaAtras.setFont(new Font("Arial", Font.BOLD, 11));
		btnRecorridoHaciaAtras.setBounds(217, 476, 165, 23);
		contentPane.add(btnRecorridoHaciaAtras);
		
		JButton btnEliminarUltimoNodo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimoNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int x= JOptionPane.showConfirmDialog(null, "Desea Eliminar este Valor de la primera Posicion");
				if(JOptionPane.YES_OPTION==x)
				{
					ld.eliminarultimo();
					JOptionPane.showMessageDialog(null, "Valor eliminado de la Ultima Posicion");
					txtresultado.setText("");
										
				}				
				
				
				
				
			}
		});
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
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(64, 39, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\migue\\git\\Unidad2_EstrucuturaDeDatos\\2_Unidad_EstructuradeDatos\\Imagenes\\00-linea-separadora2.png"));
		label_4.setBounds(37, 48, 520, 14);
		contentPane.add(label_4);
		
		JLabel txtarea = new JLabel("");
		txtarea.setIcon(new ImageIcon("C:\\Users\\migue\\git\\Unidad2_EstrucuturaDeDatos\\2_Unidad_EstructuradeDatos\\Imagenes\\12_bg_Modified.jpg"));
		txtarea.setBounds(0, 0, 595, 551);
		contentPane.add(txtarea);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\migue\\workspace\\2_Unidad_EstructuradeDatos\\Imagenes\\12_bg_Modified.jpg"));
		label.setBounds(0, 0, 595, 565);
		contentPane.add(label);
		
	
	}
}
