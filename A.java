//program  for ArrayList 

import java.util.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> Name=new ArrayList <String>();
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		
		Name.add("raj");
		Name.add("Hiren");
		Name.add("Nishit");
		Name.add("Drasti");
		
		System.out.println(Name);
		
		Iterator<String> a1 = Name.iterator();
		while(a1.hasNext()) {
			System.out.println(a1.next());
		}
		
		Iterator<Integer> a2=a.iterator();
		while(a2.hasNext())
				{
			System.out.println(a2.next());
				}
		//lembda function
		a.forEach(K -> System.out.println(K));
				
	}

}
