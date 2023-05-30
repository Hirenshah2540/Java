import java.util.Scanner;

public class Mark {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		System.out.println("Enter Mark of Maths : ");
		int Maths = sc.nextInt();
		System.out.println("Enter Mark of Physics : ");
		int Physics = sc.nextInt(); 
		System.out.println("Enter Mark of Data Science : ");
		int Datascience =sc.nextInt();
		System.out.println("Enter Mark of DBMS: ");
		int DBMS = sc.nextInt();
		float Avg=(Maths+Physics+Datascience+DBMS)/4;
		System.out.println("Average Mark "+Avg);
		if(Avg>90)
		{
			System.out.println("Grade-A");
		}
		else if(Avg>80 && Avg<=90)
		{
			System.out.println("Grade-B");
		}
		else if(Avg>70 && Avg<=80)
		{
			System.out.println("Grade-c");
		}
		else if(Avg>60 && Avg<=70)
		{
			System.out.println("Grade-D");
		}
		else
		{
			System.out.println("You are FAIL");
		}
		
	}

}
