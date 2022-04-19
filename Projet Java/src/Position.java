public class Position
{
	
	private Integer numVille;
	private Integer numCase;


	public Position(Integer numVille, Integer numCase) {
		this.numVille = numVille;
		this.numCase = numCase;
	}
	
	public String Localisation(Carte Map)
	{
		Ville A = Map.getCarte().get(this.numVille);
		String E= "Vous etes à " + A.donneNomVille(this.numVille) + "et le lieu est ";
		Case[][] nv = A.getGrille().getCase();
		Integer i = 0; Integer j=0;
		switch (this.numCase)
		{
		case 0 : i =0;j=0;
		case 1 : i= 0;j=1;
		case 2 : i=1 ; j=0;
		case 3 : i=1 ; j=1;
		}
		E= E + nv[i][j].getLieu();
		
		return E;
	}
	
	public void afficheLocalisation(Carte Map)
	{
		System.out.println(this.Localisation(Map));
	}
	
	public void PrendrePorte(Porte door)
	{
		this.numVille=door.getVilleSortie();
		this.numCase=door.getNumCaseSortie();
		
	}
	
	//dans le cas d'une direction de case en case
	public void modifieCase(Integer x)
	{
		//x est le numero qui est renvoyé à l'aide d'une commande de direction
		if(this.numCase==0)
		{
			if(x==0)
			{
				System.out.println("Impossible de monter, votre position reste inchangée");
			}
			if(x==1)
			{
				System.out.println("Impossible d'aller à l'ouest, votre position reste inchangée");
			}
			if(x==2)
			{
				this.numCase=1;
			}
			if(x==3)
			{
				this.numCase=2;
			}
			
		}
		
		if(this.numCase==1)
		{
			if(x==0)
			{
				System.out.println("Impossible de monter, votre position reste inchangée");
			}
			if(x==1)
			{
				this.numCase=0;
			}
			if(x==2)
			{
				System.out.println("Impossible d'aller à l'est, votre position reste inchangée");
			}
			if(x==3)
			{
				this.numCase=3;
			}
		}
		
		if(this.numCase==2)
		{
			if(x==0)
			{
				this.numCase=0;
			}
			if(x==1)
			{
				System.out.println("Impossible d'aller à l'ouest, votre position reste inchangée");
			}
			if(x==2)
			{
				this.numCase=3;
			}
			if(x==3)
			{
				System.out.println("Impossible de descendre, votre position reste inchangée");
			}
		}
		
		if(this.numCase==3)
		{
			if(x==0)
			{
				this.numCase=1;
			}
			if(x==1)
			{
				this.numCase=2;
			}
			if(x==2)
			{
				System.out.println("Impossible d'aller à l'est, votre position reste inchangée");
			}
			if(x==3)
			{
				System.out.println("Impossible de descendre, votre position reste inchangée");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	public Integer getNumVille() {
		return numVille;
	}
	public void setNumVille(Integer numVille) {
		this.numVille = numVille;
	}
	public Integer getNumCase() {
		return numCase;
	}
	public void setNumCase(Integer numCase) {
		this.numCase = numCase;
	}

	
	
	
	
}
