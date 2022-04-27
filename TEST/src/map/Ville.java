package map;

public class Ville 
{
	
	
private String nomVille;
	
	private Lieu box1;
	private Lieu box2;
	private Lieu box3;
	private Lieu box4;
	

	
	public Ville(String nomVille, Lieu box1, Lieu box2, Lieu box3, Lieu box4) {
		this.nomVille = nomVille;
		this.box1 = box1;
		this.box2 = box2;
		this.box3 = box3;
		this.box4 = box4;
	}
	
	
	
	
	
	
	
	
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public Lieu getBox1() {
		return box1;
	}
	public void setBox1(Lieu box1) {
		this.box1 = box1;
	}
	public Lieu getBox2() {
		return box2;
	}
	public void setBox2(Lieu box2) {
		this.box2 = box2;
	}
	public Lieu getBox3() {
		return box3;
	}
	public void setBox3(Lieu box3) {
		this.box3 = box3;
	}
	public Lieu getBox4() {
		return box4;
	}
	public void setBox4(Lieu box4) {
		this.box4 = box4;
	}
	@Override
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", box1=" + box1 + ", box2=" + box2 + ", box3=" + box3 + ", box4=" + box4
				+ "]";
	}
	
	
	
}
