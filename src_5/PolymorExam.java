
public class PolymorExam {
	
	//Overloading
	//no of paramater
	//different data type
	public void sum(int num1,int num2) {
		
		System.out.println(num1+num2);
	}
	
	public void sum(int num1,int num2,int num3) {
	
		System.out.println(num1+num2+num3);
	}
	
	public void sum(int num1,double num2) {
		System.out.println(num1+num2);
	}
	
	
	//overriding
	
	public void calculate(int num1,int num2) {
		System.out.println(num1-num2);
	}
	
	

}
