
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        box obj1=new box();
        box obj2=new box();
        obj1.height=1;
        obj1.length=2;
        obj1.width=1;
        obj2=obj1;
        System.out.println(obj2.height);
        
	}

}
