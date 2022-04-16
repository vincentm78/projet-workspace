
public class Objet {

	private String nom;
	private Lieu lieu;
	private Personnage détenuPar;
	private MembreFamille liéA;
	//private String caractéristiques;
	private Boolean possédé = false;
	
	
	
	
	public Objet(String nom, Lieu lieu, Personnage détenuPar, MembreFamille liéA) {
		super();
		this.nom = nom;
		this.lieu = lieu;
		this.détenuPar = détenuPar;
		this.liéA = liéA;
	}




	public void trouver()
	{
		this.possédé = true;
	}


	 
	//à modifier en fonction du lancement
	public String toString() {
		return "Objet [nom=" + nom + ", détenuPar=" + détenuPar + ", liéA=" + liéA + ", possédé="
				+ possédé + "]";
	}
	
	
}
