package exoPIX;


public class Main {

	public static void main(String[] args) {
		Groupe grp1 = new Groupe("GROUPE 1");
		
		VuePrincipale vu1 = new VuePrincipale(grp1);

		
		//VuePrincipale vu1 = new VuePrincipale(grp1);
		//VueAjouter vu2 = new VueAjouter(grp1);
		//VueChercher vu3 = new VueChercher(grp1);
		
		vu1.show();vu1.pack();
		//vu2.show();vu2.pack();
		//vu3.show();vu3.pack();

	}

}






