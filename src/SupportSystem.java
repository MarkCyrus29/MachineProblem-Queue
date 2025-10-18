import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupportSystem {
  public static void main(String[] args) {
    Queue<Ticket> tickets = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the IT Support Ticketing System!\n");
    System.out.print("--- Enter Ticket Details ---");

    for (int i = 0; i < 3; i++){
      System.out.println("\nPlease enter details for ticket " + (i + 1) + " of 3.");
      System.out.print("Enter your name: ");
      String userName = sc.nextLine();
      System.out.print("Describe your issue: ");
      String issueDescription = sc.nextLine();

      Ticket ticket = new Ticket(userName, issueDescription);
      tickets.offer(ticket);
    }
    sc.close();

    System.out.println("-------------------------------------------");
    System.out.println("All tickets have been logged.");
    System.out.println("There are " + tickets.size() + " tickets waiting in the queue.");
    System.out.println("-------------------------------------------\n");

    System.out.println("--- Processing Tickets ---");
    for (int i = 0; i < 2; i++){
      System.out.println("Resolving: " + tickets.peek());
      tickets.poll();
    }

    System.out.println("-------------------------------------------\n");
    System.out.println("All done for now.");
    System.out.println("Remaining tickets in queue: "+ tickets);
  }
}
