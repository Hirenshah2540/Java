import java.util.Scanner;

public class Max {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in); 
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		  int Max=(a>b)?a:b;
		  System.out.println("max number is "+Max);
		   
	}

}
