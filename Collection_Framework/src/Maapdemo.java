
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maapdemo {

	public static void main(String[] args) {
		Map<Integer,String>student = new HashMap<>();
		student.put(3, "ram");
		student.put(2, "shyam");
		student.put(1, "jam");
		student.put(4, "Rupali");
		
//		for(Map.Entry<Integer, String> entry: student.entrySet()) {
//			
//			System.out.println("Key:" +entry.getKey()+"Value:"+entry.getValue());
//		}
////		
//		for(Integer key: student.keySet()) {
//			
//			System.out.println("Key:" +key+ " Value :"+student.get(key));
//		}
		
		Iterator<Entry<Integer,String>> entry = student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer,String> temp = entry.next();
			System.out.println("Key:"+temp.getKey() + "Value : "+temp.getValue());
			
		}
	}

}
