// Program to demonstrate inheritance using Employee and Teacher classes and display details of N teachers using array of objects.

import java.util.*;

// Base class
class Employee
{

    // Data members of Employee
    int empId;
    String name;
    double salary;
    String address;

    // Parameterized constructor 
    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Derived class Teacher inherits Employee
class Teacher extends Employee 
{

    // Additional data members of Teacher
    String department;
    String[] subjects;

    // Constructor for Teacher class
    Teacher(int empId, String name, double salary, String address,String department, String[] subjects)
    {

        super(empId, name, salary, address); // initialize parent class data using super keyword
        this.department = department;
        this.subjects = subjects;
    }

    // Method to display teacher details
    void displayData()
    {

        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);

        System.out.println("Subjects taught:");
        
        // Loop to display all subjects
        for (int i = 0; i < subjects.length; i++)
        {
            System.out.println(subjects[i]);
        }
    }
}

// Main class
public class Employee2
{

    public static void main(String[] args)
    {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read number of teachers
        System.out.println("Enter number of teachers:");
        int m = sc.nextInt();
        sc.nextLine(); 

        // Create array of Teacher objects
        Teacher[] teachers = new Teacher[m];

        // Loop to read teacher details
        for (int i = 0; i < m; i++)
        {
        	System.out.println();
        	System.out.println("Enter details of "+(i+1)+" th teacher:");
        	System.out.println("Enter Employee ID:");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Address:");
            String address = sc.nextLine();

            System.out.println("Enter Department:");
            String department = sc.nextLine();

            System.out.println("Enter number of subjects:");
            int n = sc.nextInt();
            sc.nextLine();

            // Create subject array
            String[] subjects = new String[n];

            System.out.println("Enter subjects:");

            // Read subjects
            for (int j = 0; j < n; j++) {
                subjects[j] = sc.nextLine();
            }

            // Create Teacher object and store in array
            teachers[i] = new Teacher(empId, name, salary, address, department, subjects);
        }

        // Display teacher details
        System.out.println("\nDetails of Teachers:");

        for (int i = 0; i < m; i++)
        {
            teachers[i].displayData();
            System.out.println();
        }

        sc.close(); // close scanner
    }
}
