package gui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private UserFormListener formListener;
	public MainPanel()
	{
		
		setBackground(Color.LIGHT_GRAY);		var formLabel = new JLabel("ADD USER");
		
		formLabel.setFont(new Font("Serif",Font.BOLD,40));
		
		
		setLayout(new GridBagLayout());
		var gc = new GridBagConstraints();
		
		
		gc.gridx = 0;
		gc.gridy =0;
		gc.weighty =1;
		//gc.weighty = 30;
	
		
		//gc.gridwidth = 2;
		//gc.gridheight = 0;
		//gc.anchor = GridBagConstraints.EAST;
		add(formLabel,gc);
		
		gc.weighty =5;
		gc.gridy= 6;
		gc.ipadx = 200;
		gc.anchor = GridBagConstraints.NORTH;
		add(createFormPanel(),gc);
		
		
			
	}
	public void setFormListener(UserFormListener formListener)
	{
		this.formListener = formListener;
	}
	
	private  JPanel createFormPanel()
	{
		
		JPanel panel = new JPanel();
		var etchedBorder = BorderFactory.createEtchedBorder();
		var emptyBorder = BorderFactory.createEmptyBorder(10,0,10,0);
		
		panel.setBorder(BorderFactory.createCompoundBorder(etchedBorder,emptyBorder));
		var nameLabel = new JLabel("NAME");
		nameLabel.setFont(new Font("Serif",Font.PLAIN,20));
		var passLabel = new JLabel("PASSWORD ");
		passLabel.setFont(new Font("Serif",Font.PLAIN,20));
		
		var nameField = new JTextField(30);
		nameField.setBorder(new EmptyBorder(5,0,5,0));
		//nameField.setColumns(70);
		var passField = new JTextField(30);
		passField.setBorder(new EmptyBorder(5,0,5,0));
		//passField.setColumns(0);
		
		var addButton = new JButton("SUBMIT");
		addButton.addActionListener(e ->{
			String username = nameField.getText();
			String pass = passField.getText();
			if(formListener != null)
			{
				formListener.formSubmitted(username, pass);
			}
			
		});
		
		addButton.setFont(new Font("Serif",Font.PLAIN,15));
		setLayout(new GridBagLayout());
		var gc = new GridBagConstraints();
		gc.insets = new Insets(10, 10, 10, 10);
		panel.setLayout(new GridBagLayout());
		gc.gridwidth = 1;
		gc.gridx = 0;
		gc.gridy++;
		gc.weighty = 0.2;
		gc.anchor=GridBagConstraints.LINE_START;
		panel.add(nameLabel ,gc);
		gc.gridx = 1;
		gc.anchor=GridBagConstraints.LINE_START;
		panel.add(nameField ,gc);
		gc.gridy++;
		gc.gridx = 0;
		gc.weighty = 0.2;
		gc.anchor=GridBagConstraints.LINE_END;
		panel.add(passLabel,gc);
	
		gc.gridx = 1;
		gc.anchor=GridBagConstraints.LINE_START;
		panel.add(passField ,gc);
		
		gc.gridy++;
		gc.gridx = 1;
		gc.weighty = 30;
		gc.anchor=GridBagConstraints.FIRST_LINE_END;
		panel.add(addButton,gc);
		
		
		return panel;
		
		
	}
	

}
