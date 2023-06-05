
public class Cat extends Abstraction {

	String Cat_Sound="meow meow";
   	@Override
	void makeSound()
	{
   		System.out.println("Sound made by Cat :-");
	    super.Sound=Cat_Sound;
	}
}
