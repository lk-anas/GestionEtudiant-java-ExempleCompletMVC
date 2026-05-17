package exoPIX;

import java.io.*;
import java.time.LocalDate;
import java.util.*;


public class Groupe {
	
	public String nom;

    public Vector<Etudiant> listEtudiant = new Vector<Etudiant>();
    
    public void ajoutEtudiant(Etudiant e) {listEtudiant.add(e);}
    
    public Groupe(String n) {
    	nom = n;
    }
    
    public Etudiant getEtudiantParNom(String n) {
        for (int i = 0; i < listEtudiant.size(); i++) {
        	Etudiant e = listEtudiant.get(i);
        	if(e.nom.equals(n)) {
        		return e;
        	}
        }
        return null;
    }
    
    public Etudiant getEtudiantParPrenom(String n) {
        for (int i = 0; i < listEtudiant.size(); i++) {
        	Etudiant e = listEtudiant.get(i);
        	if(e.prenom.equals(n)) {
        		return e;
        	}
        }
        return null;
    }
    
    public Etudiant getEtudiantParDate(String d) {
    	LocalDate dt = LocalDate.parse(d);
        for (int i = 0; i < listEtudiant.size(); i++) {
        	Etudiant e = listEtudiant.get(i);
        	if(e.dateNaissance.equals(dt)) {
        		return e;
        	}
        }
        return null;
    }
    
    

}
