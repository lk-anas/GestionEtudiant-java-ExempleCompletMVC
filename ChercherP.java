package exoPIX;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChercherP implements ActionListener {
	Groupe gpr;
	
	public ChercherP(Groupe p) {
		gpr = p ;
	}
	
	public void actionPerformed(ActionEvent e) {
		VueChercher vua = new VueChercher(gpr);
		vua.show();
		vua.pack();
	}
}
