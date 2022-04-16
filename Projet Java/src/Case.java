package Carte;


public class Case 
{
     private String lieu;
     private Porte porte;
     // private PNJ perso;
     // private
     private static String hop = "Hôpital";
     private static String park = "Parking";
     private static String bu = "Bibliotheque";
     private static String plage = "Plage";
     
     private static String corrida = "Corrida";
     private static String key = "Cles";
     private static String psg = "Tour Eiffel";
     private static String home = "Maison";
     private static String crs = "Commisariat";
     private static String musee = "Musee du Louvre";
     private static String fuji = "Fuji";
     
     public Case(Integer numVille,Integer numCase)
     {
         this.lieu=donneLieu(numVille,numCase);
         this.porte=null;
     }
     
     public void afficherLieu()
     {
    	 System.out.println(this.lieu);
    	 
     }
     
     

//Num Case 1 = Nord-Ouest
//Num Case 2 = Sud-Ouest
//Num Case 3 = Nord-Est
//Num Case 4 = Sud-Est
     

     public String donneLieu(Integer numVille,Integer numCase)
     {
         String E = "rien";
         switch(numVille) {
   
         case 1:
             switch(numCase)
             {
             case 1:E= hop;
             case 2:E= corrida;
             case 3:E= bu;
             
             }
         
         case 2:
        	 switch(numCase)
             {
             case 1:E= plage;
             case 2:E= bu;
             case 3:E= park;
             
             }
        	 
         case 3:
        	 switch(numCase)
             {
             
             case 3:E= key;
             
             }
        	 
         case 4:
        	 switch(numCase)
             {
             case 1:E= hop;
             case 2:E= plage;
             case 3:E= park;
             case 4:E= crs;
             }
        	 
         case 5:
        	 switch(numCase)
             {
             case 4:E= home;
             }
        	 
         case 6:
        	 switch(numCase)
             {
             case 1:E= psg;
             case 2:E= park;
             case 3:E= musee;
             case 4:E= crs;
             }
         case 7:
        	 switch(numCase)
             {
             case 1:E= fuji;
             case 2:E= park;
             case 3:E= bu;
            
             }
        	 
         case 8:
        	 switch(numCase)
             {
             
             case 2:E= hop;
             case 3:E= bu;
             
             }
         case 9:
        	 switch(numCase)
             {
             case 3:E= hop;
             case 4:E= plage;
             }
        	 System.out.println("Retour du nom de la case réussi");
         }
         return E;
    }
     
     
     
}
