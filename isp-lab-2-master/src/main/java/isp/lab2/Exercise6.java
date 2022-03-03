package isp.lab2;

import java.util.Arrays;

public class Exercise6 {
    private static int[] vector;

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] vector = new int[n];
        vector[0] = 1;
        vector[1] = 2;

        for (int i = 2; i < vector.length; i++) {
            vector[i] = vector[i - 1] * vector[i - 2];
        }

        return vector;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        if (vector == null) {
            vector = new int[n];
            vector[0] = 1;
            vector[1] = 2;
        }

        if (n > 2) {
            generateRandomVectorRecursively(n - 1);
            vector[n - 1] = vector[n - 2] * vector[n - 3];
        }

        return vector;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateVector(8)));
        System.out.println(Arrays.toString(generateRandomVectorRecursively(8)));
    }
}
