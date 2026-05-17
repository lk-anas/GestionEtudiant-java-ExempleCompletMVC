package exoPIX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ContRech  implements ActionListener {
	
	Groupe gpr;
	JTextField nom ;
	JTextField prenom ;
	JTextField dn ;
	
	public ContRech(Groupe g, JTextField n, JTextField p, JTextField d) {
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
		
		if (nt.length() != 0) {
			Etudiant et = gpr.getEtudiantParNom(nt);
			if(et==null) {
				nom.setText("-----");
				prenom.setText("-----");
				dn.setText("-----");
			} else {
				nom.setText(et.nom);
				prenom.setText(et.prenom);
				dn.setText(et.dateNaissance.toString());

			}
		} 

		Etudiant e1 = new Etudiant(nt,pt,dt,gpr);
		
	}

}
