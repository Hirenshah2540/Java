import java.util.*;

public class MaxList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>(5);
		a.add(10);
		a.add(1020);
		a.add(130);
		a.add(420);
		a.add(35);
		System.out.println(a);
		a.forEach(K -> System.out.println(K));
		System.out.println("----MAX VALUE----");
		int Max = Max(a);
		System.out.println(Max);
	
	
	}
	public static  int Max(ArrayList <Integer> a)
	{  
		if (a == null || a.isEmpty()) {
            System.out.println("ArrayList is null or empty");
        }
		int i;
		int m=a.get(0);
		for(i=0;i<a.size();i++)
		{
			int vi=a.get(i);
			if(m < vi)
			{
				m=vi;
			}
			
		}
		return m;


    }
}

