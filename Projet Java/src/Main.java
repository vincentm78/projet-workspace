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
	
	Tante tante = new Tante(pos, "tante","salut, Jordan je vais te parler un peu de ta famille \n","\n tout d'abord, tu sais que ton frere a toujours rever de voir la joconde?","\n ta mere aimé le soleil et plus particulierement les plages","\n ton père lui préfère les montagnes","\n et ta soeur elle, aime les corrida");
	do
	{
		tante.getDialogue1();
		tante.getDialogue2();
		System.out.println("\n Veuillez entrez votre choix : 'ok' pour continuer, 'repeter' pour repeter \n ");
		Scanner choixtante1 = new Scanner(System.in);
		choixtante1 = choixtante1.nextLine();
		if(choixtante1!="ok"||choixtante1!="repeter")
		{
			System.out.println("Saisie Introuvable \n");
		}
	}
	while(choixtante1!="ok");
		
	do
	{
		tante.getDialogue3();
		System.out.println("\n Veuillez entrez votre choix : 'ok' pour continuer, 'repeter' pour repeter \n ");
		Scanner choixtante2 = new Scanner(System.in);
		choixtante2 = choixtante2.nextLine();
		if(choixtante2!="ok"||choixtante2!="repeter")
		{
			System.out.println("Saisie Introuvable \n");
		}
	}
	while(choixtante2!="ok");
			
	do
	{
		tante.getDialogue4();
		System.out.println("\n Veuillez entrez votre choix : 'ok' pour continuer, 'repeter' pour repeter \n ");
		Scanner choixtante3 = new Scanner(System.in);
		choixtante3 = choixtante3.nextLine();
		if(choixtante3!="ok"||choixtante3!="repeter")
		{
			System.out.println("Saisie Introuvable \n");
		}
	}
	while(choixtante3!="ok");	
	
	do
	{
		tante.getDialogue5();
		System.out.println("\n Veuillez entrez votre choix : 'ok' pour continuer, 'repeter' pour repeter \n ");
		Scanner choixtante4 = new Scanner(System.in);
		choixtante4 = choixtante4.nextLine();
		if(choixtante4!="ok"||choixtante4!="repeter")
		{
			System.out.println("Saisie Introuvable \n");
		}
	}
	while(choixtante4!="ok");
		

			}
		}
		
	}
	
	
	
	
	
	//

	
	
	
	
	
	
	
	
	
	
}
}
