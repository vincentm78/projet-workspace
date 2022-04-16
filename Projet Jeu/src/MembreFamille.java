public class MembreFamille extends Pnj{

	private Boolean trouvé;
	
	public MembreFamille(String nom, String prenom, Position positionDonné, String sexe, String role) {
		super(nom, prenom, positionDonné, sexe, role);
		this.trouvé = false;
	}

	public void trouver()
	{
		this.trouvé = true;
	}
}