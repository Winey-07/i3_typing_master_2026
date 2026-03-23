import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ Register Screen -----------");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Registration successful!");
        System.out.println("Welcome, " + username + "!");

        scanner.close();
    }
}

// # Install Homebrew
// /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

// # Add Homebrew to your PATH
// echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> ~/.zprofile
// eval "$(/opt/homebrew/bin/brew shellenv)"

// # Install Java (OpenJDK)
// brew install openjdk

// # Link Java so macOS recognizes it
// sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk

// # Verify installation
// java -version
// javac -version
