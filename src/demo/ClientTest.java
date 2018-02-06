package demo;

public class ClientTest {

	public static void main(String[] args) {
		// var //

		int cpt;
		
		String chaine1, chaine2;
		
		Client client, client2, client3;
		
		
		// init //
		
		cpt = 10;
		chaine1 = "Bon";
		chaine2 = "jour";
		
		// creation de 3 clients //
		client = new Client();
		client2 = new Client();
		client3 = new Client();
	
		
		
		// manip // 		
		//avant de passer nom et num en private  //
		// = si pas de getters et setters        //
		//client.nom = "Dupont";
		//client.numero = 1;
		//                                       //
		
		
		System.out.println("cpt :" + cpt + "  chaine1 :" + chaine1 + "  chaine2 :" + chaine2); //affichage des 
		// ici c'est le compteur de la classe ClientTest qui est affiche"
		
		System.out.println("manip : " + client.info());
		
		
		client.setNom("John");
		// On nomme le client "test"
		
		System.out.println(client.getNom());
		// On affiche son nom
		
		//System.out.println("nb clients initialises : " + Client.cpt);
		//On affiche le nombre de clients  totaux
		
		
		
		
		//avec l'adresse
		
		//in fait pointer une variable sur l'adresse du client
		Adresse temp = client.getAdresse();
		
		//modification des infos client
		temp.setNum(9);
		temp.setNomRue("Place saint michel");
		temp.setCp(21000);
		temp.setVille("Dijon");
		temp.setPays("France");
		
		//affichage du client
		System.out.println(client.info());
		
		//Modification de la ville avec la methode setVille
		client.setVille("Corbeil-Essone");
		System.out.println(client.info());

	}

}
