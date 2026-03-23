import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------- Authentication ----------------");

        System.out.print("Username (left blank to cancel): ");
        String username = sc.nextLine();

        if (username.trim().isEmpty()) {
            System.out.println("Login canceled.");

        }

        System.out.print("Password: ");
        String password = sc.nextLine();

        // Using 'password' here to compare it clears the warning!
        System.out.println("\nVerifying credentials for: " + username);
        
        if (password.equals("1234")) {
            System.out.println("Login Successful! Welcome, " + username + ".");
        } else {
            // Even a failed login check counts as 'using' the variable
            System.out.println("Login failed. Incorrect password.");
        }

        sc.close();
    }
}