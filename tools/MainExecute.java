import General.employee;
import Marketing.sales;
import java.util.Scanner;

class MainExecute
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee id and employee name: ");
        int id = sc.nextInt();
        String name = sc.next();
        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        sales s1 = sales(id, name, basic);

        double totalEarning = s1.earnings() + s1.tallowance();

        System.out.println("The emp id of the employee is " + id);
        System.out.println("The total earning is " + totalEarning);
    }
}