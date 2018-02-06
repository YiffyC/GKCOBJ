package exerciceIII_IV;

public class ProduitSaisonnier extends Produit {
	
	String saison;
	int remiseFinSaison;
	

	
	
	//cstr
	public ProduitSaisonnier(String code) {
		super(code);
		// TODO Auto-generated constructor stub
		saison = "";
		remiseFinSaison = 0;
		
	}



	//getset
	public String getSaison() {
		return saison;
	}




	public void setSaison(String saison) {
		this.saison = saison;
	}




	public int getRemiseFinSaison() {
		return remiseFinSaison;
	}




	public void setRemiseFinSaison(int remiseFinSaison) {
		this.remiseFinSaison = remiseFinSaison;
	}



	@Override
	public void setPrix(int prix) {
		// TODO Auto-generated method stub
		super.setPrix(prix-remiseFinSaison);
	}




}
