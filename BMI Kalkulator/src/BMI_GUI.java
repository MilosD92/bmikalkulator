import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JTextArea;
import javax.swing.JTextPane;




public class BMI_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textV;
	private JTextField textT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_GUI frame = new BMI_GUI();
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
	public BMI_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textV = new JTextField();
		textV.setBounds(39, 28, 150, 34);
		contentPane.add(textV);
		textV.setColumns(10);
		
		textT = new JTextField();
		textT.setBounds(206, 28, 150, 34);
		contentPane.add(textT);
		textT.setColumns(10);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("");
		textPane.setBounds(206, 109, 150, 86);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Izracunaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BMI v = new BMI();
				try{	
					double visina=Double.parseDouble(textV.getText());
					double tezina = Double.parseDouble(textT.getText());
					String bmi= v.vrednostBMI(tezina, visina);
						
					textPane.setText(bmi);
				}catch(Exception error){
					JOptionPane.showMessageDialog(null, "Greska");
				}
				
			}
		});
		btnNewButton.setBounds(39, 93, 127, 158);
		contentPane.add(btnNewButton);
		
		JLabel lblVisina = new JLabel("VISINA (m)");
		lblVisina.setBounds(79, 11, 62, 14);
		contentPane.add(lblVisina);
		
		JLabel lblTezina = new JLabel("TEZINA (kg)");
		lblTezina.setBounds(255, 11, 75, 14);
		contentPane.add(lblTezina);
		
		JLabel lblNewLabel = new JLabel("BMI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(216, 73, 114, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
				textT.setText("");
				textV.setText("");
			}
		});
		btnObrisi.setBounds(233, 217, 89, 23);
		contentPane.add(btnObrisi);
		
		
		
		
	}
}
