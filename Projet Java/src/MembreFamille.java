
public class MembreFamille extends Pnj{

	private boolean estTrouve;

	public MembreFamille(String pseudo, Position localisation, char sexe, String role, Objet objetDetenu,
			boolean estTrouve) {
		super(pseudo, localisation, sexe, role, objetDetenu);
		this.estTrouve = estTrouve;
	}

	public boolean isEstTrouve() {
		return estTrouve;
	}

	public void setEstTrouve(boolean estTrouve) {
		this.estTrouve = estTrouve;
	}
	
}
