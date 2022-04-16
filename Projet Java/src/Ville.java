package Carte;

     public class Ville

     {
      
      private Integer numVille;
      private String nom;
     



     public Ville (Integer numVille)
     {
     this.numVille=numVille;
     this.nom=donneNomVille(numVille);
     }
     
     public void afficheNomVille()
     {
    	System.out.println(this.nom);
     }
     public void afficheNumVille()
     {
    	System.out.println(this.numVille);
     }


     public String donneNomVille(Integer x)
     {
     switch(x) {
     
     case 1: return "Madrid";
     case 2: return "Miami";
     case 3: return "Shangai";
     case 4: return "Marseille";
     case 5: return "Chateauroux";
     case 6: return "Paris";
     case 7: return "Tokyo";
     case 8: return "Sydney";
     case 9: return "Sao Paulo";
     }
     return "Ville introuvable";
     
     }
     
     
     }