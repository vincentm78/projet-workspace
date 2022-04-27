package main;

import java.util.LinkedList;
import java.util.Scanner;

import Personnage.JoueurPrincipal;
import Personnage.Objet;
import Personnage.PNJ;
import map.Lieu;
import map.Porte;
import map.Ville;
import map.twoPorte;

public class Main 
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

	public static String donneLieu(Integer numVille,Integer numCase)
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
    
	public static boolean verifPorte(Integer numVille,Integer numCase)
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

		if(numVille==3&&numCase==3)
		{
			return true;
		}
		if(numVille==4&&numCase==0)
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
	
 	public static boolean verif2Porte(Integer numVille,Integer numCase)
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
	
 	
 	public static Integer donneVilleSortie(Integer numVille,Integer numCase)
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
			return 7;
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
	
 	public static Integer donneCaseSortie(Integer numVille,Integer numCase)
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
			return 1;
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
 	
 	public static Porte donnePorte(Integer numVille,Integer numCase)
	{
		Porte nv = new Porte(numVille,numCase,donneVilleSortie(numVille,numCase),donneCaseSortie(numVille,numCase));
		

		return nv;
		
	}
 	
 	public static twoPorte donne2Porte(Integer numVille,Integer numCase)
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
		return ddoor;
	}
	
 	public static PNJ donnePNJFamille(Integer numVille,Integer numCase)
	{
		
			if(numVille==4&&numCase==2)
			{
				
				String role = "Tante";
				String nom = "Bout de Papier de Tante Suzie";
				String detail = "Sur ce bout de papier est incrit le numéro de Plaque d'immatriculation de papa, "
						+ "si je me souviens bien Tante Suzie m'a indiqué qu'il s'était garé dans le parking près du concert de JUL";
				Objet o = new Objet(nom,detail);
				String Script = "Salut Jordan, c'est Tante Suzie va retrouvez ta mere,ton pere, ta soeur et ton frère ça sera ta nouvelle mission HAHA je n'ai eu des nouvelles"
						+ "que de ton père d'ailleurs je l'ai eu au téléphone à l'instant il s'était garé au parking juste à côté du concert de Jul"
						+ "/n Prend ce bout de papier il est noté sa plaque d'immatriculation A+";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,o,Script,pos,true);
				
				
			
				return pnj;

			}
			if(numVille==3&&numCase==1)
			{
				
				String role = "Pere";
				
				String Script = "Salut Fiston, faut qu'on retrouve les autres, il y a un commissariat au sud on peut les voir si tu veux";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,null,Script,pos,false);
				
			    return pnj;

			}
			// modification de mere
			if(numVille==1&&numCase==3)
			{
				
				String role = "Mere";
				
				String Script = "Salut mon coeur de retour à la maison je vous fais à graille";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,null,Script,pos,false);
				
			
				return pnj;

			}
			
			if(numVille==6&&numCase==0)
			{
				
				String role = "Frere";
				
				String Script = "Salut Frangin, let's go à la maison, marre des montagnes";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,null,Script,pos,false);
			
				return pnj;

			}
			if(numVille==0&&numCase==0)
			{
				
				String role = "Soeur";
				
				String Script = "Salut mon frere, faut qu'on y aille marre de cette maltraitance animal";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,null,Script,pos,false);
				
			
				return pnj;

			}
			
			if(numVille==3&&numCase==3)
			{
				
				String role = "Lenny le policier";
				
				String Script = "Bonjour je suis Lenny le policier. Va voir mon collègue" + 
						" le cow boy si ce n'est pas déjà fait, je pionce moi";
				Position pos = new Position(numVille,numCase);
				PNJ pnj = new PNJ(role,null,Script,pos,true);
				
			
				
				return pnj;

			}
			
			if(numVille==5&&numCase==3)
			{
				
				String role = "Carl le policier";
				
				String Script = "Bonjour je suis Carl le policier";
				Position pos = new Position(numVille,numCase);
				String nom = "Ticket pour le Louvre";
				String detail = "Le ticket appartient à ton frère, tu devrais y faire un tour" 
						+ " pour voir si il n'est pas la bas";
				Objet o = new Objet(nom,detail);
				PNJ pnj = new PNJ(role,o,Script,pos,true);
				
			
				
				return pnj;

			}
			
			if(numVille==1&&numCase==1)
			{
				
				String role = "Brandon le nagueur";
				
				String Script = "Bonjour je suis Brandon, Maitre nagueur à la croix-rouge";
				Position pos = new Position(numVille,numCase);
				String nom = "Serviette de Maman";
				String detail = "Ta Maman a perdu sa serviette, elle est donc passé par ici";
				Objet o = new Objet(nom,detail);
				PNJ pnj = new PNJ(role,o,Script,pos,true);
				
				
				return pnj;

			}
			
			if(numVille==0&&numCase==1)
			{
				
				String role = "Corine la bibliothecaire";
				
				String Script = "Bonjour je suis Corine bibliothecaire depuis plus de 40 ans";
				Position pos = new Position(numVille,numCase);
				String nom = "Répertoire d'accueil";
				String detail = "Ta soeur est passé par là ... Cherche la dans la ville";
				Objet o = new Objet(nom,detail);
				PNJ pnj = new PNJ(role,o,Script,pos,true);
				
				
				
				return pnj;

			}
			
			
			return null;
	}

 	public static String saisieClavier()
	{
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Saisissez votre choix : ");
		
		String reponse = entree.nextLine();
		
		return reponse;
	}

 	public static Integer saisieNbClavier()
	{
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Saisissez votre choix : ");
		
		Integer reponse = entree.nextInt();

		return reponse;
	}
 	
	public static Lieu donneCase(LinkedList<Ville> monde,JoueurPrincipal Jordan)
	{
		Ville ville = monde.get(Jordan.getPos().getNumVille());
		Lieu lieu = new Lieu();
		switch(Jordan.getPos().getNumCase())
		{
		case 0:lieu=ville.getBox1();
		case 1:lieu=ville.getBox2();
		case 2:lieu=ville.getBox3();
		case 3:lieu=ville.getBox4();
		default:System.out.println();
		}
		
		return lieu;
	}

	public static void saut()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println();
		}
		for(int i=0;i<2;i++)
		{
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		}
		
	}
	
	public static void afficheManette(Commande comm)
	{
		for (int i=0;i<comm.getComm().size();i++)
		{
			System.out.println(comm.getComm().get(i));
		}
	}
	
	public static void consultItem(LinkedList<Objet> Sac)
	{
		if(Sac.size()==0)
		{
			System.out.println("Votre inventaire est vide");
		}
		else
		{
			for(int i=0;i<Sac.size();i++)
			{
				int j = i + 1;
				System.out.print("Objet "+j+" = "+Sac.get(i).getNom()+" || ");
			}
			System.out.println("Voulez vous afficher le détail d'un objet (Taper O) pour oui et n'importe quel autre touche pour non");
			String touche = saisieClavier();
			if(touche.equals("O"))
			{
				System.out.println("Veuillez saisir le numéro de l'objet (et pas autre chose sinon il y aura un bug) : ");
				int j=saisieNbClavier();
				j--;
				System.out.println(Sac.get(j).getDetail());
			}
		}
	}
	
 	public static boolean verifPNJ(Integer numVille,Integer numCase)
	{
		if(numVille==0&&numCase==0)
		{
			
			return true;
		}
		if(numVille==0&&numCase==1)
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
		if(numVille==3&&numCase==1)
		{
			
			return true;
		}
		if(numVille==3&&numCase==3)
		{
			
			return true;
		}
		if(numVille==4&&numCase==2)
		{
			
			return true;
		}
		if(numVille==5&&numCase==3)
		{
			
			return true;
		}
		if(numVille==6&&numCase==0)
		{
			
			return true;
		}
		
		return false;
	}
	
 	public static void consultFamille(LinkedList<PNJ> famille)
 	{
 		if(famille.size()==0)
 		{
 			System.out.println("Vous avez retrouvé personne");
 		}
 		else
 		{
 			for (int i=0;i<famille.size();i++)
 			{
 				System.out.print(famille.get(i).getNom() + " |  ");
 			}
 		}
 	}
 	
 	public static void testPorte(LinkedList<Ville> Monde)
 	{
 		for(int i= 0;i<Monde.size();i++)
 		{
 			if(Monde.get(i).getBox1().getPorte()!=null)
 			{
 			System.out.println("EntreeA  =  "+Monde.get(i).getBox1().getPorte().getVilleEntree() +
 					"  EntreeB   =  "+Monde.get(i).getBox1().getPorte().getLieuEntree()+
 					"  SortieA   = "+Monde.get(i).getBox1().getPorte().getVilleSortie()+
 					"  SortieB   ="+Monde.get(i).getBox1().getPorte().getLieuSortie());
 			}
 			if(Monde.get(i).getBox2().getPorte()!=null)
 			{
 			System.out.println("EntreeA  =  "+Monde.get(i).getBox2().getPorte().getVilleEntree() +
 					"  EntreeB  =  "+Monde.get(i).getBox2().getPorte().getLieuEntree()+
 					"  SortieA  =  "+Monde.get(i).getBox2().getPorte().getVilleSortie()+
 					"  SortieB   =  "+Monde.get(i).getBox2().getPorte().getLieuSortie());
 			}
 			if(Monde.get(i).getBox3().getPorte()!=null)
 			{
 			System.out.println("EntreeA  =  "+Monde.get(i).getBox3().getPorte().getVilleEntree() +
 					"  EntreeB  =  "+Monde.get(i).getBox3().getPorte().getLieuEntree()+
 					"  SortieA   =  "+Monde.get(i).getBox3().getPorte().getVilleSortie()+
 					"  SortieB   = "+Monde.get(i).getBox3().getPorte().getLieuSortie());
 			}
 			if(Monde.get(i).getBox4().getPorte()!=null)
 			{
 			System.out.println("EntreeA  =  "+Monde.get(i).getBox4().getPorte().getVilleEntree() +
 					"  EntreeB  =  "+Monde.get(i).getBox4().getPorte().getLieuEntree()+
 					"  SortieA   =  "+Monde.get(i).getBox4().getPorte().getVilleSortie()+
 					"  SortieB   =  "+Monde.get(i).getBox4().getPorte().getLieuSortie());
 			}
 		}
 	}
 	
 	
 	
 	
 	
 	//--------------------------------------------------------------------MAIN------------------------------------------------
	
	public static void main(String[] args){
		  
		//Initialisation
		LinkedList<Objet> Inventaire = new LinkedList<Objet>();
		LinkedList<Ville> Monde = new LinkedList<Ville>();
		LinkedList<PNJ> ListeRetrouve = new LinkedList<PNJ>();
		Position pos = new Position(4,2);
		JoueurPrincipal Jordan = new JoueurPrincipal(pos);
		int Flag = 0; 
		Objet obj = null;
		PNJ pnj = null;
		String touche = "Coucou Caussannnel ";
		for (int i=0;i<9;i++)
		{

			Lieu lieu1 = new Lieu(donneLieu(i,0));
			Lieu lieu2 = new Lieu(donneLieu(i,1));
			Lieu lieu3 = new Lieu(donneLieu(i,2));
			Lieu lieu4 = new Lieu(donneLieu(i,3));
			if(verifPorte(i,0)==true)
			{
				Porte porte1= donnePorte(i,0);
				lieu1.setPorte(porte1);
				
			}
			if(verifPorte(i,1)==true)
			{
				Porte porte2= donnePorte(i,1);
				lieu2.setPorte(porte2);
				
			}
			if(verifPorte(i,2)==true)
			{
				Porte porte3= donnePorte(i,2);
				lieu3.setPorte(porte3);
			}
			if(verifPorte(i,3)==true)
			{
				Porte porte4= donnePorte(i,3);
				lieu4.setPorte(porte4);
			}
			if(verif2Porte(i,1)==true)
			{
				twoPorte dPorte = donne2Porte(i,1);
				lieu2.setTwoPorte(dPorte);
			}
			if(verifPNJ(i,0)==true)
			{
				PNJ pnj1 = donnePNJFamille(i,0);
				lieu1.setPnj(pnj1);
			}
			if(verifPNJ(i,1)==true)
			{
				PNJ pnj2 = donnePNJFamille(i,1);
				lieu2.setPnj(pnj2);
			}
			if(verifPNJ(i,2)==true)
			{
				PNJ pnj3 = donnePNJFamille(i,2);
				lieu3.setPnj(pnj3);
			}
			if(verifPNJ(i,3)==true)
			{
				PNJ pnj4 = donnePNJFamille(i,3);
				lieu4.setPnj(pnj4);
			}

		

			
			//CONDITION

			String CityName = donneNomVille(i);
			Ville city = new Ville(CityName,lieu1,lieu2,lieu3,lieu4);
			Monde.add(city);
		}
		
		
		Commande manette = new Commande();
		
		
	//--------------------------------------------------------------------------------------------------------------------------------------
		
	//--------------------------------------------------------------JEU--------------------------------------------------------------------	
		
		while(Flag!=2&&Jordan.getNbDec()<250)
		{
			
			manette.videCommandePossible();
			manette.entreCommandePossible(Monde, Jordan.getPos());
			//afficheManette(manette);
			System.out.println(manette.afficheCommandePossible(Monde, Jordan.getPos()));
			System.out.println("Jordan a pris "+Jordan.getNbDec()+ " décisions");
			System.out.println("Ville = "+ donneNomVille(Jordan.getPos().getNumVille()));
			System.out.println("Lieu = "+ donneLieu(Jordan.getPos().getNumVille(),Jordan.getPos().getNumCase()));
			System.out.println("Ville = "+ Jordan.getPos().getNumVille());
			System.out.println("Lieu = " +Jordan.getPos().getNumCase());
			
			
			do
			 {
				touche=saisieClavier();
				if(manette.autoriseCommande(touche)!=true)
				 {
					 System.out.println("Touche non autorisé Jordan");
				 }
			 }while(manette.autoriseCommande(touche)!=true);
			
			
			
			Jordan.traitDirection(touche);
			
			
			//Traitement d'une porte
			if(touche.equals("Porte"))
			{
				
			switch(Jordan.getPos().getNumCase())
			{
				
			case 0 :Jordan.prendrePorte(Monde.get(Jordan.getPos().getNumVille()).getBox1().getPorte());break;
			case 1 :Jordan.prendrePorte(Monde.get(Jordan.getPos().getNumVille()).getBox2().getPorte());break;
			case 2 :Jordan.prendrePorte(Monde.get(Jordan.getPos().getNumVille()).getBox3().getPorte());break;
			case 3 :Jordan.prendrePorte(Monde.get(Jordan.getPos().getNumVille()).getBox4().getPorte());break;
			default:System.out.println("Probleme dans le if Porte du main");
			}
			
			}
			
			
			//Traitement des doubles portes
			if(Jordan.getPos().getNumCase().equals(1))
			{
			Jordan.traitTwoPorte(touche, Monde.get(Jordan.getPos().getNumVille()).getBox2().getTwoPorte());
			}
			
			//Consulter Inventaire
			
			if(touche.equals("Inventaire"))
			{
				consultItem(Inventaire);
			}
			
			if(touche.equals("Famille"))
			{
				consultFamille(ListeRetrouve);
			}
			
			
			if(touche.equals("Parler"))
			{
				if(Jordan.getPos().getNumCase().equals(0))
				{
				obj=manette.parlerEtPrendre(Monde.get(Jordan.getPos().getNumVille()).getBox1().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(1))
				{
				obj=manette.parlerEtPrendre(Monde.get(Jordan.getPos().getNumVille()).getBox2().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(2))
				{
				obj=manette.parlerEtPrendre(Monde.get(Jordan.getPos().getNumVille()).getBox3().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(3))
				{
				obj=manette.parlerEtPrendre(Monde.get(Jordan.getPos().getNumVille()).getBox4().getPnj());
				}
				if(obj!=null)
				{
					Inventaire.add(obj);
				}

				if(Jordan.getPos().getNumCase().equals(0))
				{
				pnj=manette.retrouve(Monde.get(Jordan.getPos().getNumVille()).getBox1().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(1))
				{
					pnj=manette.retrouve(Monde.get(Jordan.getPos().getNumVille()).getBox2().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(2))
				{
					pnj=manette.retrouve(Monde.get(Jordan.getPos().getNumVille()).getBox3().getPnj());
				}
				if(Jordan.getPos().getNumCase().equals(3))
				{
					pnj=manette.retrouve(Monde.get(Jordan.getPos().getNumVille()).getBox4().getPnj());
				}
				if(pnj!=null)
				{
					ListeRetrouve.add(pnj);
				}
				
			}
			
			
			
			if(ListeRetrouve.size()==4)
			{
				Flag=1;
			}
			
			if(Flag==1)
			{
				if(Jordan.getPos().getNumVille()==4&&Jordan.getPos().getNumCase()==2)
				{
					Flag=2;
				}
			}

			Jordan.setNbDec(Jordan.getNbDec() + 1);

			saut();
		    
			
		}
		if(Flag==2)
		{
			System.out.println("Vous avez gagné");
		}
		if(Jordan.getNbDec()>249)
		{
			System.out.println("Vous avez perdu");
		}
		

	
	
	
	
	
}
	
	
}
