/*
 * Descripci�n: Descripci�n de los vehiculos
 * Autores: David Armando Rodr�guez Var�n, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Automovil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class DetallesAuto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	//Campos la informaci�n
	JLabel lblNombrev = new JLabel("NombreV");
	JLabel lblTipov = new JLabel("TipoV");
	JLabel lblAov = new JLabel("A\u00F1oV");
	JLabel lblCaballosv = new JLabel("CaballosV");
	JLabel lblPuertasv = new JLabel("PuertasV");
	JLabel lblVelocidadesv = new JLabel("VelocidadesV");
	JLabel lblPreciov = new JLabel("PrecioV");
	JLabel lblAirbagv = new JLabel("AirbagV");
	JLabel lblImagen = new JLabel("");
	//Strings donde van las acciones
	String arrancar=null;
	String apagar=null;
	String acelerar=null;
	String girarIzq=null;
	String girarDer=null;
	String frenar=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DetallesAuto dialog = new DetallesAuto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void anadirInfo(Automovil auto) {
		String[] datos= {auto.nombre, auto.tipoAutomovil, Integer.toString(auto.anio), Integer.toString(auto.motorHp), 
				Integer.toString(auto.puertas), Integer.toString(auto.velocidades),auto.precio, ""};
		//Para que imprima si o no y no true o false
		if(auto.airBag) {
			datos[7]="Si";
		}else {
			datos[7]="No";
		}
		lblNombrev.setText(datos[0]);
		lblTipov.setText(datos[1]);
		lblAov.setText(datos[2]);
		lblCaballosv.setText(datos[3]);
		lblPuertasv.setText(datos[4]);
		lblVelocidadesv.setText(datos[5]);
		lblPreciov.setText("$ "+datos[6]);
		lblAirbagv.setText(datos[7]);
		//Asigna las cadenas de texto de las acciones
		arrancar=auto.arrancar();
		apagar=auto.apagar();
		acelerar=auto.acelerar();
		girarIzq=auto.girarIzq();
		girarDer=auto.girarDer();
		frenar=auto.frenar();
	}

	/**
	 * Create the dialog.
	 */
	public DetallesAuto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DetallesAuto.class.getResource("/recursos/icono.png")));
		setBounds(100, 100, 650, 393);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
			lblNombre.setBounds(37, 32, 185, 21);
			contentPanel.add(lblNombre);
		}
		
		JLabel lblCaballosDeFuerza = new JLabel("Caballos de fuerza:");
		lblCaballosDeFuerza.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCaballosDeFuerza.setBounds(37, 110, 185, 14);
		contentPanel.add(lblCaballosDeFuerza);
		
		JLabel lblTipoDeVehiculo = new JLabel("Tipo de vehiculo:");
		lblTipoDeVehiculo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblTipoDeVehiculo.setBounds(37, 60, 185, 14);
		contentPanel.add(lblTipoDeVehiculo);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAo.setBounds(37, 85, 185, 14);
		contentPanel.add(lblAo);
		
		JLabel lblCantidadDePuertas = new JLabel("Cantidad de puertas:");
		lblCantidadDePuertas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCantidadDePuertas.setBounds(37, 135, 185, 14);
		contentPanel.add(lblCantidadDePuertas);
		
		JLabel lblCantidadDeVelocidades = new JLabel("Cantidad de velocidades:");
		lblCantidadDeVelocidades.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCantidadDeVelocidades.setBounds(37, 160, 185, 14);
		contentPanel.add(lblCantidadDeVelocidades);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPrecio.setBounds(37, 185, 185, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblAirbag = new JLabel("Airbag:");
		lblAirbag.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAirbag.setBounds(37, 206, 185, 21);
		contentPanel.add(lblAirbag);
		
		//Lbl donde se coloca informaci�n
		lblNombrev.setBounds(191, 35, 167, 14);
		contentPanel.add(lblNombrev);
		
		lblTipov.setBounds(191, 60, 81, 14);
		contentPanel.add(lblTipov);
		
		lblAov.setBounds(191, 85, 102, 14);
		contentPanel.add(lblAov);
		
		lblCaballosv.setBounds(191, 110, 102, 14);
		contentPanel.add(lblCaballosv);
		
		lblPuertasv.setBounds(191, 135, 102, 14);
		contentPanel.add(lblPuertasv);
		
		lblVelocidadesv.setBounds(191, 160, 121, 14);
		contentPanel.add(lblVelocidadesv);
		
		lblPreciov.setBounds(191, 185, 94, 14);
		contentPanel.add(lblPreciov);

		lblAirbagv.setBounds(191, 210, 104, 14);
		contentPanel.add(lblAirbagv);
		
		//--------------------Botones de acciones------------------------------------
		
		JButton btnArrancar = new JButton("");
		btnArrancar.setContentAreaFilled(false);
		btnArrancar.setBorderPainted(false);
		btnArrancar.setFocusTraversalKeysEnabled(false);
		btnArrancar.setFocusPainted(false);
		btnArrancar.setRequestFocusEnabled(false);
		btnArrancar.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/arrancar.png")));
		btnArrancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,arrancar);
			}
		});
		btnArrancar.setBounds(34, 246, 81, 30);
		contentPanel.add(btnArrancar);
		
		JButton btnApagar = new JButton("");
		btnApagar.setContentAreaFilled(false);
		btnApagar.setBorderPainted(false);
		btnApagar.setFocusable(false);
		btnApagar.setFocusTraversalKeysEnabled(false);
		btnApagar.setFocusPainted(false);
		btnApagar.setRequestFocusEnabled(false);
		btnApagar.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/apagar.png")));
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,apagar);
			}
		});
		btnApagar.setBounds(34, 291, 82, 30);
		contentPanel.add(btnApagar);
		
		JButton btnAcelerar = new JButton("");
		btnAcelerar.setBorderPainted(false);
		btnAcelerar.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/acelerar.png")));
		btnAcelerar.setRequestFocusEnabled(false);
		btnAcelerar.setFocusTraversalKeysEnabled(false);
		btnAcelerar.setFocusPainted(false);
		btnAcelerar.setContentAreaFilled(false);
		btnAcelerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,acelerar);
			}
		});
		btnAcelerar.setBounds(133, 246, 89, 30);
		contentPanel.add(btnAcelerar);
		
		JButton btnGirarIzquierda = new JButton("");
		btnGirarIzquierda.setBorderPainted(false);
		btnGirarIzquierda.setContentAreaFilled(false);
		btnGirarIzquierda.setFocusTraversalKeysEnabled(false);
		btnGirarIzquierda.setFocusPainted(false);
		btnGirarIzquierda.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/GirarIzq.png")));
		btnGirarIzquierda.setRequestFocusEnabled(false);
		btnGirarIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,girarIzq);
			}
		});
		btnGirarIzquierda.setBounds(126, 291, 126, 30);
		contentPanel.add(btnGirarIzquierda);
		
		JButton btnGirarDerecha = new JButton("");
		btnGirarDerecha.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/girarDer.png")));
		btnGirarDerecha.setBorderPainted(false);
		btnGirarDerecha.setContentAreaFilled(false);
		btnGirarDerecha.setFocusPainted(false);
		btnGirarDerecha.setFocusTraversalKeysEnabled(false);
		btnGirarDerecha.setRequestFocusEnabled(false);
		btnGirarDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,girarDer);
			}
		});
		btnGirarDerecha.setBounds(232, 246, 126, 30);
		contentPanel.add(btnGirarDerecha);
		
		JButton btnFrenar = new JButton("");
		btnFrenar.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/Frenar.png")));
		btnFrenar.setBorderPainted(false);
		btnFrenar.setContentAreaFilled(false);
		btnFrenar.setFocusTraversalKeysEnabled(false);
		btnFrenar.setFocusPainted(false);
		btnFrenar.setRequestFocusEnabled(false);
		btnFrenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,frenar);
			}
		});
		btnFrenar.setBounds(275, 291, 73, 30);
		contentPanel.add(btnFrenar);
		{
			JButton okButton = new JButton("");
			okButton.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/ok.png")));
			okButton.setRequestFocusEnabled(false);
			okButton.setFocusTraversalKeysEnabled(false);
			okButton.setFocusPainted(false);
			okButton.setContentAreaFilled(false);
			okButton.setBorderPainted(false);
			okButton.setBounds(532, 302, 73, 42);
			contentPanel.add(okButton);
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		
		
		//--------------------------------------------
		
		lblImagen.setBounds(377, 36, 227, 201);
		contentPanel.add(lblImagen);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DetallesAuto.class.getResource("/recursos/fondo4.jpg")));
		label.setBounds(0, 0, 634, 355);
		contentPanel.add(label);
		this.setLocationRelativeTo(null);
	}
}
