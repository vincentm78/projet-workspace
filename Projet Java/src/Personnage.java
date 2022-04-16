
public class Personnage {

	private String pseudo;
	private Position position;
	private char sexe;
	
	
	public Personnage(String pseudo, Localisation localisation, char sexe) {
		super();
		this.pseudo = pseudo;
		this.localisation = localisation;
		this.sexe = sexe;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public Localisation getLocalisation() {
		return localisation;
	}


	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}


	public char getSexe() {
		return sexe;
	}


	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	
}
