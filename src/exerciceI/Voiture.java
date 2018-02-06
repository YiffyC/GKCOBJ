package exerciceI;

public class Voiture {
	
	private String couleur;
	private String marque;
	private int nbPortes;
	
	
	public Voiture()
	{
		couleur = "rouge";
		marque = "Ferrari";
		nbPortes = 3;
	}
	
	
	//Constructeur avec parametres
	public Voiture(String couleur, String marque, int nbPortes)
	{
		this.couleur = couleur;
		this.marque = marque;
		this.nbPortes = nbPortes;
	}

	
	public String info()
	{
		return "Voiture " + this.getCouleur() + " avec " + this.getNbPortes() + " portes " + " de marque " + this.getMarque();
	}
	
	
	
	
	
	// getters - setters 

	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public int getNbPortes() {
		return nbPortes;
	}


	public void setNbPortes(int nbPortes) {
		if(nbPortes == 3 || nbPortes == 5)
			//si le nombre de portes est exactement 3 ou 5 alors on modifie
		this.nbPortes = nbPortes;
		//sinon on ne fait rien
	}
	


}
