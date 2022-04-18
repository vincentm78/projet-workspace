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
		
		import java.io.*;

		
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

                                                         }

                                                         if(c==3) {

                                                                      this.position[v][c]=this.position[v][c-2];

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

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-2];

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

                                                         }

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c+2];

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

                                                         }

                                                         if(c==1) {

                                                                       this.position[v][c]=this.position[v][c+2];

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

                                                         }

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c+1];

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

                                                         }

                                                         if(c==2) {

                                                                       this.position[v][c]=this.position[v][c+1];

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

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-1];

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

                                                         }

                                                         if(c==3) {

                                                                       this.position[v][c]=this.position[v][c-1];

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
	
	//****************Reflechir à mettre l'inventaire dans la classe Partie****************

}

