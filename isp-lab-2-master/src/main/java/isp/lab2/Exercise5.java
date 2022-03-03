package isp.lab2;

import java.util.Random;

public class Exercise5 {
    public final static Random RANDOM = new Random();

    /**
     * This method should generate an array that have 20 random numbers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = RANDOM.nextInt(2000) - 1000;
        }

        return randomNumbers;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int aux;

        for (int i = 0; i < randomNumbers.length - 1; i++) {
            for (int j = 0; j < randomNumbers.length - i - 1; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    aux = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = aux;
                }
            }
        }

        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
