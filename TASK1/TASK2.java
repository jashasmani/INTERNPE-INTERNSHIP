import java.util.Random;
import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            // Get user choice
            System.out.print("Enter rock, paper, or scissors (or quit to stop): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                continue;
            }

            // Get computer choice
            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
