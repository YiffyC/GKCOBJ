package exerciceI;

public class Produit 
{
	String code;
	String nom;
	int prix;
	
	public Produit(String code)
	{
		this.code = code;
		nom = "";
		prix = -1;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	

	
	
	
	

}



