import java.util.*;
class GFG {
    public static void main(String[] args)
    {
        
        int[] arr;
 

        arr = new int[5];
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
 
        Scanner sc=new Scanner(System.in);
       
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
        }
        System.out.println("enter element");
        int x=sc.nextInt();
        int position=-1;
        for (int i = 0; i < arr.length; i++)
        {
        	if(x==arr[i])
        	{
        		position=i;
        	}

        }
        if(position==-1)
        {
        	System.out.println("element not found");
        }
        else
        {
        	System.out.println("Element at index " + position
                    + " : " + arr[position]);
        	
        }
        
    }
}