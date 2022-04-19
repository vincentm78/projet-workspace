import java.util.LinkedList;
//Classe pour tester le contenu des villes
public class Carte
{
	private LinkedList<Ville> carte = new LinkedList<Ville>();
	


	public Carte()
	{
		this.carte= new LinkedList<Ville>();
	}
	
	
	public void creerCarte()
    {
  	  for (int i=0;i<=8;i++)
  	  {
  		  Ville city = new Ville(i);
  		  this.carte.add(city);
  		  
  		  
  	  }
    }

	
	public void affiche()
	{
		for(int i=0;i<this.carte.size();i++)
		{
		Case[][] nv = this.carte.get(i).getGrille().getCase();
		for(int j= 0;j<2;j++)
		{
			for(int k=0;k<2;k++)
			{
			System.out.println(nv[j][k].getLieu());
			}
		}
		}
	}
	
	public void affichePorte()
	{
		for (int i=0;i<this.carte.size();i++)
		{
			Case [][] nv = this.carte.get(i).getGrille().getCase();
			for(int j= 0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
				if(nv[j][k].getPorte()!=null)
				{
				System.out.println("|numVilleEntree = " + nv[j][k].getPorte().getVilleEntree()
				+ " |num Case Entree = " +  nv[j][k].getPorte().getNumCaseEntree()
				+ " |numVilleSortie = " + nv[j][k].getPorte().getVilleSortie()
				+ " |numCaseSortie = " + nv[j][k].getPorte().getNumCaseSortie());
				}
				}
			}
	}
	}
		
		public void afficheTwoPorte()
		{
			for (int i=0;i<this.carte.size();i++)
			{
				Case [][] nv = this.carte.get(i).getGrille().getCase();
				for(int j= 0;j<2;j++)
				{
					for(int k=0;k<2;k++)
					{
					     if(nv[j][k].getTwoPorte()!=null)
					     {
					     System.out.println(
					    		 "|numVilleEntree = " + nv[j][k].getTwoPorte().getPorte1().getVilleEntree() + "|"+
					    	     "|numCaseEntree = " + nv[j][k].getTwoPorte().getPorte1().getNumCaseEntree() + "|"+
					    	     "|numVilleSortie = " + nv[j][k].getTwoPorte().getPorte1().getVilleSortie() + "|"+
					    	     "|numCaseSortie = " + nv[j][k].getTwoPorte().getPorte1().getNumCaseSortie() + "|"
					    		 );
					     System.out.println(
					    		 "|numVilleEntree = " + nv[j][k].getTwoPorte().getPorte2().getVilleEntree() + "|"+
					    	     "|numCaseEntree = " + nv[j][k].getTwoPorte().getPorte2().getNumCaseEntree() + "|"+
					    	     "|numVilleSortie = " + nv[j][k].getTwoPorte().getPorte2().getVilleSortie() + "|"+
					    	     "|numCaseSortie = " + nv[j][k].getTwoPorte().getPorte2().getNumCaseSortie() + "|"
					    		 );
					
					     }
					
					}
				}
			}
		}
		
		
		public LinkedList<Ville> getCarte() {
			return carte;
		}


		public void setCarte(LinkedList<Ville> carte) {
			this.carte = carte;
		}
		
		
	
	
	 
	

	
	
}
