import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int numberOfAttempts = 5;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + minRange + " and " + maxRange);

            while (attempts < numberOfAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Try a higher number. Attempts left: " + (numberOfAttempts - attempts));
                } else if (userGuess > targetNumber) {
                    System.out.println("Try a lower number. Attempts left: " + (numberOfAttempts - attempts));
                } else {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    score++;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = true;
            }
            playAgain = false;
            rounds++;
        }

        System.out.println("Game Over! You played " + rounds + " rounds and your total score is: " + score);

        scanner.close();
    }
}
