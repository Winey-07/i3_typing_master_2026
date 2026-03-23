import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showAboutUs(sc);
    }

    public static void showAboutUs(Scanner sc) {
        System.out.println("--------------- About Us --------------");
        System.out.println("Project: I3 Typing Master v2026");
        System.out.println();
        System.out.println("This application is designed to help users improve");
        System.out.println("their typing speed and accuracy through practice tests.");
        System.out.println();
        System.out.println("Features:");
        System.out.println("- User Registration & Login");
        System.out.println("- Typing Speed Test");
        System.out.println("- Result Tracking");
        System.out.println();
        System.out.println("Developed by:");
        System.out.println("- bemengseango15-del");
        System.out.println("- Winey-07");
        System.out.println("- rothsophea-due");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Press ENTER to go back...");
        
        sc.nextLine(); // wait for user
    }
}