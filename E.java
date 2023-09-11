
public class E {

	public static void main(String[] args) {
		
		try
		{
			throw new NullPointerException("hello");
		}
		catch(ArithmeticException ax)
		{
			System.out.println("B");
		}

	}

}
