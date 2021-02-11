package Module12.Assignments;

import java.util.Scanner;

public class FibonacciTester {

    /**
     * @author Erikas Taroza
     * @version 1/24/21
     * 
     * This class gets the Fibonacci number at the given index
     * 
     * @param Scanner = scanner
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter index of Fibonacci number: ");
            int input = scanner.nextInt();

            Fibonacci fib = new Fibonacci();
            System.out.println(fib.CalculateFibonacciNumbers(input));
            System.out.println();

            //comment this out if using program
            scanner.close();
        }
    }
}
