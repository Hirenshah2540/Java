import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.print("enter number"+n+"element are");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]+"");
        }
        
        sc.close();
       
	}

}
