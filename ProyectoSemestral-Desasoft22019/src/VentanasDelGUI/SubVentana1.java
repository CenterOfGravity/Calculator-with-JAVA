package VentanasDelGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class SubVentana1 extends JDialog {
	private JTable table;
	private String[] datoss;
	private String cabezera  [] = {"Resultados"};
	private JPanel buttonPane;
//	CerebroDeLaCalculadora Imprimir = new CerebroDeLaCalculadora();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SubVentana1 dialog = new SubVentana1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SubVentana1() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(2)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JTextArea txtrHola = new JTextArea();
		scrollPane.setViewportView(txtrHola);
		getContentPane().setLayout(groupLayout);
		

	}
	
	
	 void mostrarDatos( String [] datos, int Final, int Frente){
		 
		 
		datoss =  datos;
		System.out.println(Arrays.deepToString(datoss));
		int i = 0;		
//		if (i==0) {txtrHola.setText("Numero1 + Numero 2 = Resultado"+ "\n"); i++;}
		
//		if(datoss[i]=="Memoria Vacia" || datoss[i] == ""  || datoss[i] == "null"  || datoss[i] == " ") {
			
//	}
//		else {
		System.out.println((Frente));
		int t = Frente;
//		if (datos[0]!= "Memoria Vacia" || datoss[i] == "null" ) {}
//		else {
		while((t<=49 && t>=0) && datos[t]!= null ) {	
			

//		txtrHola.append(datoss[t]+"\n");	
		t++;
		}
//		}
		

	}
}
