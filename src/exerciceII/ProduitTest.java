package exerciceII;

public class ProduitTest {

	public static void main(String[] args) {
		
		
		//Création des produits
		Produit p = new Produit("produit100");
		Produit p2 = new Produit("produit200");
		
		p.setPrix(1);
		p2.setPrix(2);
		
		
		//on affiche le libelle de base
		System.out.println(p.afficheLibelle());
		

		
		//on modifie avec la methode modiflibelle
		p.modifLibelle("Crayon a papier", "Crayon a papier a l'unite");
		p2.modifLibelle("Crayon de couleur", "Paquet de 15 crayons de couleur");
		
		System.out.println(p.afficheLibelle());
		System.out.println(p2.afficheLibelle());
	}

}
