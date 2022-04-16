
public class Position {

	private Ville ville;
	private Lieu numCase;
	
	public void afficherPosition()
	{
		System.out.println("Vous êtes dans '" + this.numCase + "' à " + this.ville.getNom());
	}
}