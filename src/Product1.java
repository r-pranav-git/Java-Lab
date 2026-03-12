import java.util.Scanner;

/*
 Class Name : Product
 Description: This class represents a product with product code, product name, and price. It demonstrates constructor overloading.
*/

class Product
{

    // Data members
    int pcode;
    String pname;
    double price;

    // Default Constructor
    Product() 
    {
        pcode = 0;
        pname = "Not Entered";
        price = 0.0;
    }

    // Parameterized Constructor (2 parameters)
    Product(int pcode, String pname) 
    {
        this.pcode = pcode;
        this.pname = pname;
        this.price = 0.0;
    }

    // Parameterized Constructor (3 parameters)
    Product(int pcode, String pname, double price) 
    {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() 
    {
        System.out.println("Product Code : " + pcode);
        System.out.println("Product Name : " + pname);
        System.out.println("Price        : " + price);
        System.out.println();
    }
}

/*
 Class Name : Product1
 Description: This class contains the main method.
*/

class Product1 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // Product 1 using Default Constructor
        Product p1 = new Product();

        System.out.println("Enter details for Product 1:");

        System.out.print("Enter Product Code: ");
        p1.pcode = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p1.pname = sc.nextLine();

        System.out.print("Enter Price: ");
        p1.price = sc.nextDouble();

        // Product 2 using 2-parameter constructor
        System.out.println("\nEnter details for Product 2:");

        System.out.print("Enter Product Code: ");
        int c2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String n2 = sc.nextLine();

        System.out.print("Enter Price: ");
        double pr2 = sc.nextDouble();

        Product p2 = new Product(c2, n2);
        p2.price = pr2;

        // Product 3 using 3-parameter constructor
        System.out.println("\nEnter details for Product 3:");

        System.out.print("Enter Product Code: ");
        int c3 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String n3 = sc.nextLine();

        System.out.print("Enter Price: ");
        double pr3 = sc.nextDouble();

        Product p3 = new Product(c3, n3, pr3);

        // Display all products
        System.out.println("\n--- Product Details ---");

        p1.display();
        p2.display();
        p3.display();

        // Find lowest price product
        Product lowest = p1;

        if (p2.price < lowest.price)
            lowest = p2;

        if (p3.price < lowest.price)
            lowest = p3;

        // Display lowest price product
        System.out.println("Product with Lowest Price:");
        lowest.display();

        sc.close();
    }
}
