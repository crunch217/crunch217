import java.util.Hashtable;
import java.util.Vector;

// Java program to demonstrate
// why collection framework was needed
public class Collection1 {

	public static void main(String[] args) {
		int arr[]  = new int[] {1,2,3,4};
		Vector<Integer>v= new Vector();
		Hashtable<Integer, String>h= new Hashtable();
		
		//add element in vector
		v.addElement(10);
		v.addElement(20);
		
		// Adding the element into the
        // hashtable
        h.put(1, "Miracle");
        h.put(2, "Coming");
        
        
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
		

	}

}
