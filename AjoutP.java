package exoPIX;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AjoutP implements ActionListener {
	Groupe gpr;
	
	public AjoutP(Groupe p) {
		gpr = p ;
	}
	
	public void actionPerformed(ActionEvent e) {
		VueAjouter vua = new VueAjouter(gpr);
		vua.show();
		vua.pack();
	}
}
