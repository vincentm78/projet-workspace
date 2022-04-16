import java.util.Scanner;

public class SaisieClavier {

	public static void main(String[] args) {



		Scanner toto = new Scanner(System.in);

		System.out.println("Saisissez votre choix : ");

		int reponse = toto.nextInt();

		System.out.println("Choix du user : "+ reponse);
		
	}	 
}