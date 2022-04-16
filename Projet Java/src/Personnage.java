
public class Personnage {

	private String pseudo;
	private Position position;
	private char sexe;
	
	
	public Personnage(String pseudo, Position localisation, char sexe) {
		super();
		this.pseudo = pseudo;
		this.position = localisation;
		this.sexe = sexe;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public Position getLocalisation() {
		return position;
	}


	public void setLocalisation(Position localisation) {
		this.position = localisation;
	}


	public char getSexe() {
		return sexe;
	}


	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	
}
