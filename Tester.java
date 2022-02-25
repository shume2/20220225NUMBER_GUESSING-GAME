import java.util.Scanner;
import java.util.Random;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("If you would like to play a game, type true. If not, type false.");
        boolean response = scanner1.nextBoolean();
        while (response) {

            System.out.println("Welcome to the guessing game! If you would like to end the game, type 0.");
            System.out.println("Please enter the number of digits you would like the target number to be, 1-6:");
            int numberOfDigits = scanner1.nextInt();
            while (!(numberOfDigits>=1 && numberOfDigits <=6)){
                System.out.println("Please enter an int between 1 and 6.");
                numberOfDigits = scanner1.nextInt();
            }

            int lowEnd = (int) Math.pow(10, numberOfDigits - 1);
            int highEnd = (int) Math.pow(10, numberOfDigits) - 1;
            final int TARGET = new Random().nextInt(lowEnd, highEnd);
            // We got this code from https://programming.guide/java/generate-random-number-of-given-length.html

            int numberOfGuesses = 1; // We got the idea of initializing the number of guesses to one from Colin and Piper
            System.out.println("Enter a guess:");
            int guess = scanner1.nextInt();

            while (guess != TARGET) {

                if (guess == 0) {
                    System.out.println("You ended the game.");
                    System.exit(0); // We got this code from https://iq.opengenus.org/terminate-program-in-java/#:~:text=Different%20ways%20to%20terminate%20program%20in%20Java%20are%3A,Halting%20the%20JVM%20itself%20using%20the%20Halt%20Method
                } else if (!(guess <= highEnd && guess >= lowEnd)) {
                    System.out.println("Please enter a guess within the range.");
                    guess = scanner1.nextInt();
                }
                else if (guess < .5 * TARGET) {
                    System.out.println("Ice cold, and very low. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess > 1.5 * TARGET) {
                    System.out.println("Ice cold, and very high. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess < .75 * TARGET) {
                    System.out.println("Cold, and low. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess > 1.25 * TARGET) {
                    System.out.println("Cold, and high. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess > 1.15 * TARGET) {
                    System.out.println("Warm, but high. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess < .85 * TARGET){
                    System.out.println("Warm, but low. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess < .95 * TARGET) {
                    System.out.println("Very warm, but low. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess > 1.05 * TARGET){
                    System.out.println("Very warm, but high. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else if (guess < TARGET){
                    System.out.println("Burning hot, but low. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
                else {
                    System.out.println("Burning hot, but high. Try again.");
                    guess = scanner1.nextInt();
                    numberOfGuesses = numberOfGuesses + 1;
                }
            }
            System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " tries.");
            System.out.println("If you would like to play again, type true. If not, type false.");
            response = scanner1.nextBoolean();
        }
        System.out.println("Ok! Thanks for playing!");
    }
}
