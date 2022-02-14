import java.util.LinkedList;

public class Linlistdemo {

	public static void main(String[] args) {
		
		LinkedList<Integer>ll=new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++)
            ll.add(i);
		
		System.out.println(ll);
		  
        // Remove element at index 3
        ll.remove(3);
  
        // Displaying the List
        // after deletion
        System.out.println(ll);
  
        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
      
		

	}

}
