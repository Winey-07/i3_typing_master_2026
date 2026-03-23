import java.util.ArrayList;

class TestResult {
    int speedCPM;
    int speedWPM;
    int mistakes;

    public TestResult(int cpm, int wpm, int mistakes) {
        this.speedCPM = cpm;
        this.speedWPM = wpm;
        this.mistakes = mistakes;
    }
}

public class list {

    static String currentUser = "Seang";
    static ArrayList<TestResult> results = new ArrayList<>();

    public static void main(String[] args) {

        // Sample data (you can remove later)
        results.add(new TestResult(60, 40, 8));
        results.add(new TestResult(70, 45, 5));

        showResults();
    }

    public static void showResults() {
        System.out.println("--------------- Typing Test Results --------------");
        System.out.println("User: " + currentUser);
        System.out.println();

        if (results.isEmpty()) {
            System.out.println("No test results found.");
            return;
        }

        int i = 1;
        for (TestResult r : results) {
            System.out.println("Test " + i +
                " → Speed: " + r.speedCPM + " cpm | " +
                r.speedWPM + " wpm | Mistakes: " + r.mistakes);
            i++;
        }

        System.out.println("-------------------------------------------------");
    }
}