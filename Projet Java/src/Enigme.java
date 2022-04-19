import java.util.Scanner;
 
public class Enigme {
 
      private static final long serialVersionUID = 1L;
      private int id;
      private String question;
      private String reponse;
      private String indice;
      private PNJ pnjconcerné;
      private String msgPerdant;
      private String msgGagnant;
      private boolean verif;
      
      
      public Enigme(int id, String question, String reponse, String indice, PNJ pnjconcerné, String msgPerdant,
                   String msgGagnant) {
             super();
             this.id = id;
             this.question = question;
             this.reponse = reponse;
             this.indice = indice;
             this.pnjconcerné = pnjconcerné;
             this.msgPerdant = msgPerdant;
             this.msgGagnant = msgGagnant;
             this.verif = false;
      }
      
      public void trouver_rep()
      {
             System.out.println("voici la question : ", this.question);
             System.out.println("à qui est ce lié ? (lien de parenté avec vous, ne pas mettre de maj");
             
             Scanner scanner = new Scanner(System.in);
             Long rep = scanner.nextLong();
             
             while(rep!=this.pnjconcerné)
             {
                   System.out.println(this.msgPerdant);
             }
             if(this.pnjconcerné == rep)
             {
                   System.out.println(this.msgGagnant);
                   this.verif = true;
             }
             
      }
      
      
      
}
