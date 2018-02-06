package exerciceIII_IV;

public class Denomination {
	
	
	private String libelleLong;
	private String libelleCourt;
	
	
	//constructeur
	public Denomination()
	{
		
		libelleCourt = "Libelle court";
		libelleLong = "Libelle long";
		
	}


	
	
	//accesseur
	public String getLibelleLong() {
		return libelleLong;
	}


	public void setLibelleLong(String libelleLong) {
		this.libelleLong = libelleLong;
	}


	public String getLibelleCourt() {
		return libelleCourt;
	}


	public void setLibelleCourt(String libelleCourt) {
		this.libelleCourt = libelleCourt;
	}
	
	
}
