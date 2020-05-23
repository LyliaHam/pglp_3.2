import java.util.ArrayList;
import java.util.List;

	public class Entreprise {
		
		private final ArrayList<Employe> listeDesEmployes;
		
		public Entreprise (ArrayList<Employe> listeDesEmployes) {
			this.listeDesEmployes = listeDesEmployes;
		}
		
		public Entreprise () {
			salaireListe = new ArrayList<Salaire>();
		} 

	  public double salaireTotal() {
		double somme = 0;
		for (int i = 0;i < listeDesEmployees.size();i++) {
			somme = somme + listeDesEmployes.get(i).salaireEmploye();
		}
		return somme;
		}
}
