import java.util.Scanner;

class Product2{
    int pcode;
    String pname;
    double price;

    /*
     * Default Constructor
     * Initializes data members with default values.
     */
    Product2() {
        pcode = 0;
        pname = "Not Entered";
        price = 0.0;
    }

    /*
     * Parameterized Constructor (2 parameters)
     * Initializes product code and product name.
     * Price is set later.
     */
    Product2(int pcode, String pname) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = 0.0;
    }

    /*
     * Parameterized Constructor (3 parameters)
     * Initializes all data members.
     */
    Product2(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    /*
     * Method to display product details
     */
    void display() {
        System.out.println("Product Code : " + pcode);
        System.out.println("Product Name : " + pname);
        System.out.println("Price        : " + price);
        System.out.println();
    }

    /*
     * Main method
     * Accepts user input, creates objects,
     * displays all products, and finds the product
     * with the lowest price.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Product 1 using Default Constructor --------
        Product2 p1 = new Product2();
        System.out.println("Enter details for Product 1:");
        System.out.print("Enter Product Code: ");
        p1.pcode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        p1.pname = sc.nextLine();
        System.out.print("Enter Price: ");
        p1.price = sc.nextDouble();

        // -------- Product 2 using 2-Parameter Constructor --------
        System.out.println("\nEnter details for Product 2:");
        System.out.print("Enter Product Code: ");
        int c2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String n2 = sc.nextLine();
        System.out.print("Enter Price: ");
        double pr2 = sc.nextDouble();
        Product2 p2 = new Product2(c2, n2);
        p2.price = pr2;

        // -------- Product 3 using 3-Parameter Constructor --------
        System.out.println("\nEnter details for Product 3:");
        System.out.print("Enter Product Code: ");
        int c3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String n3 = sc.nextLine();
        System.out.print("Enter Price: ");
        double pr3 = sc.nextDouble();
        Product2 p3 = new Product2(c3, n3, pr3);

        // -------- Display All Products --------
        System.out.println("\n--- Product Details ---");
        p1.display();
        p2.display();
        p3.display();

        // -------- Find Product with Lowest Price --------
        Product2 lowest = p1;

        if (p2.price < lowest.price)
            lowest = p2;
        if (p3.price < lowest.price)
            lowest = p3;

        // -------- Display Lowest Price Product --------
        System.out.println("Product with Lowest Price:");
        lowest.display();

        sc.close();
    }
}
