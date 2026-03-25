import java.util.Scanner;
// Main class using ArithmeticException
class Main4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            // Input account details
            System.out.println("Enter your account number:");
            String accno = sc.nextLine();

            System.out.println("Enter your bank balance:");
            int balance = sc.nextInt();

            System.out.println("Enter amount to withdraw:");
            int w = sc.nextInt();
            // Check if withdrawal amount exceeds balance
            if(w > balance)
            {
                // Manually throwing ArithmeticException
                throw new ArithmeticException("Sorry! You do not have sufficient bank balance");
            }
            else
            {
                // Perform withdrawal
                balance = balance - w;

                // Display remaining balance
                System.out.println("Remaining balance for the account "+ accno + " = " + balance);
            }
        }
        catch(ArithmeticException e)
        {
            // Handling ArithmeticException
            System.out.println("Exception: " + e.getMessage());
        }
        // Close scanner
        sc.close();
    }
}