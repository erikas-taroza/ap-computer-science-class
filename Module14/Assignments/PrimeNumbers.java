package Module14.Assignments;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    int min = 0;
    int max = 0;

    public PrimeNumbers(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public List<Integer> GetPrimeNumbersInRange() {
        List<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = min; i <= max; i++) {
            boolean isPrime = true;

            // a number that is less than or equal to one is not a prime number
            if (i <= 1) {
                continue;
            }

            // check if the number can be divided by factors other than 1 and itself
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // if the number is prime, add it to the list
            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}