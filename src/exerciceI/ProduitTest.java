package exerciceI;

import java.util.Scanner;


public class ProduitTest {

	public static void main(String[] args) {
		
		Produit p = new Produit("produit100");
		Produit p2 = new Produit("produit200");
		
		
		/*
		int nbProd = 10;
		Produit[] tab = new Produit[nbProd];
		*/
		
		
		
		// affichage du produit1 non modifié
		//System.out.println("Nom : " + p.getNom() + "   Code : " + p.getCode() + "   Prix : " + p.getPrix());
		
		
		//modification des produits
		p.setNom("Crayon à papier");
		p.setPrix(1);
		
		p2.setNom("Crayon de couleur");
		p2.setPrix(2);
		
		
		
		
		
		
		//Affichage des produits
		System.out.println("Nom : " + p.getNom() + "   Code : " + p.getCode());
		System.out.println("Nom : " + p2.getNom() + "   Code : " + p2.getCode() + "   Prix : " + p2.getPrix());
		
		
		/*
		for(int i = 0; i < tab.length; i++)
		{
			tab[i] = new Produit("produitTAB"+i+"00");
			System.out.println(tab[i].getCode());
		}
		*/
		
	

	}

}
