
public class Pnj extends Personnage{

	private String role;
	private Objet objetDetenu;
	
	
	public Pnj(String pseudo, Position localisation, char sexe, String role, Objet objetDetenu) {
		super(pseudo, localisation, sexe);
		this.role = role;
		this.objetDetenu = objetDetenu;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Objet getObjetDetenu() {
		return objetDetenu;
	}


	public void setObjetDetenu(Objet objetDetenu) {
		this.objetDetenu = objetDetenu;
	}
	
	
}
