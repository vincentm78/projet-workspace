import java.util.LinkedList;

public class Inventaire {

	LinkedList<Objet> inventaire = new LinkedList<Objet>();
	
	
	public void afficherInventaire()
	{
		int i = 0;
		while(i < this.inventaire.size())
		{
			System.out.println(this.inventaire.get(i));
			i++;
		}
	}
}