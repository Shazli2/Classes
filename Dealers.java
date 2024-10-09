import java.util.ArrayList;
import java.util.Scanner;
/* Create Dealers class and store Dealer arraylist  in it.
 also there should be dealersMenu() function to run program
When I run program I should see an options to see existing dealers or create new dealers.
 in the Dealer class we already have menu function so
 when I select existing dealer I need to go in that dealer
 and work on with that menu. if I exit O should be able to return
  main Dealers class menu and able to select from
  the menu again existing dealers create new dealer.
*/
public class Dealers {
    private ArrayList<Dealer> dealerList;

    public Dealers() {
        this.dealerList = new ArrayList<>();
    }
    // Function to show the main menu for Dealers
    public void dealersMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nDealers Menu:");
            System.out.println("1. View existing dealers");
            System.out.println("2. Create new dealer");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    viewExistingDealers();
                    break;
                case 2:
                    createNewDealer();
                    break;
                case 3:
                    System.out.println("Exiting Dealers Menu.");
                    return;  // Exit the method and stop the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // Function to view existing dealers
    private void viewExistingDealers() {
        if (dealerList.isEmpty()) {
            System.out.println("No dealers available.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nList of Dealers:");
        for (int i = 0; i < dealerList.size(); i++) {
            System.out.println((i + 1) + ". " + dealerList.get(i).getName()); // Assuming Dealer has a getName() method
        }
        System.out.print("Select a dealer by number to manage or enter 0 to return to the main menu: ");
        int dealerChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        if (dealerChoice > 0 && dealerChoice <= dealerList.size()) {
            Dealer selectedDealer = dealerList.get(dealerChoice - 1);
            selectedDealer.menu();  // Enter the selected dealer's menu
        } else if (dealerChoice == 0) {
            return;  // Return to the main menu
        } else {
            System.out.println("Invalid selection. Returning to the main menu.");
        }
    }
    // Function to create a new dealer
    private void createNewDealer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new dealer name: ");
        String name = scanner.nextLine();
        Dealer newDealer = new Dealer(name);  // Assuming Dealer has a constructor that takes a name
        dealerList.add(newDealer);
        System.out.println("Dealer '" + name + "' created successfully.");
    }
    public static void main(String[] args) {
        Dealers dealers = new Dealers();
        dealers.dealersMenu();
    }
}
