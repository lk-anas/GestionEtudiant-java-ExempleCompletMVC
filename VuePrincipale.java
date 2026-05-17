package exoPIX;

import java.awt.*;
import javax.swing.*;

public class VuePrincipale extends JFrame{
	
	JButton ajouter = new JButton("ajouter");
	JButton chercher = new JButton("chercher");
	
	Groupe grp;
	
	public VuePrincipale(Groupe g) {
		grp = g;
		this.setTitle(grp.nom);
		
		this.setPreferredSize(new Dimension(200,200));
		
		JPanel aff = new JPanel();
		
	    aff.setLayout(new FlowLayout()); 
	    		
		aff.add(ajouter);
		aff.add(chercher);
		
	    this.getContentPane().setLayout(new BorderLayout());
	    this.getContentPane().add(aff);
	    
	    AjoutP ca= new AjoutP(grp);
	    ajouter.addActionListener(ca);
	    
	    ChercherP cr = new ChercherP(grp);
	    chercher.addActionListener(cr);
	    
	}
}

