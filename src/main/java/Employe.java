public class Employe {
	protected float salaire;
	protected int anciennete;

	public employe (float salaire, int anciennete){
		this.salaire = salaire;
		this.anciennete = anciennete;
	
	public double getSalaire (double s) {
		s = this.salaire;
		return s;
	}

	public int getAnciennete (int a) {
		a = this.anciennete;
		return a;
	}

	public double salaireEmployee() {
		return 1500 + (20 * anciennete);
	}

}