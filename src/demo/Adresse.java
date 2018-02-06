package demo;

public class Adresse {
	
	private int num;
	private String nomRue;
	private int cp;
	private String ville;
	private String pays;
	
	
	public Adresse()
	{
		num = -1;
		nomRue = "non renseigne";
		cp = 000000;
		ville = "inconnue";
		pays = "inconnu";
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getNomRue() {
		return nomRue;
	}


	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	
	


}
