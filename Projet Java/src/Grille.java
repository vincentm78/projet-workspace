package Carte;

//import java.util.*;

public class Grille
{
	private static String hop = "Hopital";
	private static String park = "Parking";
    private static String bu = "Bibliotheque";
    private static String plage = "Plage";       
    private static String corrida = "Corrida";
	private static String psg = "Tour Eiffel";
    private static String home = "Maison";
	private static String crs = "Commisariat";
    private static String musee = "Louvre";
    private static String fuji = "Fuji"; 
    
   
	
	private Case [][] grille;
	
	public Grille (int n, int p)
	{
		
		this.grille = new Case [n][p];
		
			
	}
	
	public void donneGrille(Integer numVille)
	{
		
		int i=0; 
		while (i<2)
		{
			int j=0;
			while(j<2)
			{
				int k=(2*i)+j;
				Case A = new Case();
				A.setLieu(donneLieu(numVille,k));
				if(verifPorte(numVille,k)==true)
				{
					if(verif2Porte(numVille,k)==true)
					{
						A.setTwoPorte(donne2Porte(numVille,k));
					}
					else
					{
						A.setPorte(donnePorte(numVille,k));
					}
				}
				
				this.grille[i][j]=A;
				j++;
				
			}
			i++;
		}
		}
		
	
	
	public void afficheCaseGrille()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				this.grille[i][j].toString();
			}
		}
	}
	

	


	public Case[][] getCase() {
		return grille;
	}

	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}

	public String donneLieu(Integer numVille,Integer numCase)
    {
        String E = "nulle part";
        // Case 1 = Nord ouest  Case 2 = Nord Est Case 3 = Sud ouest Case 4 = Sud est
        
        if(numVille==0)
        {
       	 if(numCase==0)
       	 {
       		 E=corrida;
       	 }
       	 if(numCase==1)
       	 {
       		 E=bu;
       	 }
       	 if(numCase==2)
       	 {
       		 E=hop;
       	 }
       	 
       	 
        }
        
        if(numVille==1)
        {
       	 if(numCase==1)
       	 {
       		 E=plage;
       	 }
       	 if(numCase==2)
       	 {
       		 E=bu;
       	 }
       	 if(numCase==3)
       	 {
       		 E=park;
       	 }
       	 
        }
        
       
        
        if(numVille==3)
        {
       	 if(numCase==0)
       	 {
       		 E=plage;
       	 }
       	 if(numCase==1)
       	 {
       		 E=park;
       	 }
       	 if(numCase==2)
       	 {
       		 E=hop;
       	 }
       	 if(numCase==3)
       	 {
       		 E=crs;
       	 }
       	 
        }
        
        if(numVille==4)
        {
       	 
       	 if(numCase==2)
       	 {
       		 E=home;
       	 }
       	 
        }
        
        if(numVille==5)
        {
       	 
       	 if(numCase==1)
       	 {
       		E=psg; 
       	 }
       	 if(numCase==2)
       	 {
       		E=musee; 
       	 }
       	 if(numCase==3)
       	 {
       		 E=crs;
       	 }
       	 
        }
        
        if(numVille==6)
        {
       	 if(numCase==0)
       	 {
       		 E=fuji;
       	 }
       	 if(numCase==2)
       	 {
       		 E=park;
       	 }
       	 if(numCase==3)
       	 {
       		 E=bu;
       	 }
       	 
        }
        
        if(numVille==7)
        {
       	 
       	 if(numCase==2)
       	 {
       		E=hop; 
       	 }
       	 if(numCase==3)
       	 {
       		 E=bu;
       	 }
       	 
        }
        
        if(numVille==8)
        {
       	 
       	 if(numCase==1)
       	 {
       		 E=hop;
       	 }
       	 
       	 if(numCase==3)
       	 {
       		 E=plage;
       	 }
       	 
        }
        
       
        return E;
   }
	
	public boolean verifPorte(Integer numVille,Integer numCase)
	{
		
		if(numVille==0&&numCase==3)
		{
			return true;
		}
		
		if(numVille==1&&numCase==1)
		{
			return true;
		}
		if(numVille==1&&numCase==3)
		{
			return true;
		}
		if(numVille==2&&numCase==0)
		{
			return true;
		}
		if(numVille==3&&numCase==1)
		{
			return true;
		}
		if(numVille==3&&numCase==3)
		{
			return true;
		}
		if(numVille==4&&numCase==0)
		{
			return true;
		}
		if(numVille==4&&numCase==1)
		{
			return true;
		}
		if(numVille==4&&numCase==2)
		{
			return true;
		}
		

		if(numVille==5&&numCase==0)
		{
			return true;
		}
		if(numVille==6&&numCase==1)
		{
			return true;
		}
		if(numVille==7&&numCase==0)
		{
			return true;
		}
		if(numVille==7&&numCase==1)
		{
			return true;
		}
		if(numVille==8&&numCase==0)
		{
			return true;
		}
		
		
		return false;
	}
	
 	public boolean verif2Porte(Integer numVille,Integer numCase)
	{

		if(numVille==3&&numCase==1)
		{
			return true;
		}
		
		if(numVille==4&&numCase==1)
		{
			return true;
		}
		
		
		return false;
	}
	
 	public Porte donnePorte(Integer numVille,Integer numCase)
	{
		Porte nv = new Porte(numVille,numCase,donneVilleSortie(numVille,numCase),donneCaseSortie(numVille,numCase));
		

		return nv;
		
	}
	
	public twoPorte donne2Porte(Integer numVille,Integer numCase)
	{
		twoPorte ddoor = new twoPorte();
		
		if(numVille==3&&numCase==1)
		{
			Porte A = new Porte(3,1,0,3);
			Porte B = new Porte(3,1,4,0);
			ddoor.setPorte1(A);
			ddoor.setPorte2(B);
			
			
			return ddoor;
		}
		
		if(numVille==4&&numCase==1)
		{
			Porte A = new Porte(4,1,1,3);
			Porte B = new Porte(4,1,5,0);
			ddoor.setPorte1(A);
			ddoor.setPorte2(B);
			
			return ddoor;
		}
		System.out.println("La création d'une double porte n'a pas eu lieu");
		return ddoor;
	}
 	//Que pour les 1 portes
 	public Integer donneVilleSortie(Integer numVille,Integer numCase)
 	{
 		if(numVille==0&&numCase==3)
		{
			return 3;
		}
		
		if(numVille==1&&numCase==1)
		{
			return 2;
		}
		if(numVille==1&&numCase==3)
		{
			return 4;
		}
		if(numVille==2&&numCase==0)
		{
			return 1;
		}
		
		if(numVille==3&&numCase==3)
		{
			return 6;
		}
		if(numVille==4&&numCase==0)
		{
			return 3;
		}
		if(numVille==4&&numCase==2)
		{
			return 8;
		}
		
		if(numVille==5&&numCase==0)
		{
			return 4;
		}
		if(numVille==6&&numCase==1)
		{
			return 3;
		}
		if(numVille==7&&numCase==0)
		{
			return 4;
		}
		if(numVille==7&&numCase==1)
		{
			return 8;
		}
		if(numVille==8&&numCase==0)
		{
			return 7;
		}
		
		return null;
 	}
 	
 	//Que pour les 1 portes
 	public Integer donneCaseSortie(Integer numVille,Integer numCase)
 	{
 		if(numVille==0&&numCase==3)
		{
			return 1;
		}
		
		if(numVille==1&&numCase==1)
		{
			return 0;
		}
		if(numVille==1&&numCase==3)
		{
			return 1;
		}
		if(numVille==2&&numCase==0)
		{
			return 2;
		}
		
		if(numVille==3&&numCase==3)
		{
			return 1;
		}
		if(numVille==4&&numCase==0)
		{
			return 1;
		}
		if(numVille==4&&numCase==2)
		{
			return 0;
		}
		
		if(numVille==5&&numCase==0)
		{
			return 1;
		}
		if(numVille==6&&numCase==1)
		{
			return 3;
		}
		if(numVille==7&&numCase==0)
		{
			return 2;
		}
		if(numVille==7&&numCase==1)
		{
			return 0;
		}
		if(numVille==8&&numCase==0)
		{
			return 1;
		}
		
		return null;
 	}
 	
 	
 	

	
	
	
    }
	
