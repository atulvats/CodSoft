import java.util.Random;
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(max - min + 1) + min;
        int userGuess = 0;
        while (userGuess != randomNumber) {
            System.out.print("Guess the number between " + min + " and " + max + ": ");
            userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }
        scanner.close();
    }
}
