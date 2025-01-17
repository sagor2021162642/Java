
public class Example {
	
	
	public  void ageInput() throws InvalidAgeException{
		
		int age=10;
		
		if(age<18) {
			throw new InvalidAgeException("Age can't be less than 18");
		}
		
	}

}
