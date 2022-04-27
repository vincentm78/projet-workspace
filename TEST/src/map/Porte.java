package map;

public class Porte 
{

	private Integer villeEntree;
	private Integer LieuEntree;
	private Integer villeSortie;
	private Integer LieuSortie;
	
	public Porte(Integer villeEntree, Integer lieuEntree, Integer villeSortie, Integer lieuSortie) {
		this.villeEntree = villeEntree;
		this.LieuEntree = lieuEntree;
		this.villeSortie = villeSortie;
		this.LieuSortie = lieuSortie;
	}

	public Integer getVilleEntree() {
		return villeEntree;
	}
	public void setVilleEntree(Integer villeEntree) {
		this.villeEntree = villeEntree;
	}
	public Integer getLieuEntree() {
		return LieuEntree;
	}
	public void setLieuEntree(Integer lieuEntree) {
		LieuEntree = lieuEntree;
	}
	public Integer getVilleSortie() {
		return villeSortie;
	}
	public void setVilleSortie(Integer villeSortie) {
		this.villeSortie = villeSortie;
	}
	public Integer getLieuSortie() {
		return LieuSortie;
	}
	public void setLieuSortie(Integer lieuSortie) {
		LieuSortie = lieuSortie;
	}
	@Override
	public String toString() {
		return "Porte [villeEntree=" + villeEntree + ", LieuEntree=" + LieuEntree + ", villeSortie=" + villeSortie
				+ ", LieuSortie=" + LieuSortie + "]";
	}
	
	
	
}
