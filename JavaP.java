
public class JavaP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k>(2*i);k--)
			{
				if(k>1 && k<(2*i)-1)
				{
					System.out.print(" ");
					
				}
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}

}
