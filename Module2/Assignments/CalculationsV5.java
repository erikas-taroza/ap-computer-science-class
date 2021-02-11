package Module2.Assignments;

/**
 * The Calculations class performs addition, subtraction, multiplication,
 * division, and modulus operations on integers and decimals.
 * 
 * @author Charles Babbage (replace with your name)
 * @version 06/11/17 (replace with today's date)
 */
public class CalculationsV5 {
    public static void main(String[] args) {
        int addition1 = 30;
        int addition2 = 9;
        double addition3 = 43.21;
        double addition4 = 3.14;
        double addition5 = 10.0;

        int subtraction1 = 11;
        int subtraction2 = 9;
        int subtraction3 = 25;
        double subtraction4 = 3.14;
        double subtraction5 = 10.0;

        int multiply1 = 25;
        int multiply2 = 9;
        double multiply3 = 3.14;
        double multiply4 = 10.0;
        double multiply5 = 10.0;

        int division1 = 9;
        int division2 = 25;
        double division3 = 43.21;
        double division4 = 10.0;

        int mod1 = 11;
        int mod2 = 9;
        double mod3 = 10.0;
        double mod4 = 3.14;


        // Addition
        System.out.println("Addition");
        System.out.println(String.format("%s + %s = " + (addition1 + addition2), addition1, addition2));
        System.out.println(String.format("%s + %s + %s = " + (addition3 + addition4 + addition5), addition3, addition4, addition5));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(String.format("%s - %s - %s = " + (subtraction1 - subtraction2 - subtraction3), subtraction1, subtraction2, subtraction3));
        System.out.println(String.format("%s - %s = " + (subtraction4 - subtraction5), subtraction4, subtraction5));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(String.format("%s * %s = " + (multiply1 * multiply2), multiply1, multiply2));
        System.out.println(String.format("%s * %s * %s = " + (multiply3 * multiply4 * multiply5), multiply3, multiply4, multiply5));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(String.format("%s / %s = " + (division1 / division2), division1, division2));
        System.out.println(String.format("%s / %s = " + (division3 / division4), division3, division4));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(String.format("%s %% %s = " + (mod1 % mod2), mod1, mod2));
        System.out.println(String.format("%s %% %s = " + (mod3 % mod4), mod3, mod4));
        System.out.println();

        // 2.03 Additional int Equations

        // 2.04 Additional double Equations

    } // end of main method
} // end of class
