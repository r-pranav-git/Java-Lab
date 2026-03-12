import java.util.*;
class Salary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Details");
		System.out.println("Enter Employee ID:");
		int empid=sc.nextInt();
		System.out.println("Enter basic salary:");
		int basic=sc.nextInt();
		System.out.println("Enter HRA");
		int hra=sc.nextInt();
		System.out.println("Enter DA");
		int da=sc.nextInt();
		int gross=basic+hra+da;
		System.out.println("Gross Salary="+gross);
		float pf=0.12f*basic;
		float deduct=gross-pf;
		System.out.println("Net salary after deduction="+deduct);
	}
}