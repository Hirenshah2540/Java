import Method_cal.*;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiplication
        Multiply n=new Multiply();
        int Mul=n.to_Mul(20, 10);
        System.out.println("Mul :"+Mul);
        
        //Addition
        Addition n1=new Addition();
        int Add=n1.to_Add(10,8);
        System.out.println("Add :"+Add);
        
        //Substitution
        Sub n2=new Sub();
        int Sub=n2.to_Sub(10,5);
        System.out.println("Sub :"+Sub);
        
        //division
        Div n3=new Div();
        float Div=n3.to_Div(12,5);
        System.out.println("Div :"+Div);
	}

}
