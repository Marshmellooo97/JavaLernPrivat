package Map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// K = Key = Schl�ssel
		// V = Value = Wert = Inhalt
		Map<Integer, String> map1 = new HashMap<>();
		// put = hinzuf�gen
		map1.put(1111, "Element1");
		map1.put(2222, "Element2");
		
		System.out.println(map1.get(1111));
		// get = Schl�ssel eingeben und das passende Element bekommen
		for(Integer key: map1.keySet()) {
			System.out.println("Schl�ssel: "+ key);
			String value = map1.get(key);
			System.out.println("Inhalt: " + value);
			
			
			
			
			
			
			
			
		}
	}

}
