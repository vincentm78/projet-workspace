public class JoueurPrincipal extends Personnage {

	private Integer nbPas = 0;
	
	
	public void montrer(Objet aMontrer)
	{
		System.out.println("Vous montrez l'objet suivant : " + aMontrer.nom);
	}
	
	public void seDeplacer(Direction dir)
	{
		this.nbPas =+ 1;
		// Effacer méthode ajouterPas
		this.setPosition(dir);
	}
	
	public void Prendre(Lieu ici)
	{
		if(ici.objetPrésent == null)
		{
			System.out.println("Il n'y a rien ici");
		}
		else
		{
			System.out.println("L'objet ramassé est : " + ici.objetPrésent.nom);
			ici.objetPrésent = null;
			
		}
		// Repetition de fouiller
	}
	

	public void parler(Lieu ici)
	{
		if(ici.personnePrésente == null)
			System.out.println("T'es solo");
		else
		{
			System.out.println("Salut");
		}
	}
	
	public void consulterInventaire(Inventaire perso)
	{
		perso.afficherInventaire();
	}
		
}