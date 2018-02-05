package exerciceI;

public class VoitureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Voiture v = new Voiture();
		System.out.println(v.info()); //affichage de la voiture générée de base 
		
		
		v.setNbPortes(5);
		v.setMarque("BMW");
		v.setCouleur("Noir");
		System.out.println(v.info());
		
		v.setNbPortes(15);
		System.out.println(v.info());
		
		
		
		/*
		int nbVoit = 10;
		Voiture[] tab = new Voiture[10];
		
		
		for(int i = 0; i < nbVoit; i++)
		{
			tab[i] = new Voiture();
			tab[i].setNbPortes(i);
			System.out.println(tab[i].info());
			
			
			
			Voiture v = new Voiture();
			v.setMarque("Volvo");
			
		}
		
		
		*/

	}

}
