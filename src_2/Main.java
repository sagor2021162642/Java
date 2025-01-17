class Main {

	public static void main(String[] args) {

		{

			Employee obj = new Employee();

			try

			{

				obj.setSalary(-50);

			}

			catch (InvalidSalaryException ex)

			{

				System.out.println("exception found");

				System.out.println(ex.getMessage());

			}

			try

			{

				obj.setName("Max");

			}

			catch (IllegalArgumentException ex)

			{

				System.out.println("exception found");

				System.out.println(ex.getMessage());

			}

			
		}
		
	}
}