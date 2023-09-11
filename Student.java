
public class Student {
	private int No;
	private String Email;
	
	public int getNo() 
	{
		return No;
	}
	public void setNo(int no) 
	{
		No = no;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String email) 
	{
		Email = email;
	}
	@Override
	public String toString() {
		return "Student [No=" + No + ", Email=" + Email + "]";
	}
	
	

}
