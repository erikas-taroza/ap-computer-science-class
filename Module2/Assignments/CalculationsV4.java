package Module2.Assignments;

/**
 * The Calculations class performs addition, subtraction, multiplication,
 * division, and modulus operations on integers and decimals.
 * 
 * @author Charles Babbage (replace with your name)
 * @version 06/11/17 (replace with today's date)
 */
public class CalculationsV4 {
    public static void main(String[] args) {
        int addition1 = 30;
        int addition2 = 9;

        int subtraction1 = 11;
        int subtraction2 = 9;
        int subtraction3 = 25;

        int multiply1 = 25;
        int multiply2 = 9;

        int division1 = 9;
        int division2 = 25;

        int mod1 = 11;
        int mod2 = 9;


        // Addition
        System.out.println("Addition");
        System.out.printf(String.format("%s + %s = " + (addition1 + addition2), addition1, addition2));
        System.out.println("43.21 + 3.14 + 10.0 = " + (43.21 + 3.14 + 10.0));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(String.format("%s - %s - %s = " + (subtraction1 - subtraction2 - subtraction3), subtraction1, subtraction2, subtraction3));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(String.format("%s * %s = " + (multiply1 * multiply2), multiply1, multiply2));
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(String.format("%s / %s = " + (division1 / division2), division1, division2));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(String.format("%s %% %s = " + (mod1 % mod2), mod1, mod2));
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();

        // 2.03 Additional int Equations

        // 2.04 Additional double Equations

    } // end of main method
} // end of class
