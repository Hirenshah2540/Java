import java.util.Scanner;

public class Even {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in); 
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		int i=1;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				i++;
			}
		}
	}

}
