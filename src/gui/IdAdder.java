package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class IdAdder extends JPanel {
	
	WindowFrame frame;
	
	public IdAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelSite = new JLabel("Site: ", JLabel.TRAILING);
		JTextField fieldSite = new JTextField(10);
		labelSite.setLabelFor(fieldSite);
		panel.add(labelSite);
		panel.add(fieldSite);
		
		JLabel labelPassword = new JLabel("Password: ", JLabel.TRAILING);
		JTextField fieldPassword = new JTextField(10);
		labelPassword.setLabelFor(fieldPassword);
		panel.add(labelPassword);
		panel.add(fieldPassword);
		
		JLabel labelIdnumber = new JLabel("Idnumber: ", JLabel.TRAILING);
		JTextField fieldIdnumber = new JTextField(10);
		labelIdnumber.setLabelFor(fieldIdnumber);
		panel.add(labelIdnumber);
		panel.add(fieldIdnumber);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
