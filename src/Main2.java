import java.util.Scanner;

// Interface for Loan 
interface Loan
{
    // Method to calculate EMI based on principal, rate, and duration
    double calculateEMI(double P, double R, int N);
}

// Interface for Insurance 
interface Insurance
{
    // Method to calculate insurance premium 
    double calculatePremium(double price, double rate);
}

// Vehicle class implementing both Loan and Insurance interfaces
class Vehicle implements Loan, Insurance
{
    String vehicleNumber;
    String brand;
    double price;

    // Method to input vehicle details 
    void addVehicle(Scanner sc)
    {
        sc.nextLine(); 

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = sc.nextLine();

        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Vehicle Price: ");
        price = sc.nextDouble();
    }

    // Overridden method to calculate EMI 
    public double calculateEMI(double P, double R, int N)
    {
        R = R / (12 * 100);   // Convert annual rate to monthly rate
        N = N * 12;           // Convert years to months

        double emi = (P * R * Math.pow(1 + R, N)) /(Math.pow(1 + R, N) - 1);
        //Math class in the java.lang package,automatically imported

        return emi;
    }

    // Overridden method to calculate insurance premium
    public double calculatePremium(double price, double rate)
    {
        return price * rate / 100;
    }

    // Method to display vehicle details
    void displayVehicle()
    {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Main class containing menu-driven program
public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();
        int choice;

        // Menu-driven loop
        do
        {
            System.out.println("\n1. Add Vehicle");
            System.out.println("2. Calculate EMI");
            System.out.println("3. Calculate Insurance");
            System.out.println("4. Display Vehicle");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    v.addVehicle(sc);
                    break;

                case 2:
                    System.out.print("Enter Principal Amount (P): ");
                    double P = sc.nextDouble();

                    System.out.print("Enter Annual Interest Rate (%): ");
                    double R = sc.nextDouble();

                    System.out.print("Enter Duration (Years): ");
                    int N = sc.nextInt();

                    System.out.println("Monthly EMI = " + v.calculateEMI(P, R, N));
                    break;

                case 3:
                    System.out.print("Enter Insurance Rate (%): ");
                    double rate = sc.nextDouble();

                    double premium = v.calculatePremium(v.price, rate);
                    System.out.println("Insurance Premium = " + premium);
                    break;

                case 4:
                    v.displayVehicle();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);

        sc.close();
    }
}