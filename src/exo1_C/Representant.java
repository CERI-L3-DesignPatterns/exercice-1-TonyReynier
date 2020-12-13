package exo1_C;

import java.util.HashMap;

public class Representant {
	private static Representant singleton= null;
	private HashMap<String,String> listeRepresentants;

	private Representant(Etudiant etudiant, Enseignant enseignant) {
		listeRepresentants = new HashMap<String, String>();
		listeRepresentants.put(etudiant.getClass().getName(), etudiant.getNom());
		listeRepresentants.put(enseignant.getClass().getName(), enseignant.getNom());
	}

	public static Representant getInstance(Etudiant etudiant, Enseignant enseignant) {
		if(singleton==null)
			singleton= new Representant(etudiant, enseignant);
		return singleton;
	}
}
