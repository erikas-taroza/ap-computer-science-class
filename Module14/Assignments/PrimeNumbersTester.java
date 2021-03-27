package Module14.Assignments;

import java.util.List;
import java.util.Scanner;

public class PrimeNumbersTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        System.out.print("Minimum value: ");
        min = scanner.nextInt();
        System.out.println();

        System.out.print("Maximum value: ");
        max = scanner.nextInt();
        System.out.println();

        PrimeNumbers pn = new PrimeNumbers(min, max);

        List<Integer> primeNumbers = pn.GetPrimeNumbersInRange();

        System.out.println("Prime numbers between " + pn.min + " and " + pn.max + ": " + primeNumbers.size());
        for (Integer prime : primeNumbers) {
            System.out.print(prime + " ");
        }

        scanner.close();
    }
}
