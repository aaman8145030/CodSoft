import java.util.Scanner;
public class Atm{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the ATM.");

        // Get the user's account number
        System.out.print("Please enter your account number: ");
        int accountNumber = scanner.nextInt();

        // Get the user's PIN
        System.out.print("Please enter your PIN: ");
        int pin = scanner.nextInt();

        // Validate the user's credentials
        if (accountNumber == 12345 && pin == 123) {
            // Display the main menu
            System.out.println("Main Menu");
            System.out.println("1. Withdraw cash");
            System.out.println("2. Deposit cash");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // Withdraw cash
                    System.out.print("How much cash would you like to withdraw? ");
                    int amount = scanner.nextInt();

                    // Check if the user has enough money in their account
                    if (amount <= 1000) {
                        // Withdraw the cash
                        System.out.println("Please take your cash.");
                    } else {
                        // Display an error message
                        System.out.println("You do not have enough money in your account.");
                    }

                    break;
                case 2:
                    // Deposit cash
                    System.out.print("How much cash would you like to deposit? ");
                    amount = scanner.nextInt();

                    // Deposit the cash
                    System.out.println("Your cash has been deposited.");

                    break;
                case 3:
                    // Check balance
                    System.out.println("Your balance is 1000.");

                    break;
                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM.");

                    break;
                default:
                    // Invalid choice
                }
            }
        }
    }