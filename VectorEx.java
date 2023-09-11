package collection_Examples;
import java.util.*;


public class VectorEx {

	public static void main(String[] args) {
	
	     Vector<Integer>   numbers = new Vector<>(5);
	     
	     numbers.add(12);
	     numbers.add(2);
	     numbers.add(1);
	     numbers.add(20);
	     numbers.add(11);
	         
	        
	 	    Iterator<Integer>  i1 =  numbers.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
	        int i;
	        System.out.println("-----Even-----");
	        for(i=0;i<numbers.size();i++)
			{
	     
			   if(numbers.get(i)%2!=0)
			   {
				   System.out.println(numbers.get(i));
			   }	
			}
	        System.out.println("-----Odd-----");
	        for(i=0;i<numbers.size();i++)
			{
	     
			   if(numbers.get(i)%2==0)
			   {
				   System.out.println(numbers.get(i));
			   }	
			}
	       
}
}