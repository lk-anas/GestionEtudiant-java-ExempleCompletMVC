package exoPIX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Contajout implements ActionListener{
	
	Groupe gpr;
	JTextField nom ;
	JTextField prenom ;
	JTextField dn ;
	
	public Contajout(Groupe g, JTextField n, JTextField p, JTextField d) {
		gpr = g ;
		nom = n;
		prenom = p;
		dn = d;	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nt = nom.getText();
		String pt = prenom.getText();
		String dt = dn.getText();

		Etudiant e1 = new Etudiant(nt,pt,dt,gpr);
		
	}

}
