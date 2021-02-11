package Module7.Assignments;

import java.util.Scanner;

public class EstimatePi {
    /*
        Erikas Taroza
        11/08/20
        This program estimates the value of pi by throwing darts.
    */
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        int dartsToThrow = 0;
        int numberOfTrials = 0;
        double[] piEstimates = {};
        double average = 0;

        //ask for input
        System.out.print("Darts to throw: ");
        dartsToThrow = scanner.nextInt();
        System.out.println();
        System.out.print("Number of trials: ");
        numberOfTrials = scanner.nextInt();
        scanner.close();

        //dartsToThrow = Integer.MAX_VALUE;

        //run methods
        piEstimates = RunTrails(numberOfTrials, dartsToThrow);
        average = CalculateAverage(piEstimates);
        PrintResults(average, piEstimates);
    }

    public static double[] RunTrails(int numberOfTrials, int dartsToThrow) {
        //runs the actual trials and returns a list of pi estimates
        double[] results = new double[numberOfTrials];

        for (int i = 0; i < numberOfTrials; i++) {
            int hitCount = 0;
            int missCount = 0;

            for (int z = 0; z < dartsToThrow; z++) {
                double x = Math.random();
                double y = Math.random();

                if (Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
                    hitCount++;
                } else {
                    missCount++;
                }
            }

            results[i] = 4.0 * ((double) hitCount / ((double) missCount + hitCount));
        }

        return results;
    }

    public static double CalculateAverage(double[] results) {
        //calculates the average of the results
        double total = 0;
        for (double d : results) {
            total += d;
        }

        return total / results.length;
    }

    public static void PrintResults(double average, double[] results) {
        //prints the results
        for (int i = 0; i < results.length; i++) {
            System.out.printf("Trail %d: pi = %f\n", i, results[i]);
        }
        System.out.println("Average: " + average);
    }
}
