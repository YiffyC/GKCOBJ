package agregation_composition;

public class Division {
	
	private Service service;
	private String nom;
	
	public Division()
	{
		nom = "Nom Division";
		service = new Service();
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
