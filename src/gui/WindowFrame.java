package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	WindowFrame frame;
	
	MenuSelection menuselection;
	IdAdder idadder;
	IdViewer idviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.idadder = new IdAdder(this);
		this.idviewer = new IdViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public IdAdder getIdadder() {
		return idadder;
	}

	public void setIdadder(IdAdder idadder) {
		this.idadder = idadder;
	}

	public IdViewer getIdviewer() {
		return idviewer;
	}

	public void setIdviewer(IdViewer idviewer) {
		this.idviewer = idviewer;
	}



}
