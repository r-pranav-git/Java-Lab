import java.util.*;

// Class representing the ticket booking system
class TicketBooking 
{
    int tickets;   // Total available tickets

    // Constructor to initialize tickets
    TicketBooking(int n) 
    {
        this.tickets = n;
    }

    // Synchronized method to ensure only one thread(customer) books at a time
    synchronized void bookTicket(int num) 
    {
        if (tickets >= num && num > 0) 
        {
            System.out.println(Thread.currentThread().getName() + " booking successful");
            tickets = tickets - num;
            System.out.println("Remaining number of tickets: " + tickets);
        } 
        else
        {
            System.out.println(Thread.currentThread().getName() + " booking failed (Insufficient tickets)");
        }
    }
}

// Thread class representing a customer
class Customer extends Thread 
{
    int n;                 // Number of tickets requested
    TicketBooking tb;      // Shared booking object

    // Constructor to initialize customer details
    Customer(int n, TicketBooking tb, String name)
    {
        super(name);       // Assign thread name
        this.n = n;
        this.tb = tb;
    }

    // Thread execution
    public void run() 
    {
        tb.bookTicket(n);
    }
}

// Main class
class Main5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of tickets:");
        int n = sc.nextInt();

        TicketBooking tb = new TicketBooking(n);  // Shared object

        System.out.println("Enter the number of tickets for Customer 1:");
        int t1 = sc.nextInt();

        System.out.println("Enter the number of tickets for Customer 2:");
        int t2 = sc.nextInt();

        // Creating customer threads
        Customer c1 = new Customer(t1, tb, "Customer-1");
        Customer c2 = new Customer(t2, tb, "Customer-2");

        // Starting threads
        c1.start();
        c2.start();

        sc.close();
    }
}