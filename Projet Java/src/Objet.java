public class Objet
{
	private String nom;
	private String detail;
	
	public Objet(String nom,String detail)
	{
		this.nom=nom;
		this.detail=detail;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public void afficheNomObjet()
	{
	   System.out.println(this.nom);
	}
	public void lireDesObjet()
	{
		System.out.println(this.detail);
	}
	
	public String toString() {
		return "Objet [nom=" + nom + ", detail=" + detail + "]";
	}

	
	
}
