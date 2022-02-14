import java.util.ArrayList;

public class ArrListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>al= new ArrayList();
		// Appending new elements at
        // the end of the list
		for(int i=0;i<=5;i++)
			al.add(i);
		
		System.out.println(al);
		
		//remove element
		al.remove(3);
		System.out.println(al);
		
		System.out.println(al);
		
		for(int i=0 ;i<al.size();i++)
			 System.out.print(al.get(i) + " ");
		
		
				

	}

}
