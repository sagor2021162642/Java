
public class Patient {
	
	private String name;
	private int age;
	public Patient(String name, int age){
		
		this.name = name;
		this.age = age;
		
		//setName(name);
		//setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws InvalidNameException {
		
		if(name.length()<3) {
			throw new InvalidNameException("Name should be greater than 3");
		}else {
			this.name = name;
		}
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws IllegalArgumentException {
		
		if(age<0) {
			throw new IllegalArgumentException("age can't be negative");
		}else {
			this.age = age;
		}
		
	}
	
	

}
