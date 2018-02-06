package exerciceIII_IV;

public class ProduitTest {

	public static void main(String[] args) {
		
		
		//Création des produits
		Produit p = new Produit("produit100");
		Produit p2 = new Produit("produit200");
		ProduitSaisonnier ps1 = new ProduitSaisonnier("FFFFF");
		ProduitPerissable pp1 = new ProduitPerissable("FFFFE");
		
		
		//valeurs
		p.setPrix(1);
		p2.setPrix(2);
		ps1.setPrix(125);
		ps1.setRemiseFinSaison(50);
		ps1.setPrix(500);
		
		
		
		
		/*
		 * Test de l'exercice
		 * Pour chaque produit du tableau, on recupere le prix
		 */
		Produit[] tabProduit = {p, p2, ps1, pp1};
		
		for (int i = 0; i < tabProduit.length; i++) 
		{
			
			System.out.println("Prix du produit " + i + " : " + tabProduit[i].getPrix());
			
		}
		
		
		
	}

}
