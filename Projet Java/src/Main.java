package Main;

import java.util.Scanner;

public class Main
{
	
	
	
	
	
	
	
	
	
	
	
public static void main (String[] args){
	 
	String menu = "Coucou";
	while(menu!="Nouveau"||menu!="Charger")
	{
	System.out.println("Bienvenue dans le jeu Jeu Family's Journey /n"
			+ "Taper Nouveau pour lancer une nouvelle partie"
			+ "Taper Charger pour lancer la dernière sauvegarde"
			);
	//+ "Taper Synopsis pour afficher"
	System.out.println("Veuillez entrez votre choix : ");
	Scanner sc = new Scanner(System.in);
	menu = sc.nextLine();
	if(menu!="Nouveau"||menu!="Charger")
	{
		System.out.println("Saisie Introuvable");
	}
	}
	
	
	
	
	
	
	//

	
	
	
	
	
	
	
	
	
	
}
}
