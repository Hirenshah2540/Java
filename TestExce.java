
public class TestExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      int a,b;
      a = 12;
      b=0;
      System.out.println(a/b);
		}catch(ArithmeticException ar) {
			System.out.println("Arithmetic " + ar.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Number can not be" +  e.getMessage());
		}
		finally
		{
			
			System.out.println("This is finally ");
		}
	}
		

}