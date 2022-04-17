import java.util.LinkedList;

public class Joueur extends Personnage {
	

	public Joueur(String pseudo, Position localisation, char sexe) {
		super(pseudo, localisation, sexe);
		// TODO Auto-generated constructor stub
	}
	
	private Integer nbPas = 0;
	private LinkedList<Objet> inventaire = new LinkedList<Objet>();
	
	
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

	
	public Objet fouiller(Position lieu)
	{
		return this.position.getLieu.getObjetPresent();
		//Chaque position est reliée à un lieu
	}
	
	public void afficherInventaire()
	{
		int i = 0;
		while(i < this.inventaire.size())
		{
			System.out.println(this.inventaire.get(i));
			i++;
		}
	}
	
	//****************Reflechir à mettre l'inventaire dans la classe Partie****************

}

