public class PNJ extends Personnage{

	private String role;
	private Objet objetDetenu;
	private String Script;
	private boolean retrouvé;
	


	public PNJ(Position localisation, String role,String Script) {
		super(localisation);
		this.role = role;
		this.objetDetenu=null;
		this.Script=Script;
		this.retrouvé=false;
	}
	
	public PNJ(Position localisation, String role, String Script,Objet objetDetenu) {
		super(localisation);
		this.role = role;
		this.objetDetenu = objetDetenu;
		this.Script=Script;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Objet getObjetDetenu() {
		return objetDetenu;
	}


	public void setObjetDetenu(Objet objetDetenu) {
		this.objetDetenu = objetDetenu;
	}
	
	@Override
	public String toString() {
		return "PNJ [Script=" + Script + "]";
	}
	
	public String getScript() {
		return Script;
	}

	public void setScript(String script) {
		Script = script;
	}

	public boolean isRetrouvé() {
		return retrouvé;
	}

	public void setRetrouvé(boolean retrouvé) {
		this.retrouvé = retrouvé;
	}
	
	public PNJ donnePNJFamille(Integer a)
	{
		Integer x = null;
		Integer y = null;
		PNJ non = new PNJ(null,null,null,null);
		if(a==1)
		{
			x=4;y=2;
			String role = "Tante";
			String nom = "Bout de Papier de Tante Suzie";
			String detail = "Sur ce bout de papier est incrit le numéro de Plaque d'immatriculation de papa, "
					+ "si je me souviens bien Tante Suzie m'a indiqué qu'il s'était garé dans le parking près du concert de JUL";
			Objet o = new Objet(nom,detail);
			String Script = "Salut Jordan, c'est Tante Suzie va retrouvez ta mere,ton pere, ta soeur et ton frère ça sera ta nouvelle mission HAHA je n'ai eu des nouvelles"
					+ "que de ton père d'ailleurs je l'ai eu au téléphone à l'instant il s'était garé au parking juste à côté du concert de Jul"
					+ "/n Prend ce bout de papier il est noté sa plaque d'immatriculation A+";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script,o);
			return pnj;

		}
		if(a==3)
		{
			x=3;y=1;
			String role = "Pere";
			
			String Script = "Salut Fiston, faut qu'on retrouve les autres, il y a un commisariat au sud on peut les voir si tu veux";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==2)
		{
			x=1;y=3;
			String role = "Mere";
			
			String Script = "Salut mon coeur de retour à la maison je vous fais à graille";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==4)
		{
			x=6;y=1;
			String role = "Frere";
			
			String Script = "Salut Frangin, let's go à la maison, marre des montagnes";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		if(a==5)
		{
			x=0;y=0;
			String role = "Soeur";
			
			String Script = "Salut mon frere, faut qu'on y aille marre de cette maltraitance animal";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==6)
		{
			x=3;y=3;
			String role = "Lenny le policier";
			
			String Script = "Bonjour je suis Lenny le policier";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==7)
		{
			x=5;y=3;
			String role = "Carl le policier";
			
			String Script = "Bonjour je suis Carl le policier";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==8)
		{
			x=1;y=1;
			String role = "Brandon le nagueur";
			
			String Script = "Bonjour je suis Brandon, Maitre nagueur à la croix-rouge";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		if(a==9)
		{
			x=0;y=1;
			String role = "Corine la bibliothecaire";
			
			String Script = "Bonjour je suis Corine bibliothecaire depuis plus de 40 ans";
			Position pos = new Position(x,y);
			PNJ pnj = new PNJ (pos,role,Script);
			return pnj;

		}
		
		
		return non;
	}
	
	

}
