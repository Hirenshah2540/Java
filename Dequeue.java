package collection_Examples;
import java.util.*;
public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> A= new ArrayDeque<Integer>(5);

        // Using add()
        A.addLast(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.offer(8);
        A.addFirst(6);
        
        
        System.out.println("ArrayDeque: " + A);
     // Get the first element
        int firstElement = A.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        int lastElement = A.getLast();
        System.out.println("Last Element: " + lastElement);
        
        
    

        System.out.print("\nArrayDeque in reverse order: ");
     
        Iterator<Integer> desIterate = A.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
	
	}
	

}

