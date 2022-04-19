package Carte;

public class twoPorte
{
	

	private Porte porte1;
	private Porte porte2;
	
	public twoPorte()
	{
		this.porte1=null;
		this.porte2=null;
	}
	
	
	
	
	public Porte getPorte1() {
		return porte1;
	}

	public void setPorte1(Porte porte1) {
		this.porte1 = porte1;
	}

	public Porte getPorte2() {
		return porte2;
	}

	public void setPorte2(Porte porte2) {
		this.porte2 = porte2;
	}
	
	public twoPorte creerTwoPorte(Integer numVille,Integer numCase)
	{
		twoPorte nv = new twoPorte();
		if(numVille==4&&numCase==2)
		{
			Porte A = new Porte(numVille,numCase,1,4);
			Porte B = new Porte(numVille,numCase,5,1);
			
			nv.setPorte1(A);
			nv.setPorte1(B);
			
			return nv;
			
		}
		
		if(numVille==5&&numCase==2)
		{
			Porte A = new Porte(numVille,numCase,2,4);
			Porte B = new Porte(numVille,numCase,6,1);
			
			nv.setPorte1(A);
			nv.setPorte1(B);
			
			return nv;
			
		}
		System.out.println("Aucune double porte a été retourné");
		return null;
		
		
		
	}
}