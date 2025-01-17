
public class Employee {

	private String name;

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setSalary(int salary) throws InvalidSalaryException {

		if (salary<0) {

			throw new InvalidSalaryException ("Invalid Salary");

		}
	}

	public void setName(String name) throws IllegalArgumentException {

		if (name.length() < 4) {

			throw new IllegalArgumentException("Invalid Name ");

		}

	}

}
