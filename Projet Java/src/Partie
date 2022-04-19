import java.io.*;

import java.util.*;

 

public class Partie {

 

              public void traiterCmd(String cmd)

              {
                  if(listecmdPossible.contains(cmd))

// il faut qu'on lie les commandes à des conditions dans des listes (exemple: si la pos du joueur est a

//coté d'une porte -> cmdPossible ouvrirPorte)

                            {

                                          if(cmd == "enregistrer")

                                          {

                                                         ObjectOutputStream oos = null;

                                                        

                                                         System.out.println("vous voulez enregistrer, entrer un nom pour l'enregistrement");

                                                         Scanner scanner = new Scanner(System.in);

                                                         Short nomrec = scanner.nextShort();

                                                         System.out.println("voici le nom choisi : ",nomrec);

                                                        

                                                         File rec =  new File(nomrec+".ser") ;

                                                         try {

                                                                      

                                                                       FileOutputStream fos = new FileOutputStream(rec);

                                                                       ObjectOutputStream oos = new ObjectOutputStream(fos);

                                                                       oos.writeObject(this);

                                                                       oos.close();

                                                                       fos.close();

                                                         } catch (IOException e) {

                                                                       // TODO Auto-generated catch block

                                                                       e.printStackTrace();

                                                         }

                                          }


                            }

              }
