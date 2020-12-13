package exo1_B;

public class EnseignantRepresentant extends Enseignant {
	private static EnseignantRepresentant singleton= null;

	private EnseignantRepresentant() {};

	public static EnseignantRepresentant getInstance() {
		if(singleton==null)
			singleton= new EnseignantRepresentant();
		return singleton;
	}
}
