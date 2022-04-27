package Personnage;

import main.Position;
import map.Porte;
import map.twoPorte;

public class JoueurPrincipal 
{

	private String nom;
	private Position pos;
	private Integer nbDecision;
	
	public JoueurPrincipal(Position pos) {
		this.nom = "Jordan";
		this.pos = pos;
		this.nbDecision = 0;
	}
	
	public boolean modifieCase(String x)
	{
		boolean res = false;
		//x est le numero qui est renvoyé à l'aide d'une commande de direction
		if(this.pos.getNumCase().equals(0))
		{
			if(x.equals("N")==true)
			{
				System.out.println("Impossible de monter, votre position reste inchangée");
				return false;
			}
			if(x.equals("O")==true)
			{
				System.out.println("Impossible d'aller à l'ouest, votre position reste inchangée");
				return false;
			}
			if(x.equals("E")==true)
			{
				this.pos.setNumCase(1);
				return true;
			}
			if(x.equals("S")==true)
			{
				this.pos.setNumCase(2);
				return true;
			}
			
		}
		
		if(this.pos.getNumCase().equals(1))
		{
			if(x.equals("N")==true)
			{
				System.out.println("Impossible de monter, votre position reste inchangée");
				return false;
			}
			if(x.equals("O")==true)
			{
				this.pos.setNumCase(0);
				return true;
			}
			if(x.equals("E")==true)
			{
				System.out.println("Impossible d'aller à l'est, votre position reste inchangée");
				return false;
			}
			if(x.equals("S")==true)
			{
				
				this.pos.setNumCase(3);
				return true;
			}
		}
		
		if(this.pos.getNumCase().equals(2))
		{
			if(x.equals("N")==true)
			{
				
				this.pos.setNumCase(0);
				return true;
			}
			if(x.equals("O")==true)
			{
				System.out.println("Impossible d'aller à l'ouest, votre position reste inchangée");
				return false;
			}
			if(x.equals("E")==true)
			{
				this.pos.setNumCase(3);
				return true;
			}
			if(x.equals("S")==true)
			{
				System.out.println("Impossible de descendre, votre position reste inchangée");
				return false;
			}
		}
		
		if(this.pos.getNumCase().equals(3))
		{
			if(x.equals("N")==true)
			{
				this.pos.setNumCase(1);
				return true;
			}
			if(x.equals("O")==true)
			{
				
				this.pos.setNumCase(2);
				return true;
			}
			if(x.equals("E")==true)
			{
				System.out.println("Impossible d'aller à l'est, votre position reste inchangée");
				return false;
			}
			if(x.equals("S")==true)
			{
				System.out.println("Impossible de descendre, votre position reste inchangée");
				return false;
			}
		}
		
		return res;
	}
	
	
	public void traitDirection(String x)
	{
		if(x.equals("N")==true||x.equals("S")==true||x.equals("O")==true||x.equals("E")==true)
		{
			this.modifieCase(x);
		}

	}
	
	
	public void traitTwoPorte(String x, twoPorte ddoor)
	{
		if(x.equals("Porte1")||x.equals("Porte2"))
		{
			System.out.println("Je suis rentré dans la fonction 2 Porte");
			if(x.equals("Porte1"))
			{
				this.prendrePorte(ddoor.getPorte1());
			}
			if(x.equals("Porte2"))
			{
				this.prendrePorte(ddoor.getPorte2());
			}
		}
		
	}
	
	public void prendrePorte(Porte door)
	{
		if(door==null)
		{
			System.out.println("Erreur il y a pas de porte ici");
		}
		else
		{
			this.getPos().setNumVille(door.getVilleSortie());
			this.getPos().setNumCase(door.getLieuSortie());
		}
		
	}
	
	public boolean prendreTwoPorte(twoPorte twoDoor,String choixPorte)
	{
		if(twoDoor==null)
		{
			System.out.println("Soucis avec la double porte voir prendreTwoPorte de la classe Position");
			return false;
		}
		else
		{
			if(choixPorte=="Porte1")
			{
				this.pos.setNumVille(twoDoor.getPorte1().getVilleSortie());
				this.pos.setNumCase(twoDoor.getPorte1().getLieuSortie());
				return true;
			}
			if(choixPorte=="Porte2")
			{
				this.pos.setNumVille(twoDoor.getPorte2().getVilleSortie());
				this.pos.setNumCase(twoDoor.getPorte2().getLieuSortie());
				return true;
			}
		}
		System.out.println("Probleme dans la methode prendreTwoPorte de la classe Position");
		return false;
	}
	
	
	
	

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public Integer getNbDec() {
		return nbDecision;
	}

	public void setNbDec(Integer nbPas) {
		this.nbDecision = nbPas;
	}
	@Override
	public String toString() {
		return "JoueurPrincipal [nom=" + nom + ", nbPas=" + nbDecision + "]";
	}
	
	
}
