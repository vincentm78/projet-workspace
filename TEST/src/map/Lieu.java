package map;

import Personnage.PNJ;

public class Lieu
{

	private Porte porte;
	private twoPorte twoPorte;
	private String nomLieu;
	private PNJ pnj;
	
	public Lieu()
	{
		
	}
	
	public Lieu(Porte porte,twoPorte twoPorte, String nomLieu, PNJ pnj) {
		this.porte = porte;
		this.twoPorte = twoPorte;
		this.nomLieu = nomLieu;
		this.pnj = pnj;
	}
    
	
	public Lieu( String nomLieu) {
		this.nomLieu = nomLieu;
	}
	public Lieu(PNJ pnj, String nomLieu) {
		this.nomLieu = nomLieu;
		this.pnj=pnj;
	}
	
	public Lieu(Porte porte, PNJ pnj,String nomLieu) {
		this.porte = porte;
		this.nomLieu = nomLieu;
		this.pnj = pnj;
	}
	
	public Lieu(twoPorte twoporte, PNJ pnj,String nomLieu) {
		this.twoPorte = twoporte;
		this.nomLieu = nomLieu;
		this.pnj = pnj;
	}
	
	public Lieu(Porte porte,String nomLieu) {
		this.porte = porte;
		this.nomLieu = nomLieu;
	}
	public Lieu(twoPorte twoporte,String nomLieu) {
		this.twoPorte = twoporte;
		this.nomLieu = nomLieu;
	}
	
	
	
	
	
	
	
	public Porte getPorte() {
		return porte;
	}
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
	public twoPorte getTwoPorte() {
		return twoPorte;
	}
	public void setTwoPorte(twoPorte twoPorte) {
		this.twoPorte = twoPorte;
	}
	public String getNomLieu() {
		return nomLieu;
	}
	public void setNomLieu(String nomLieu) {
		this.nomLieu = nomLieu;
	}
	public PNJ getPnj() {
		return pnj;
	}
	public void setPnj(PNJ pnj) {
		this.pnj = pnj;
	}
	
}
