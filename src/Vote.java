import java.util.*;
class Vote
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the attendance percentage:");
		float p=sc.nextFloat();
		System.out.println("Enetr the internal marks");
		int marks=sc.nextInt();
		if(age>=18)
		{
			System.out.println("The person is eligible to vote");
		}
		else
		{
			System.out.println("The person is not eligible to vote");

		}
		if(p>=75 && marks>=40)
		{
			System.out.println("The person is eligible to write the exam");

		}
		else
		{
			System.out.println("The person is not  eligible to write the exam");

		}

	}
}