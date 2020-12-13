package exo1_A;

public class EtudiantRepresentant extends Etudiant {
	private static EtudiantRepresentant singleton= null;

	private EtudiantRepresentant() {};

	public static EtudiantRepresentant getInstance() {
		if(singleton==null)
			singleton= new EtudiantRepresentant();
		return singleton;
	}
}
