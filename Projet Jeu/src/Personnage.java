public class Personnage {

	private String nom;
	private String prenom;
	private Position position;
	private String sexe;
	
	
	
	public Personnage(String nom, String prenom, Position positionDonnĂ©, String sexe) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.position = positionDonnĂ©;
		this.sexe = sexe;
	}
	
	// Class position Ă  faire

	public void Donner(Objet aDonner)
	{
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
}
