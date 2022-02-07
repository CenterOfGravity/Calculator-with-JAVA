package VentanasDelGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora extends JFrame {

	private JPanel contentPanePrincipal;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;
	private JTextField txtOperador;
	private JLabel lblOperador;
	private JLabel lblNumero2;
	private JLabel lblNumero;
	private JLabel lblResultado;
	private JButton buttonDeResultado;
	private JButton buttonDeSuma;
	private JButton buttonDeResta;
	private JButton buttonDeModulo;
	private JButton buttonDeMultiplicacion;
	private JButton buttonDeDivision;
	private JButton btnDeAgregar;
	private JButton btnDeBorrar;
	private JButton btnDeImprimir;

	
	private int Final = 49, Frente = 0;
	private JButton btnDeSalir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		//FRAME PRINCIAL
		setResizable(false);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/Recursos/calculator.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		//FRAME PRINCIAL
		
		ComponentesDelGui();
		EventosDelGui();
	}
	
	public void ComponentesDelGui() {
		//PANE PRINCIAL
		contentPanePrincipal = new JPanel();
		contentPanePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanePrincipal);
		//PANE PRINCIAL
		
		//TITULO PRINCIAL
		JLabel TituloPrincipal = new JLabel("Calculadora de Operaciones Enteras");
		TituloPrincipal.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		//TITULO PRINCIAL
		
		//SUB TITULOS
		lblNumero2 = new JLabel("Numero 1:");
		
		lblOperador = new JLabel("Operador");
		
		lblNumero = new JLabel("Numero 2:");
		
		lblResultado = new JLabel("Resultado");
		//SUB TITULOS
		
		//CUADRADOS DE TEXTO	
		txtNumero1 = new JTextField();
		txtNumero1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		
		txtOperador = new JTextField();
		txtOperador.setText("+");
		txtOperador.setHorizontalAlignment(SwingConstants.CENTER);
		txtOperador.setEditable(false);
		txtOperador.setColumns(10);
		//CUADRADOS DE TEXTO	
		
		//BONOTONES		
		buttonDeResultado = new JButton("=");
		
		btnDeAgregar = new JButton("G+");		
		btnDeBorrar = new JButton("B-");
		btnDeImprimir = new JButton("I=");
		
		buttonDeSuma = new JButton("+");	
		buttonDeMultiplicacion = new JButton("*");
		buttonDeResta = new JButton("-");	
		buttonDeDivision = new JButton("/");
		buttonDeModulo = new JButton("%");
		
		btnDeSalir = new JButton("Salir");

		//BONOTONES	
		
		//PANELES SEGUNGARIOS
		JPanel panelDeOperaciones = new JPanel();
		panelDeOperaciones.setBorder(new TitledBorder(null, "Operaciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelDeMemoria = new JPanel();
		panelDeMemoria.setBorder(new TitledBorder(null, "Memoria", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelDeSalir = new JPanel();
		//PANELES SEGUNDARIOS
		
		
		//UN MONTON DE COSAS QUE SE GREARON L PARA ACOMODAR LOS COMPONENTES DE ARRIBA DENTRO DE CADA PANEL			
		GroupLayout gl_contentPanePrincipal = new GroupLayout(contentPanePrincipal);
		gl_contentPanePrincipal.setHorizontalGroup(
			gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanePrincipal.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(panelDeOperaciones, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanePrincipal.createSequentialGroup()
							.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNumero2)
								.addComponent(txtNumero1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOperador)
								.addComponent(txtOperador, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanePrincipal.createSequentialGroup()
									.addComponent(panelDeMemoria, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(panelDeSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPanePrincipal.createSequentialGroup()
									.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNumero2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNumero))
									.addGap(18)
									.addComponent(buttonDeResultado)
									.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanePrincipal.createSequentialGroup()
											.addGap(26)
											.addComponent(lblResultado))
										.addGroup(gl_contentPanePrincipal.createSequentialGroup()
											.addGap(18)
											.addComponent(txtResultado)))))
							.addGap(22))))
				.addGroup(gl_contentPanePrincipal.createSequentialGroup()
					.addGap(67)
					.addComponent(TituloPrincipal)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_contentPanePrincipal.setVerticalGroup(
			gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanePrincipal.createSequentialGroup()
					.addComponent(TituloPrincipal)
					.addGap(18)
					.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero2)
						.addComponent(lblResultado)
						.addComponent(lblNumero)
						.addComponent(lblOperador))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtOperador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonDeResultado)
						.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanePrincipal.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPanePrincipal.createParallelGroup(Alignment.BASELINE)
								.addComponent(panelDeOperaciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelDeMemoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPanePrincipal.createSequentialGroup()
							.addGap(33)
							.addComponent(panelDeSalir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		

		GroupLayout groupLayout = new GroupLayout(panelDeSalir);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnDeSalir)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnDeSalir)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelDeSalir.setLayout(groupLayout);
		

		
		GroupLayout gl_panelDeMemoria = new GroupLayout(panelDeMemoria);
		gl_panelDeMemoria.setHorizontalGroup(
			gl_panelDeMemoria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDeMemoria.createSequentialGroup()
					.addGroup(gl_panelDeMemoria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDeMemoria.createSequentialGroup()
							.addComponent(btnDeAgregar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeBorrar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnDeImprimir))
					.addGap(22))
		);
		gl_panelDeMemoria.setVerticalGroup(
			gl_panelDeMemoria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDeMemoria.createSequentialGroup()
					.addGroup(gl_panelDeMemoria.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDeAgregar)
						.addComponent(btnDeBorrar))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnDeImprimir))
		);
		panelDeMemoria.setLayout(gl_panelDeMemoria);
		

		GroupLayout gl_panelDeOperaciones = new GroupLayout(panelDeOperaciones);
		gl_panelDeOperaciones.setHorizontalGroup(
			gl_panelDeOperaciones.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelDeOperaciones.createSequentialGroup()
					.addGroup(gl_panelDeOperaciones.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonDeSuma, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonDeMultiplicacion, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelDeOperaciones.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelDeOperaciones.createSequentialGroup()
							.addComponent(buttonDeResta, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonDeModulo))
						.addComponent(buttonDeDivision, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		gl_panelDeOperaciones.setVerticalGroup(
			gl_panelDeOperaciones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDeOperaciones.createSequentialGroup()
					.addGroup(gl_panelDeOperaciones.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonDeResta)
						.addComponent(buttonDeModulo)
						.addComponent(buttonDeSuma))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelDeOperaciones.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonDeMultiplicacion)
						.addComponent(buttonDeDivision)))
		);
		panelDeOperaciones.setLayout(gl_panelDeOperaciones);
		contentPanePrincipal.setLayout(gl_contentPanePrincipal);
		//UN MONTON DE COSAS QUE SE GREARON L PARA ACOMODAR LOS COMPONENTES DE ARRIBA DENTRO DE CADA PANEL
		
	}
	
	public void EventosDelGui() {
		
		
		CerebroDeLaCalculadora Cerebro = new CerebroDeLaCalculadora();
		
		txtNumero1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();
			      if ( ((c >='0') && (c <= '9')) ) {
			      }else{arg0.consume(); txtResultado.setText("");};  // ignore event}
				try {Integer.parseInt(txtNumero1.getText().trim());}
				catch(NumberFormatException e0) {txtNumero1.setText("");}
			}
		});
		
		txtNumero2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg1) {
				char c = arg1.getKeyChar();
			      if ( ((c >='0') && (c <= '9')) ) {
			      }else{arg1.consume(); txtResultado.setText("");};  // ignore event}
				try {Integer.parseInt(txtNumero2.getText().trim());}
				catch(NumberFormatException e0) {txtNumero2.setText(""); txtResultado.setText("");}
			}
		});

		buttonDeSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperador.setText("+"); txtResultado.setText("");
			}			
		});
		
		buttonDeResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperador.setText("-"); txtResultado.setText("");
			}
		});
		
		buttonDeModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperador.setText("%"); txtResultado.setText("");
			}
		});
		
		buttonDeMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperador.setText("*"); txtResultado.setText("");
			}
		});
		
		buttonDeDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOperador.setText("/"); txtResultado.setText("");
			}
		});
		
		
		buttonDeResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Numero1 = "", Numero2 = "", Operador = "";
				boolean inicio1 = true;
	
				Numero1=txtNumero1.getText().trim();
				Numero2=txtNumero2.getText().trim();
				Operador= txtOperador.getText().trim();

				
				
				
				if ( Numero1.isEmpty() ||  Numero2.isEmpty()) {txtResultado.setText("");}
				else 
				{
				if (Operador.equals("+")) {txtResultado.setText(Cerebro.suma(Numero1, Numero2));}
				if (Operador.equals("-")) {txtResultado.setText(Cerebro.resta(Numero1, Numero2));}
				if (Operador.equals("*")) {txtResultado.setText(Cerebro.multiplicacion(Numero1, Numero2));}
				if (Operador.equals("/")) 
				{
					if(Numero2.equals("0")) {txtNumero2.setText(""); txtResultado.setText("Error ! Sorry :(");}
				    else {txtResultado.setText(Cerebro.division(Numero1, Numero2));}
				}
				if (Operador.equals("%")) 
				{
					if(Numero2.equals("0")) {txtNumero2.setText(""); txtResultado.setText("Error ! Sorry :(");}
					else {txtResultado.setText(Cerebro.modulo(Numero1, Numero2));}
				}
				}
				
				
				
			}
		});
		
		
		btnDeAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtResultado.getText().isEmpty()) {}
				else 
				{
				Cerebro.agregar(txtResultado.getText(), txtNumero1.getText(), txtNumero2.getText());
				}
			}
		});
		
		btnDeBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cerebro.eliminar();				
			}
		});
		
		btnDeImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				SubVentana1 subventana1 = new SubVentana1 ();						

				subventana1.setVisible(true);	
				subventana1.mostrarDatos(Cerebro.imprimir(), Cerebro.regresarFinal(), Cerebro.regresarFrente());
			}
		});
		
		
		
		btnDeSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(ABORT);
			}
		});
		
	}
}
