package demo;

public class Client {
	
	 //static = var de classe --> ce compteur n'est pas instancié avec le client. Il n'est créé qu'a l'appel de la classe Client
	private int numero;
	private String nom;
	Adresse adresse;
	
	
	public Client() {
		
		// constructeur // 		
		numero = 0;
		nom = "Inconnu";
		adresse = new Adresse();
		//cpt++ est la même chose que cpt = cpt+1
		
		
	}
	
	
	
	

	public String info()
	{
		return "Le client se nomme " + this.getNom() + " son numero de client est " + this.getNumero() + " son adresse est " + getAdresse().getNum() + ", " + getAdresse().getNomRue() + " " + getAdresse().getCp() + " " + getAdresse().getVille();
	}

	
	
	//Création du setVille
	public void setVille(String ville)
	{
		getAdresse().setVille(ville);
	}
	
	
	// accesseurs

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}





	public Adresse getAdresse() {
		return adresse;
	}





	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	

}
