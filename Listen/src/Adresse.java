
public class Adresse {

	// Eigenschaften / Attribute
	private String name;
	private String Stra�e;
	private String stadt;
	
	
	//Konstruktor
	public Adresse(String name, String stra�e, String stadt) {
		super();
		this.name = name;
		Stra�e = stra�e;
		this.stadt = stadt;
	}
	
	// Methoden
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStra�e() {
		return Stra�e;
	}
	public void setStra�e(String stra�e) {
		Stra�e = stra�e;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	
	
	
	
}
