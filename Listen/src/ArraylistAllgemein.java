import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistAllgemein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Array erstellen Arraygr��e ist fest
	int [] zahlen = new int[2];
	//Werte geben
	zahlen[0] = 0;
	zahlen[1] = 1;
	// Ausgabe
	for(int i = 0; i < zahlen.length; i++) {
		System.out.println(zahlen[i]);
	}
	// Array l�nge = length
		
	// ArrayList erstellen	
	ArrayList einkauf = new ArrayList();
	// ArrayList erstellen nur mit String
	ArrayList<String> namen = new ArrayList<String>();
	
	
	int zahl = 2;
	// Hinzuf�gen 
	einkauf.add("Wasser");
	einkauf.add("Brot");
	einkauf.add(3);
	einkauf.add(zahl);
	System.out.println(einkauf);
	
	namen.add("Hans");
	namen.add("Peter");
	System.out.println(namen);
	
	// Ausgabe
	for(int i = 0; i < namen.size(); i++) {
		System.out.println(namen.get(i));
		
	}
	// Foreach
	// Mache f�r jedes Element ...Inhalt der Schleife
	for (String string : namen) {
		System.out.println(string.length());
	}

		
	// LinkList 
	// LinkList erstellen
	LinkedList<Integer> listeLinkedList = new LinkedList<Integer>();
	for(int i = 0; i < 10000000; i++) {
		listeLinkedList.add(i);
	}
	
	// LinkList bei Neu Hinzuf�gen, L�schen, Ka welche gr��e
	// ArrayList wenn man suchen m�chte, Gr��e bekannt. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
