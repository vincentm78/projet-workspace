import java.util.Scanner;

public class Direction {
	
	public static final int Nord = 0;
	public static final int Sud = 1;
	public static final int Est = 2;
	public static final int Ouest = 3;
	
	public int entrerDirection()
	{
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Saisissez votre choix : ");
		
		int reponse = entree.nextInt();
		while(reponse < 1 || reponse > 4)
		{
			System.out.println("Le choix doit être entre 1 et 4");
			reponse = entree.nextInt();
		}
		
		System.out.println("Choix du joueur : " + reponse);
		
		return reponse;
	}
}