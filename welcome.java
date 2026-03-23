import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Typing Test");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Redirecting to Login screen...");
                break;
            case 2:
                System.out.println("Redirecting to Register screen...");
                break;
            case 3:
                System.out.println("Redirecting to Typing Test screen...");
                break;
            case 4:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }

        scanner.close();
    }
}
