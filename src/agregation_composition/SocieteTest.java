package agregation_composition;

public class SocieteTest {

	public static void main(String[] args) {

		Societe s = new Societe();
		
		//afficher nom de la societe
		System.out.println(s.getNom());
		
		//Afficher nom de la division
		System.out.println(s.getDivision().getNom());
		
		//Afficher la raison sociale du service de la division
		System.out.println(s.getDivision().getService().getRaisonSociale());
		
		s.setNom("Orange");
		s.getDivision().setNom("R&D");
		s.getDivision().getService().setRaisonSociale("Bureau de recherche en Java");
		
		
		System.out.println("______________________________");
		
		
		//afficher nom de la societe
		System.out.println("Société : " + s.getNom());
				
		//Afficher nom de la division
		System.out.println("Division : " + s.getDivision().getNom());
				
		//Afficher la raison sociale du service de la division
		System.out.println("Raison sociale : " + s.getDivision().getService().getRaisonSociale());
		
		

	}

}
