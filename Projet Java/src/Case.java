public class Case 
{
    private String lieu;
	private Porte porte;
	private twoPorte twoPorte;


	public Case()
     {
    	 this.lieu=null;
    	 this.porte=null;
    	 this.twoPorte=null;
     }
    

    public String getLieu() {
		return lieu;
	}


	public void setLieu(String lieu) {
		this.lieu = lieu;
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
	@Override
	public String toString() {
		return "Case [lieu=" + lieu + ", porte=" + porte + ", twoPorte=" + twoPorte + "]";
	}
     

}  
