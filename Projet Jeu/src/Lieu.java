
public class Lieu {

	private String nom;
	private MembreFamille personnePrésente;
	private Objet objetPrésent;
	private Ville ville;
	private Boolean porte;
	
	
	public Lieu(String nom, MembreFamille personnePrésente, Objet objetPrésent, Ville ville, Boolean porte) {
		super();
		this.nom = nom;
		this.personnePrésente = personnePrésente;
		this.objetPrésent = objetPrésent;
		this.ville = ville;
		this.porte = porte;
	}
	
}