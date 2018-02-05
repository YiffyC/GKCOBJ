package demo;

public class Client {
	
	public static int cpt = 0; //static = var de classe --> ce compteur n'est pas instanci� avec le client. Il n'est cr�� qu'a l'appel de la classe Client
	private int numero;
	private String nom;
	
	
	public Client() {
		// constructeur // 
		
		numero = 0;
		nom = "Inconnu";
		cpt++;
		//cpt++ est la m�me chose que cpt = cpt+1
		
		
	}
	
	
	
	

	public String info()
	{
		return "Le client se nomme " + this.getNom() + " son numero est " + this.getNumero();
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
	
	

}
