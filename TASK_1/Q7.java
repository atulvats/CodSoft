import java.util.Random;
import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int score = 0;

        do {
            int min = 1;
            int max = 100;
            int maxAttempts = 7;
            int randomNumber = random.nextInt(max - min + 1) + min;
            int userGuess = 0;
            int attempts = 0;
            while (userGuess != randomNumber && attempts < maxAttempts) {
                System.out.print("Guess the number between " + min + " and " + max + " (Attempt " + (attempts + 1) + " of " + maxAttempts + "): ");
                userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                }
            }
            if (userGuess != randomNumber) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            } else {
                score++;
            }
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        } 
        while (playAgain);
        scanner.close();
        System.out.println("Thank you for playing! Your final score: " + score);
    }
}
