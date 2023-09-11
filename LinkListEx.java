import java.util.*;

public class LinkListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> b1=new LinkedList <String>();
		b1.add("H");
		b1.add("i");
		b1.add("r");
		b1.add("e");
		b1.add("n");
		System.out.println(b1);
		b1.add(2, "A");
		System.out.println(b1);
		
		b1.forEach(a -> System.out.println(a));
	}

}
