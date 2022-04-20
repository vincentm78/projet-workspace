import java.util.LinkedList;
import java.io.*;


public class Joueur extends Personnage {
	
	private Integer nbPas = 0;
	private LinkedList<Objet> inventaire = new LinkedList<Objet>();
	private LinkedList<PNJ> family = new LinkedList<PNJ>();
	private String nom;
	private String pseudo;
	

	public Joueur(Position localisation, String pseudo) {
		super(localisation);
		this.nom = "Jordan";
		// TODO Auto-generated constructor stub
	}
	
	
	
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
		

		
              public void sedeplacerN()

              {

                            int v = this.getNumVille();

                            int c = this.getCase();                  

                            if(v==1||v==2||v==0)

                            {

                                          if(c==1||c==0)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez au NORD à cette endroit, vous etes au bord de la map");

                                          }

                                          else {

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c-2];
								 this.nbPas ++;

                                                         }

                                                         if(c==3) {

                                                                      this.position[v][c]=this.position[v][c-2];
								 this.nbPas ++;

                                                         }     

                                          }

                            }

                            else {

                                          if(c==0||c==1)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez au NORD à cette endroit, il faut prendre une porte");

                                          }

                                          else {

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c-2];
								 this.nbPas ++;

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-2];
								 this.nbPas ++;

                                                         }

                                                         }

                                          }

              }


              public void sedeplacerS()

              {

                            int v = this.getNumVille();

                            int c = this.getCase();                  

                            if(v==7||v==8||v==6)

                            {

                                          if(c==2||c==3)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez au SUD à cette endroit, vous etes au bord de la map");

                                          }

                                          else {

                                                         if(c==0) {

                                                                       this.position[v][c]=this.position[v][c+2];
								 this.nbPas ++;

                                                         }

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c+2];
								 this.nbPas ++;

                                                         }                      

                                          }

                            }

                            else {

                                          if(c==2||c==3)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez au SUD à cette endroit, il faut prendre une porte");

                                          }

                                          else {

                                                         if(c==0) {

                                                                       this.position[v][c]=this.position[v][c+2];
								 this.nbPas ++;

                                                         }

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c+2];
								 this.nbPas ++;

                                                         }
                            }                  

              }

}

 

              public void sedeplacerE()

              {

                            int v = this.getNumVille();

                            int c = this.getCase();                  

                            if(v==2||v==5||v==8)

                            {

                                          if(c==1||c==3)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez à l'EST à cette endroit, vous etes au bord de la map");

                                          }

                                          else {

                                                         if(c==0) {

                                                                       this.position[v][c]=this.position[v][c+1];
								 this.nbPas ++;

                                                         }

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c+1];
								 this.nbPas ++;

                                                         }

                                          }

                            }

                            else {

                                          if(c==1||c==3)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez à l'EST à cette endroit, il faut prendre une porte");

                                          }

                                          else {

                                                         if(c==0) {

                                                                       this.position[v][c]=this.position[v][c+1];
								 this.nbPas ++;

                                                         }

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c+1];
								 this.nbPas ++;

                                                         }
  

                            }
                   

              }

}

             

              public void sedeplacerO()

              {

                            int v = this.getNumVille();

                            int c = this.getCase();                  

                            if(v==0||v==3||v==6)

                            {

                                          if(c==0||c==2)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez à l'OUEST à cette endroit, vous etes au bord de la map");

                                          }

                                          else {

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c-1];
								 this.nbPas ++;

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-1];
								 this.nbPas ++;

                                                         }

                                                        

                                          }

                            }

                            else {

                                          if(c==0||c==2)

                                          {

                                                         System.out.println("Vous ne pouvez pas allez à l'OUEST à cette endroit, il faut prendre une porte");

                                          }

                                          else {

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c-1];
								 this.nbPas ++;

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-1];
								 this.nbPas ++;

                                                         }

                                         

                            }

                                         

              }

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
	
		public String getPseudo() {
		return Pseudo;
	}

	public void setPseudo(String pseudo) {
		Pseudo = pseudo;
	}


	public Inventaire getInventaire() {
		return inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LinkedList<PNJ> getFamily() {
		return family;
	}



	public void setFamily(LinkedList<PNJ> family) {
		this.family = family;
	}
	
	//****************Reflechir à mettre l'inventaire dans la classe Partie****************

}

