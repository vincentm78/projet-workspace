import java.util.LinkedList;
public class Ville {

	private String nom;
	private Integer id;
	private LinkedList<Lieu> listeLieu = new LinkedList<Lieu>();
	
	
	public Ville(String nouvNom, Integer ident) {
		this.nom = nouvNom;
		this.id = ident;
	}


	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


}