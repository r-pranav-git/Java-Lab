import java.util.Scanner;

/*
 Class Name : Employe
 Description: Represents an Employe with Employe number, name, and salary.
 */
class Employe 
{

    // Data members
    int eNo;
    String eName;
    double eSalary;

    // Method to read Employe details
    void readData(Scanner sc) 
    {
        System.out.print("Enter Employe Number: ");
        eNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employe Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Employe Salary: ");
        eSalary = sc.nextDouble();
    }

    // Method to display Employe details
    void displayData()
    {
        System.out.println("Employe Number : " + eNo);
        System.out.println("Employe Name   : " + eName);
        System.out.println("Employe Salary : " + eSalary);
        System.out.println();
    }
}

/*
 * Class Name : Employe1
 * Description: Contains the main method.
 */
class Employe1 
{

    public static void main(String[] args)
    {

        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Employes: ");
        int n = sc.nextInt();

        // Array of Employe objects
        Employe[] emp = new Employe[n];

        // Read Employe details
        for (i = 0; i < n; i++)
        {
            System.out.println("\nEnter details of Employe " + (i + 1) + ":");
            emp[i] = new Employe();
            emp[i].readData(sc);
        }

        // Search Employe by Employe number
        System.out.print("\nEnter Employe Number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (i = 0; i < n; i++) 
        {
            if (emp[i].eNo == searchNo) 
            {
                found = true;
                break;
            }
        }

        if (found) 
        {
            System.out.println("\nEmploye Found:");
            emp[i].displayData();
        } 
        else 
        {
            System.out.println("\nEmploye with Employe Number "+ searchNo + " not found.");
        }

        sc.close();
    }
}
