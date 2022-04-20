public class Police extends PNJ{

  
      private String dialogue1;

      private String dialogue2;

      private String dialogue3;

      private String dialogue4;
  

      public Police(Position localisation, String role, String dialogue1, String dialogue2, String dialogue3, String dialogue4) {

             super();

             this.position = localisation;

             this.role = role;

             this.dialogue1 = dialogue1;

             this.dialogue2 = dialogue2;

             this.dialogue3 = dialogue3;

             this.dialogue4 = dialogue4;

      }


      public String getDialogue1() {

             return dialogue1;

      }
  

      public void setDialogue1(String dialogue1) {

             this.dialogue1 = dialogue1;

      }

 

      public String getDialogue2() {

             return dialogue2;

      }

 

      public void setDialogue2(String dialogue2) {

             this.dialogue2 = dialogue2;

      }

 

      public String getDialogue3() {

             return dialogue3;

      }



      public void setDialogue3(String dialogue3) {

             this.dialogue3 = dialogue3;

      }

 

      public String getDialogue4() {

             return dialogue4;

      }


      public void setDialogue4(String dialogue4) {

             this.dialogue4 = dialogue4;

      }
 

}
