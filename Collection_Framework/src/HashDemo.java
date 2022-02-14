import java.util.HashMap;

public class HashDemo {

	public static void main(String[] args) {
		HashMap<String, Integer>map =new HashMap<>();
		map.put("swapnil", 10);
		map.put("rajesh", 20);
		map.put("Nilesh", 30);
		map.put("radhesh", 40);
		
		System.out.println("size of map is:-" +map.size());
		 // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("swapnil")) {
 
            // Mapping
            Integer a = map.get("swapnil");
 
            // Printing value fr the corresponding key
            System.out.println("value for key"
                               + " \"swapnil\" is:- " + a);
        }
    }
}