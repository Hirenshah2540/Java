//static method belong to class not to object.
//static method only access static data.
//for other class static method is accessed using classsname.methodname().
//within class it is accessed simply by static method name.
//static method can't refer "this" and "super" keyword.
//in this no need of creating object.
public class Static_Method {
    static int count=0;
	public  static void show()
	{
		count=count+10;
		System.out.print(count+"\n");
		//System.out.print(this.count);
		
	}
	public static void main(String[] args) {
          show();
          Method.display();
	}

}
class Method
{
	public static void  display()
	{
		System.out.print("This is time to show");
	}
}