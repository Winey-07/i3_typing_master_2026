import java.util.Scanner;

public class ResetPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------- Reset User Password -----------");

        System.out.print("Input your username: ");
        String username = sc.nextLine();

        // Check if blank to cancel
        if (username.trim().isEmpty()) {
            System.out.println("Operation canceled.");
            
        }

        System.out.print("Input new password: ");
        String newPassword = sc.nextLine();

        System.out.print("Confirm new password: ");
        String confirmPassword = sc.nextLine();

        System.out.println("\nProcessing...");
        if (newPassword.equals(confirmPassword)) {
            System.out.println("Password reset successfully for user: " + username);
        } else {
            System.out.println("Error: New passwords do not match!");
        }

        sc.close();
    }
}