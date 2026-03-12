import java.util.*;
class Area
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth=sc.nextInt();
		System.out.println("Enter the radius of the circle");
		float r=sc.nextFloat();
		int a1=length*breadth;
		int p1=2*(length+breadth);
		System.out.println("Area of rectangle="+a1);
		System.out.println("Perimeter of rectangle="+p1);
		float a2=3.14f*r*r;
		System.out.println("Area of circle="+a2);
		float circ=2*3.14f*r;
		System.out.println("Circumference of circle="+circ);
	}
}