package agregation_composition;

public class Societe {
	
	private String nom;
	private Division division;
	
	public Societe()
	{
		nom = "Nom societe";
		division = new Division();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	
	
	
}
