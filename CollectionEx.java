//create array list of 10 numbers and print it in the descending order
import java.util.*;

public class CollectionEx {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList <Integer> A = new ArrayList<Integer>(10);
		A.add(100);
		A.add(10);
		A.add(60);
		A.add(71);
		A.add(14);
		A.add(13);
		A.add(17);
		A.add(15);
		A.add(1);
		A.add(78);
		System.out.println(A);
		
		System.out.println("----Sort-----");
		Collections.sort(A);
		Collections.reverse(A);
		System.out.println(A);
		
		System.out.println("----Descending-----");
		Collections.sort(A, Collections.reverseOrder());
		System.out.println(A);
	    

     }
}
