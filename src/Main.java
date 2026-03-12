//Java program to demonstrate multilevel inheritance using library details,without using method overriding

import java.util.Scanner;
import java.time.LocalDate;
//Creating the class Library
class Library
{
	String libraryName,location;
	Library(String libraryName,String location)
	{
		this.libraryName=libraryName;
		this.location=location;
	}
	void displayLibrary()
	{
		System.out.println("Library Name:"+libraryName);
		System.out.println("location:"+location);
	}
}
class Book extends Library
{
	int bookId;
	String title,author;
	Book(String libraryName,String location,int bookId,String title,String author)
	{
		super(libraryName,location);
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	void displayBook()
	{
		displayLibrary();
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
	}
}
class Issue extends Book
{
	String studentName;
	LocalDate issueDate;
	Issue(String libraryName,String location,int bookId,String title,String author,String studentName,LocalDate issueDate)
	{
		super(libraryName,location,bookId,title,author);
		this.studentName=studentName;
		this.issueDate=issueDate;
	}
	void displayIssue()
	{
		System.out.println("The details of the Issued book are:-");
		displayBook();
		System.out.println("Student Name:"+studentName);
		System.out.println("Issue Date:"+issueDate);
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the library name:");
		String libraryName=sc.nextLine();
		System.out.println("Enter the location:");
		String location=sc.nextLine();
		System.out.println("Enter the Book Id:");
		int bookId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the title:");
		String title=sc.nextLine();
		System.out.println("Enter the author:");
		String author=sc.nextLine();
		System.out.println("Enter the Student Name:");
		String studentName=sc.nextLine();
		LocalDate issueDate=LocalDate.now();
		Issue i=new Issue(libraryName,location,bookId,title,author,studentName,issueDate);
		i.displayIssue();
		
		
	}
}