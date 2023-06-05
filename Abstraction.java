
public abstract class Abstraction {

	String name;
	int age;
	String Sound="nothing";
	abstract void makeSound();
	
	void show()
	{
		System.out.println(Sound);
	}
	
	public static void main(String[] args) {
	
		Abstraction a;
		a=new Dog();
		a=new Cat();
		a.makeSound();
		a.show();

	}

}
