public class Pnj extends Personnage {

	private String role;

	public Pnj(String nom, String prenom, Position positionDonnĂ©, String sexe, String role) {
		super(nom, prenom, positionDonnĂ©, sexe);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}