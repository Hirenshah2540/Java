import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        int total = 0;
        for (int i : a) 
        {
            total =total+ i;
        }

 
        System.out.println("Total of elements in the array: " + total);

       sc.close();
    }
}