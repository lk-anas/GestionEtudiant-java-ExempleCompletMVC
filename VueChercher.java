package exoPIX;

import java.awt.*;
import javax.swing.*;

public class VueChercher extends JFrame{
	
	JButton chercher = new JButton("chercher");
	JTextField valnom;	
	JTextField valprenom;	
	JTextField valDate;	
	
	JLabel affnom; 
	JLabel affprenom;
	JLabel affDate;

	Groupe grp;
	
	public VueChercher(Groupe g) {
		grp = g;
		this.setTitle(grp.nom);
		this.setPreferredSize(new Dimension(300,150));
		
		valnom = new JTextField();
		valprenom = new JTextField();
		valDate = new JTextField();
		
		affnom = new JLabel("nom : ");
		affprenom = new JLabel("prenom : ");
		affDate = new JLabel("date : ");

		JPanel aff = new JPanel();
		aff.setLayout(new GridLayout(3,2));		
		
		aff.add(affnom); 
		aff.add(valnom);
		
		aff.add(affprenom);
		aff.add(valprenom);
		
		aff.add(affDate); 
		aff.add(valDate);
		
	    JPanel add = new JPanel();
	    add.setLayout(new FlowLayout(FlowLayout.CENTER));
	    add.add(chercher);
	    
	    this.getContentPane().setLayout(new BorderLayout());
	    this.getContentPane().add(aff, BorderLayout.CENTER);
	    this.getContentPane().add(add, BorderLayout.SOUTH);
	    
	     ContRech cr = new ContRech(grp,valnom,valprenom,valDate);
	     chercher.addActionListener(cr);
		
	}
}

