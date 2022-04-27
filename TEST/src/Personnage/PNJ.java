package Personnage;

import main.Position;

public class PNJ 
{

	private String Nom;
	private Objet ObjDetenu;
	private String Script;
	private Position pos;
	private Boolean retrouve;
	
	public PNJ(String nom, Objet objDetenu, String script, Position pos, boolean retrouve) {
		this.Nom = nom;
		this.ObjDetenu = objDetenu;
		this.Script = script;
		this.pos = pos;
		this.retrouve = retrouve;
	}
	
	


	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Objet getObjDetenu() {
		return ObjDetenu;
	}
	public void setObjDetenu(Objet objDetenu) {
		ObjDetenu = objDetenu;
	}
	public String getScript() {
		return Script;
	}
	public void setScript(String script) {
		Script = script;
	}
	public Boolean getRetrouve() {
		return retrouve;
	}
	public void setRetrouve(Boolean retrouve) {
		this.retrouve = retrouve;
	}
	
	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "PNJ [Nom=" + Nom + ", ObjDetenu=" + ObjDetenu + ", Script=" + Script + ", retrouve=" + retrouve + "]";
	}
	
	
	
}
