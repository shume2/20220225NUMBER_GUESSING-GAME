import java.util.Scanner;
import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("If you would like to play a game, type true.");
        boolean response = scanner1.hasNextBoolean();
        while (response = true) {

            System.out.println("Welcome to the guessing game! The escape guess is 0.");
            System.out.println("Please enter a number of digits, 1-6:");
            int numberOfDigits = scanner1.nextInt();

            int lowEnd = (int) Math.pow(10, numberOfDigits - 1);
            int highEnd = (int) Math.pow(10, numberOfDigits) - 1;
            int target = new Random().nextInt(lowEnd, highEnd);
            // We got this code from https://programming.guide/java/generate-random-number-of-given-length.html

            int numberOfGuesses = 1; // We got the idea of initializing the number of guesses to one from Colin and Aidan
            System.out.println("Enter a guess:");
            int guess = scanner1.nextInt();

            while (guess != target) {

                if (guess == 0) {
                    System.out.println("You ended the game.");
                    System.exit(0); // We got this code from https://iq.opengenus.org/terminate-program-in-java/#:~:text=Different%20ways%20to%20terminate%20program%20in%20Java%20are%3A,Halting%20the%20JVM%20itself%20using%20the%20Halt%20Method
                } else if (!(guess <= highEnd && guess >= lowEnd)) {
                    System.out.println("Please enter a guess within the range.");
                    guess = scanner1.nextInt();
                }

            }

        }
    }
}