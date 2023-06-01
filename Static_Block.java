//static block execute before main method.
//static block executed when class is loaded into memory.
//static block used to initialize static member.
//if you want code executed when the class is loaded then you write code in static block.
public class Static_Block {
	static int a;
	static
	{
		int a=10;
		System.out.println("hello");
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		System.out.println("hii I am hiren");
	}
	static
	{
		System.out.println("How are you");
	}

}
