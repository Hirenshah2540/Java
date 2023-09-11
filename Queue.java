package collection_Examples;
import java.util.*;
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PriorityQueue <Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        numbers.add(0);
        numbers.add(45);
       
        System.out.println("PriorityQueue: " + numbers);

       // Using the offer() method
        numbers.offer(1);
        numbers.offer(0);
        numbers.offer(11);
        System.out.println("Updated PriorityQueue: " + numbers);
       
        
     // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);
        
   // Using the remove() method
        boolean result = numbers.remove(4);
        System.out.println("Updated PriorityQueue: " + numbers);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number1 = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number1);
        int number2 = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number2);
        System.out.println("Updated PriorityQueue: " + numbers);
	}

}

