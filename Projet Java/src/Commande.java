import java.util.Scanner;

public class Commande {
	
	public static final Integer Nord = 0;
	public static final Integer Sud = 3;
	public static final Integer Est = 2;
	public static final Integer Ouest = 1;
	public static final Integer Porte = 5;
	public static final Integer Porte1 = 6;
	public static final Integer Porte2 = 7;
	
	
	public String saisieClavier()
	{
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Saisissez votre choix : ");
		
		String reponse = entree.nextLine();

		
		System.out.println("Choix du joueur : " + reponse);
		
		return reponse;
	}
	//Prise de commande dans le cas ou le joueur ne peut que se déplacer
	public Integer Direction()
	{
		Integer code = null;
		String commande = saisieClavier();
	    while(commande!="N"||commande!="S"||commande!="O"||commande!="E")
		{
			commande = saisieClavier();
		}
		
	    if(commande=="N")
	    {
	    	code=Nord;
	    	return code;
	    }
	    if(commande=="S")
	    {
	    	code=Sud;
	    	return code;
	    }
	    if(commande=="O")
	    {
	    	code=Ouest;
	    }
	    if(commande=="E")
	    {
	    	code=Est;
	    }
		System.out.println("Le programme direction a un probleme");
		return code;
	}
	
	
	
}
