package Module12.Assignments;

public class Fibonacci {

    /**
     * @author Erikas Taroza
     * @version 1/24/21
     * 
     * This class returns the Fibonacci number at the index of number
     * 
     * @param number = The index of the Fibonacci number that the user wants
     */

    public int CalculateFibonacciNumbers(int number)
    {
        if(number == 0)
        {
            //System.out.print(0 + " ");
            return 0;
        }
        else if(number == 1)
        {
            //System.out.print(1 + " ");
            return 1;
        }
        else if(number > 1)
        {
            int next = CalculateFibonacciNumbers(number - 1) + CalculateFibonacciNumbers(number - 2);
            //System.out.print(next + " ");
            return next;
        }

        return -1;
    }
}
