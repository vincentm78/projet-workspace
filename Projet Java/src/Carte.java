import java.util.LinkedList;

public class Carte
{
	private LinkedList<Ville> carte = new LinkedList<Ville>();
	private LinkedList<Case> Lieu;
	
	
	public void creerCarte()
    {
  	  for (int i=1;i<=9;i++)
  	  {
  		  Ville city = new Ville(i);
  		  carte.add(city);
  		  for(int j=1;j<=4;j++)
  		  {
  		  Case nv = new Case(i,j);
  		  this.Lieu.add(nv);
  		  }
  		  
  	  }
    }
	
	
	public void creerPorte()
	{
		
	}
	
	
	
	
	
	
	public void testCarte()
	{
		
	}
	
	
	
	
}