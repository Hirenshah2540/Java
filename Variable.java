
public class Variable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=getSum(1,2,3,4,5);
		System.out.println(a);

	}
		public static int getSum(int... n)
	{
			int sum = 0;
			for (int no : n)
				sum += no;
			
			return sum;
	}
	

}
