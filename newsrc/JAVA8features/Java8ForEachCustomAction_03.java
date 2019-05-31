package JAVA8features;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Java8ForEachCustomAction_03 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("USA", "Washington");
		map.put("Australia", "Canberra");
		map.put("Canada", "Ottawa");
		map.put("Belgium", "Brussells");

		Consumer<Map.Entry<String, String>> action = entry -> 
		{ 
			System.out.println("Key is : " + entry.getKey()); 
			System.out.println("Value is : " + entry.getValue()); 
		}; 

		map.entrySet().forEach(action);
	}

}
