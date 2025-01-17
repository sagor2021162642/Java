
public class Main {

	public static void main(String[] args) {
		
   Patient obj=new Patient("nsu", 10);
   System.out.println(obj.getName()+" "+obj.getAge());
   
   try {
	obj.setName("IUB");
	obj.setAge(1);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   System.out.println(obj.getName()+" "+obj.getAge());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Example obj=new Example();
		
	
			try {
				obj.ageInput();
			} catch (InvalidAgeException e) {
				
				e.printStackTrace();
			}
			
		
		
		
		
		
		
		
		
		
		try {
			int num=100/0;
			String name=null;
			System.out.println(name.length());
			
			int arr[]= {1,2};
			System.out.println(arr[3]);
			
		}catch(ArithmeticException obj) {
			obj.printStackTrace();
		}catch(NullPointerException obj) {
			obj.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
		}
		
		
		
		System.out.println("\nProgram end");*/
		

	}

}
