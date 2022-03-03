package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public final static Random RANDOM = new Random();
    public final static Scanner SCANNER = new Scanner(System.in);

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        return RANDOM.nextInt(7);
    }

    public static void startGame() {
        int numberToBeGuessed = generateARandom();
        int counter = 1;

        while (true) {
            System.out.println("Please enter your number: ");
            int enteredNumber = SCANNER.nextInt();

            if (enteredNumber > numberToBeGuessed) {
                System.out.println("Your number is too big!");
            } else if (enteredNumber < numberToBeGuessed) {
                System.out.println("Your number is too small!");
            } else {
                System.out.println("You guessed it!");
                System.out.println("Number of tries: " + counter);
                break;
            }

            counter++;
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}
