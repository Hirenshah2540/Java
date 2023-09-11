import java.util.*;
public class ArrayListString {

	public static void main(String[] args) 
	{
		
		ArrayList<String> S=new ArrayList<String>();
		S.add("Hiren");
		S.add("Raj");
	    S.add("ramesh");
		S.add("e");
		S.add("n");
		//S.forEach(K -> System.out.println(K));
		 System.out.println("---------");
		 String A= FirstElement(S);
		 System.out.println("Ans :-"+A);
	}
	public static  String FirstElement(ArrayList <String> S)
	{
		String empty=" ";
		if(S==null || S.isEmpty())
		{
			System.out.println(empty);
		}
		
		return S.get(0);
			
    
    }

}
