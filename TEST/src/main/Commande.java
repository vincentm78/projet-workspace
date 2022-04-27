package main;

import java.util.LinkedList;

import Personnage.Objet;
import Personnage.PNJ;
import map.Lieu;
import map.Ville;

public class Commande 
{
	private static final String Nord = "N";
	private static final String Sud = "S";
	private static final String Est = "E";
	private static final String Ouest = "O";
	private static final String ConsultItem = "Inventaire";
	private static final String Porte = "Porte";
	private static final String Porte1 = "Porte1";
	private static final String Porte2 = "Porte2";
	private static final String Parler = "Parler";
	private static final String Famille = "Famille";
	private LinkedList<String> comm;
	
	

	public Commande()
	{
		this.comm=new LinkedList<String>();
	}
	
	public void videCommandePossible()
	{
		while(this.comm.size()!=0)
		{
			this.comm.remove();
		}
	}
	
	public void entreCommandePossible(LinkedList<Ville> listeVille,Position pos)
	{

		this.comm.add(Nord);
		this.comm.add(Sud);
		this.comm.add(Ouest);
		this.comm.add(Est);
		this.comm.add(ConsultItem);
		this.comm.add(Famille);
		Ville ville = listeVille.get(pos.getNumVille());
		
		Lieu box = new Lieu();
//----------------------------------------Verification de la localisation de Jordan -------------------------------------------------------
		if(pos.getNumCase()==0)
		{
			box=ville.getBox1();
		}
		if(pos.getNumCase()==1)
		{
			box=ville.getBox2();
		}
		if(pos.getNumCase()==2)
		{
			box=ville.getBox3();
		}
		if(pos.getNumCase()==3)
		{
			box=ville.getBox4();
		}
//----------------------------------------------------------------------------------------------------------------------------------
		if(box.getPorte()!=null)
		{
			this.comm.add(Porte);
		}
		
		if(box.getTwoPorte()!=null)
		{
			this.comm.add(Porte1);
			this.comm.add(Porte2);
		}
//---------------------------------------------------------------------------------------------------------------------------------------
		if (box.getPnj()!=null)
		{
			this.comm.add(Parler);
		}
		
	}
	
	public String afficheCommandePossible(LinkedList<Ville> listeVille,Position pos)
	{
		String Can = "Vous pouvez : ";
		for(int i=0;i<this.comm.size();i++)
		{
			if(this.comm.get(i)=="N")
			{
				Can= Can + "Monter(Taper N) ,";
			}
			if(this.comm.get(i)=="O")
			{
				Can= Can + " tourner à gauche (Taper O) ,";
			}
			if(this.comm.get(i)=="E")
			{
				Can= Can + " Tourner à droite (Taper E) ,";
			}
			if(this.comm.get(i)=="S")
			{
				Can= Can + " Descendre(Taper S) ,";
			}
			if(this.comm.get(i)=="Famille")
			{
				Can= Can + " Qui vous avez retrouvé (Taper Famille) ";
			}
			if(this.comm.get(i)=="Inventaire")
			{
				Can= Can + " Consulter l'inventaire (Taper Inventaire) .";
			}
			
			//----------------------------------------Verification de la localisation de Jordan -------------------------------------------------------
            Ville ville = listeVille.get(pos.getNumVille());
			
			Lieu box = new Lieu();
			
			if(pos.getNumCase()==0)
			{
				box=ville.getBox1();
			}
			if(pos.getNumCase()==1)
			{
				box=ville.getBox2();
			}
			if(pos.getNumCase()==2)
			{
				box=ville.getBox3();
			}
			if(pos.getNumCase()==3)
			{
				box=ville.getBox4();
			}
	//----------------------------------------------------------------------------------------------------------------------------------
			
			
			if(this.comm.get(i)=="Porte")
			{
				Can= Can + "\nVous pouvez prendre la porte (taper Porte) pour aller à " + donneNomVille(box.getPorte().getVilleSortie()) +"\n" ;
			}
			
			if(this.comm.get(i)=="Porte1")
			{
				Can= Can + "\n Vous pouvez prendre la porte (taper Porte1) pour aller à " + donneNomVille(box.getTwoPorte().getPorte1().getVilleSortie())  ;
			}
			
			if(this.comm.get(i)=="Porte2")
			{
				Can= Can + "\n Vous pouvez prendre la porte (taper Porte2) pour aller à " + donneNomVille(box.getTwoPorte().getPorte2().getVilleSortie())  ;
			}
//---------------------------------------------------------------------------------------------------------------------------------------------
			if(this.comm.get(i)=="Parler")
			{
				Can = Can + "Vous pouvez parler à " + box.getPnj().getNom();
			}
			
		}
		
		
		return Can;
	}
	

	public boolean autoriseCommande(String commande)
	{
		boolean access = false;
		for(int i =0;i<this.comm.size();i++)
		{
			if(this.comm.get(i).equals(commande))
			{
				return true;
			}
		}
		
		return access;
	}

	public static String donneNomVille(Integer x)
	{
	switch(x) {
    
    case 0: return "Madrid";
    case 1: return "Miami";
    case 2: return "Shangai";
    case 3: return "Marseille";
    case 4: return "Chateauroux";
    case 5: return "Paris";
    case 6: return "Tokyo";
    case 7: return "Sydney";
    case 8: return "Sao Paulo";
    }
    return "Ville introuvable";
    }
	


	public LinkedList<String> getComm() {
		return comm;
	}

	public void setComm(LinkedList<String> comm) {
		this.comm = comm;
	}
	
	public Objet parlerEtPrendre(PNJ pnj)
	{
		System.out.println(pnj.getScript());
		if(pnj.getObjDetenu()!=null)
		{
			System.out.println(pnj.getObjDetenu().getDetail());
			System.out.println(pnj.getNom()+" décide de vous donnez "+pnj.getObjDetenu().getNom()+". Vous placez l'objet dans votre inventaire " );
			Objet obj = pnj.getObjDetenu();
			pnj.setObjDetenu(null);
			return obj;
		}

		return null;
	}
	
	public PNJ retrouve(PNJ pnj)
	{
		if(pnj.getRetrouve()==false)
		{
			System.out.println("Vous avez retrouvé "+ pnj.getNom());
			pnj.setRetrouve(true);
			return pnj;
		}
		return null;
	}
	
	
	
	
}
