import java.util.Scanner;
class employee
{
	protected int empid;
	private String empname;
	employee()
	{
		System.out.println("This is a employee class");
	}
	public double earning(double basic)
	{
		double total_salary = basic+(0.8*basic)+(0.15*basic);
		System.out.println("The total salary is : "+total_salary);
		return total_salary;
	}
}