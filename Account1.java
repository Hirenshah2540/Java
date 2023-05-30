import java.util.Scanner;

public class Account1{
    private static Scanner sc;

	public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	System.out.println("Enter initial Amount");
        Account A = new Account(sc.nextInt()); 
        A.deposite(5000);
        A.withdraw(4500); 
        double newBalance = A.getBalance();

        if(newBalance >= 1000)
        {

            System.out.println(newBalance);
        }
    }
}