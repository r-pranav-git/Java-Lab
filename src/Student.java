import java.util.*;
class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Details");
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the roll number:");
		int roll_no=sc.nextInt();
		int[] a=new int[5];
		System.out.println("Enter the marks of 5 subjects:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<5;i++)
		{
			total=total+a[i];
		}
		float avg=total/5;
		float p=total/500.0f*100;
		System.out.println("Total marks="+total);
		System.out.println("Average marks="+avg);
		System.out.println("Percentage="+p);
	}
}