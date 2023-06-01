//we can declare static to only class level variable.
//we can't declare static to local variable. 
//all object access the static variable value.
public class Static_Variable {

	
	String name;
	int age;
	static String branch="IT";
	public Static_Variable(String n,int a)
	{
		
		this.name=n;
		this.age=a;
		
	}
	public void display()
	{
		System.out.println("name:"+name+"\n"+"age:"+age+"\n"+"branch:"+branch);
		
	}
	public static void main(String[] args)
	{
		Static_Variable a1=new Static_Variable("hiren",20);
		Static_Variable a2=new Static_Variable("Raj",25);
		a1.display();
		a2.display();

	}

}
