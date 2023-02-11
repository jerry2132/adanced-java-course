package swing_programs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;

public class swings extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterInformationsHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swings frame = new swings();
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
	public swings() {
		setBackground(Color.BLUE);
		setAlwaysOnTop(true);
		setForeground(Color.BLUE);
		setTitle("                              WELCOME TO MY FIRST FRAME\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HELLO WORLD");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Poor Richard", Font.PLAIN, 42));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(31, 21, 566, 79);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String label1 = lblNewLabel.getText();
				if(label1.equals("HELLO WORLD"))
				
					lblNewLabel.setText("WELCOME USERS");
				
				
				else 
					lblNewLabel.setText("HELLO WORLD");
			}
		});
		btnNewButton.setFont(new Font("Script MT Bold", Font.PLAIN, 36));
		btnNewButton.setBounds(213, 178, 226, 48);
		contentPane.add(btnNewButton);
		
		txtEnterInformationsHere = new JTextField();
		txtEnterInformationsHere.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 22));
		txtEnterInformationsHere.setText("ENTER INFORMATIONS HERE");
		txtEnterInformationsHere.setBounds(108, 111, 437, 48);
		contentPane.add(txtEnterInformationsHere);
		txtEnterInformationsHere.setColumns(10);
	}
}
