//if we create final method,we can't override the method.
//if we want our class is not extended/inheritance by other class so we create final class.
 class Demo
{
	 void m1()
	{
		System.out.println("this is Demo class Method");
	}
}


public class Final_Method extends Demo  //show error after declare class as final class.
{


	 void m1() //show error after declare method as final method. 
	{
		System.out.println("this is Final class Method");
	}
	public static void main(String[] args)
	{
          System.out.println("this is valid code");
	}

}
