public class Porte
{
	private Integer villeEntree;
	private Integer numCaseEntree;
	private Integer villeSortie;
	private Integer numCaseSortie;

	
	public Porte()
	{
		
	}
	
	//Presence 1 porte
	public Porte(Integer villeEntree, Integer numCaseEntree, Integer villeSortie,
			Integer numCaseSortie) {
		
		this.villeEntree = villeEntree;
		this.numCaseEntree = numCaseEntree;
		this.villeSortie = villeSortie;
		this.numCaseSortie = numCaseSortie;
	}
	

	



	public Integer getVilleEntree() {
		return villeEntree;
	}



	public void setVilleEntree(Integer villeEntree) {
		this.villeEntree = villeEntree;
	}



	public Integer getNumCaseEntree() {
		return numCaseEntree;
	}



	public void setNumCaseEntree(Integer numCaseEntree) {
		this.numCaseEntree = numCaseEntree;
	}



	public Integer getVilleSortie() {
		return villeSortie;
	}



	public void setVilleSortie(Integer villeSortie) {
		this.villeSortie = villeSortie;
	}



	public Integer getNumCaseSortie() {
		return numCaseSortie;
	}



	public void setNumCaseSortie(Integer numCaseSortie) {
		this.numCaseSortie = numCaseSortie;
	}

}
