package exerciceIII_IV;

public class Produit 
{
	
	// variables d'instances
	private String code;
	private Denomination denom;					//on utilise une denomination
	private int prix;
	
	
	//Constructeur
	public Produit(String code)
	{
		this.code = code;				//Construction avec le code passé en argument
		denom = new Denomination();		// on cree une nouvelle denomination
		prix = -1;						//Par défaut prix = -1
		
	}
	
	
	//affiche les deux libelles
	
	public String afficheLibelle()
	{
		return this.getDenom().getLibelleCourt() + " - " + this.getDenom().getLibelleLong();
	}
	
	
	//modifier les deux libelles
	
	public void modifLibelle(String lcourt, String llong)
	{
		Denomination d = this.getDenom();
		
		d.setLibelleCourt(lcourt);
		d.setLibelleLong(llong);
	}

	
	//getter - setter
	// Get lis les informations
	// Set permet de modifier la valeur d'une variable par la (les) donnée(s) en paramètre
	
	public String getCode() {
		return code;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}


	public Denomination getDenom() {
		return denom;
	}


	public void setDenom(Denomination denom) {
		this.denom = denom;
	}
	
	

	
	
	
	

}



