//Linked hash
package collection_Examples;
import java.util.*;

public class Link {

	public static void main(String[] args) {
		
		LinkedHashSet<String> S=new LinkedHashSet<>();
		S.add("Hiii");
		S.add("Hello");
		S.add("I am fine");
		S.add("How are you?");
		S.add("No");
		Iterator<String>  i1 =  S.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}