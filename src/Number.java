import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+"is a positive number");
		}
		else if(n<0)
		{
			System.out.println(n+"is a negative number");
		}
		else
		{
			System.out.println(n+"is zero");
		}
		if(n%2==0)
		{
			System.out.println(n+"is an even number");
		}
		else
		{
			System.out.println(n+"is an odd number");
		}
		if(n%5==0 && n%11==0)
		{
			System.out.println(n+"is divisible by both 5 and 11");
		}
		else
		{
			System.out.println(n+"is not divisible by both 5 and 11");
		}
	}
}