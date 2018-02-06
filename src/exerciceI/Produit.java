package exerciceI;

public class Produit 
{
	
	// variables d'instances
	private String code;
	private String nom;
	private int prix;
	
	
	//Constructeur
	public Produit(String code)
	{
		this.code = code;	//Construction avec le code pass� en argument
		nom = "";			//Par d�faut pas de nom
		prix = -1;			//Par d�faut prix = -1
		
	}

	
	//getter - setter
	// Get lis les informations
	// Set permet de modifier la valeur d'une variable par la (les) donn�e(s) en param�tre
	
	public String getCode() {
		return code;
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



