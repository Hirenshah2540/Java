
public class Dog extends Abstraction {

	String Dog_Sound="woof woof";
 	@Override
	void makeSound()
	{
		System.out.println("Sound made by Dog :-");
		super.Sound=Dog_Sound;
		
	}
}
