
public class Joueur extends Personnage {

	private Integer nbPas;
	private Inventaire inventaire;
	
	
	//Faire défiler l'inventaire (boucle) et le pnj voit si il y a l'objet demandé ou non
	public Objet montrer(int numero)
	{
		return this.inventaire.get(numero);
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
	
	public void prendre(Objet o)
	{
		//L'inventaire est une LinkedList
		this.inventaire.add(o);
	}
	
	public void consulterInventaire()
	{
		this.inventaire.afficherInventaire;
	}
	
	public Objet fouiller(Position lieu)
	{
		return this.position.getLieu.getObjetPresent();
		//Chaque position est reliée à un lieu
	}
}