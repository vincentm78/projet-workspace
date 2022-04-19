
public class Personnage {

	private Position position;
	
	
	public Personnage(Position localisation) {
		super();
		this.position = localisation;
	}


	public Position getLocalisation() {
		return position;
	}


	public void setLocalisation(Position localisation) {
		this.position = localisation;
	}


	
}
