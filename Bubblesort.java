

public class Bubblesort {

	 static void bubbleSort(int[] a) 
	 {  
	        int n = a.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++)
	         {  
	                 for(int j=1; j < (n-i); j++)
	                 {  
	                          if(a[j-1] > a[j])
	                          {  
	                                 temp = a[j-1];  
	                                 a[j-1] = a[j];  
	                                 a[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	  }  
	public static void main(String[] args)
	{  
        int a[] ={13,60,15,2,45,34,5};  
        System.out.println("UnSorted Array");
        for(int i=0; i < a.length; i++)
        {  
                System.out.print(a[i] + " ");  
        
        }
        bubbleSort(a); 
        
        System.out.println("\nSorted Array");  
        for(int i=0; i < a.length; i++)
        {  
                System.out.print(a[i] + " ");  
        
        }
	
	}
}

