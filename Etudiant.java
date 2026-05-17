package exoPIX;

import java.io.*;
import java.time.LocalDate;
import java.util.*;


public class Etudiant {
	
	public String nom;
	public String prenom;
	public LocalDate dateNaissance;
	
	public Groupe groupe;
	
	public Etudiant(String n, String p, String d, Groupe g) {
		nom = n;
		prenom = p;
		dateNaissance = LocalDate.parse(d);  
		groupe = g;
		g.ajoutEtudiant(this);
	}
	


}


