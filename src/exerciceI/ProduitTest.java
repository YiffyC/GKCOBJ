package exerciceI;

public class ProduitTest {

	public static void main(String[] args) {
		
		
		//Création des produits
		Produit p = new Produit("produit100");
		Produit p2 = new Produit("produit200");
		
		
		//modification des produits
		p.setNom("Crayon à papier");
		p.setPrix(1);
		
		p2.setNom("Crayon de couleur");
		p2.setPrix(2);
		

		//Affichage des produits
		System.out.println("Nom : " + p.getNom() + "   Code : " + p.getCode());
		System.out.println("Nom : " + p2.getNom() + "   Code : " + p2.getCode() + "   Prix : " + p2.getPrix());
		

	}

}
