package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import id.IdInput;
import manager.IdManager;

public class IdViewer extends JPanel {
	
	WindowFrame frame;
	
	IdManager idmanager;

	public IdViewer(WindowFrame frame, IdManager idmanager) {
		this.frame = frame;
		this.idmanager = idmanager;
		
		System.out.println("***" + idmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Site");
		model.addColumn("Idnumber");
		model.addColumn("Contact Info");
		
		for (int i=0; i < idmanager.size(); i++) {
			Vector row = new Vector();
			IdInput ii = idmanager.get(i);
			row.add(ii.getIdnumber());
			row.add(ii.getYourid());
			row.add(ii.getIdsite());
			row.add(ii.getPassword());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
