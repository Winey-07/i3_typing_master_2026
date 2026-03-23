import java.util.Scanner;

public class typing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        typingTest(sc);
    }

    public static void typingTest(Scanner sc) {

        String text = "ffff jjjj dddd kkkk ssss llll aaaa ;;;; fdsa jkl; fdsa jkl; "
                + "asdf jkl; asdf jkl; sad dad had lad ask all fall hall flask shall gash hash flash glass glad flag sag hash lash.";

        System.out.println("------------ Typing Test Level 1 -----------");
        System.out.println("Type the following paragraph(s) to test your typing speed and quality:");
        System.out.println("(Press ENTER to end the test and display the result)\n");

        System.out.println(text);
        System.out.println("------------------------------------------------------------");

        // Start time
        long startTime = System.currentTimeMillis();

        // User input
        String userInput = sc.nextLine();

        // End time
        long endTime = System.currentTimeMillis();

        // Time taken (minutes)
        double timeMinutes = (endTime - startTime) / 60000.0;

        // Calculate total characters
        int totalChars = userInput.length();

        // Calculate mistakes
        int mistakes = 0;
        int minLength = Math.min(text.length(), userInput.length());

        for (int i = 0; i < minLength; i++) {
            if (text.charAt(i) != userInput.charAt(i)) {
                mistakes++;
            }
        }

        // Add extra mistakes if length different
        mistakes += Math.abs(text.length() - userInput.length());

        // Speed calculations
        int cpm = (int) (totalChars / timeMinutes);
        int wpm = cpm / 5;

        // Output result
        System.out.println("\n--------------- Typing Test Result --------------");
        System.out.println("Speed (characters/min): " + cpm);
        System.out.println("       (words/min): " + wpm);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("        Total mistakes: " + mistakes);
        System.out.println("------------------------------------------------");
    }
}