
public abstract class Tiere {

	
	String name;
	int groe�e;
	int gewicht;
	
	public Tiere() {
		
	}
	public Tiere(String name, int groe�e, int gewicht) {
		this.name = name;
		this.groe�e = groe�e;
		this.gewicht = gewicht;
	}
	
	public abstract void essen();
	
	public abstract void atmen();
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
