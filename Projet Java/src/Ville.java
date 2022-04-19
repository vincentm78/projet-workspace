public class Ville

     {

    	 private Integer numVille;
    	    private String nom;
    	    private Grille grille;


	public Ville(Integer numVille) {
  		this.numVille = numVille;
  		this.nom = donneNomVille(numVille);
  		Grille nv = new Grille(2,2);
		nv.donneGrille(numVille);
		this.grille=nv;
  	}

      
     public String donneNomVille(Integer x)
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
     
     
     public Integer getNumVille() {
 		return numVille;
 	}

 	public void setNumVille(Integer numVille) {
 		this.numVille = numVille;
 	}

 	public String getNom() {
 		return nom;
 	}

 	public void setNom(String nom) {
 		this.nom = nom;
 	}
 	public Grille getGrille() {
		return grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}

	
	

  }
