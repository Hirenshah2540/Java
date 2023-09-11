import java.util.Scanner;

public class Test1 {  
    public static void main(String[] args) {  
  
        int [] a = new int [] {25, 11, 7, 75, 56};  
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        for (int i = 0; i < a.length; i++)
        {  
               a[i]=sc.nextInt();
                   
        }  
        int max = a[0];  
        for (int i = 0; i < a.length; i++)
        {  
 
           if(a[i] > max)  
               max = a[i];  
        }  
        System.out.println("Largest element " + max);  
        sc.close();
    }  
}  
