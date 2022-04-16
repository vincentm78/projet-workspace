
public class Joueur extends Personnage {

	public Joueur(String pseudo, Position localisation, char sexe) {
		super(pseudo, localisation, sexe);
		// TODO Auto-generated constructor stub
	}
	
	private Integer nbPas = 0;
	private Inventaire inv;
	
	
	//Faire défiler l'inventaire (boucle) et le pnj voit si il y a l'objet demandé ou non
	public Objet montrer(int numero)
	{
		return this.inv.inventaire.get(numero);
	}
	
	
	public void seDeplacer(Position direction)
	{
		//Le personnage vas dans le lieu qui rentre en parametre
		if(this.getLocalisation() == direction)
		{
			System.out.println("Vous y êtes déjà");
		}
		else
		{
			this.setLocalisation(direction);
			this.nbPas ++;
		}
		
	}

	
	public void consulterInventaire()
	{
		this.inv.afficherInventaire();
	}
	
	public Objet fouiller(Position lieu)
	{
		return this.position.getLieu.getObjetPresent();
		//Chaque position est reliée à un lieu
	}
}

