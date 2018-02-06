package exerciceI;

public class VoitureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Voiture v = new Voiture();							//v cree avec le constructeur sans arguments
		Voiture v2 = new Voiture ("vsiolet", "Ford", 5);		//v2 cree avec le constructeur avec les arguments
		System.out.println("1 (sans arg). " + v.info()); 	//affichage de v 
		System.out.println("1 (avec arg). " + v2.info());	//affichage de v2 
		
		
		v.setNbPortes(5);				// on donne 5 portes à v
		v.setMarque("BMW");				//on passe la marqueà BMW
		v.setCouleur("Noir");			//on passe la couleur à noir
		System.out.println("2. " + v.info());	//on verifie que les infos sont bien mises a jour
		
		v.setNbPortes(15);				//on passe le nombre de portes a 15 (Impossible car nbPorte == 3 ou ==5)
		System.out.println("3. " + v.info());	//On verifie que le nombre de porte ne passe pas a 15
		
		
		
		 /*
		 * 
		 * Pour aller plus loin, on peut initialiser un tableau de voiture avec 10 voitures
		 * et on incremente le nombre de porte de la voiture
		 * Pour i = 0, la voiture en tab[0] aura 0 portes, en tab[1] 1 porte ... en tab[10] 10 portes
		 * ainsi, on devra obtenir un nombre de porte
		 * de 3 pour toutes sauf i = 5
		 * 
		 * Exemple avec i=0
		 * la voiture en tab[0] a 0 portes, or, 0 est different de 3 et different de 5 donc le nombre de portes n'est pas modifie
		 * (voir Voiture.java ligne 55 pour le test)
		 */
		 
		
		/*
		int nbVoit = 10;
		Voiture[] tab = new Voiture[10];
		
		
		for(int i = 0; i < nbVoit; i++)
		{
			tab[i] = new Voiture();
			tab[i].setNbPortes(i);
			System.out.println("Boucle " + i + " - " +tab[i].info());
			
		}
		*/
		
		
		
		

	}

}
