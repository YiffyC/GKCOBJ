package exerciceIII_IV;

import java.util.Date;



public class ProduitPerissable extends Produit {
	
	int dureeConservation;
	Date dteFabrication;
	

	
	//cstr
	public ProduitPerissable(String code) {
		super(code);
		// TODO Auto-generated constructor stub
		dureeConservation = -1;
		dteFabrication = new Date();
		
	}


	
	//getset
	public int getDureeConservation() {
		return dureeConservation;
	}


	public void setDureeConservation(int dureeConservation) {
		this.dureeConservation = dureeConservation;
	}


	public Date getDteFabrication() {
		return dteFabrication;
	}


	public void setDteFabrication(Date dteFabrication) {
		this.dteFabrication = dteFabrication;
	}
	
	
	
	

}
