import java.util.*;

// User-defined exception class for insufficient balance
class InsufficientBalanceException extends Exception
{
    // Constructor to pass custom error message
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}

// Main class
class Main3
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

            // Check if withdrawal amount is greater than balance
            if(w > balance)
            {
                // Throw user-defined exception
                throw new InsufficientBalanceException("Sorry! You do not have sufficient bank balance");
            }
            else
            {
                // Perform withdrawal
                balance = balance - w;

                // Display remaining balance
                System.out.println("Remaining balance for the account "+ accno + " = " + balance);
            }
        }
        catch(InsufficientBalanceException e)
        {
            // Handle user-defined exception
            System.out.println("Exception: " + e.getMessage());
        }

        // Close scanner
        sc.close();
    }
}