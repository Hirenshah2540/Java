
public class Test_interface implements function_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Test_interface ti = new Test_interface();
        String m=   ti.getMsg();
        System.out.println(m);
	}
	@Override
	public String getMsg() {
		return "hello";
	}

}