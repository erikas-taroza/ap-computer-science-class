package Module8.Assignments.ChallengeProgram;

import java.util.Scanner;

public class CirclePoints {
    /**
     * @purpose Display the points of a circle of a certain raidus with certain
     *          increments
     * @author Erikas Taroza
     * @version 11/26/20
     * 
     * @param circleRadius the radius of the circle
     * @param xIncrement   the increment of the x coordinate (how many points to
     *                     get)
     * @param scanner      the scanner instance
     */

    // variables
    private double circleRadius = 1.0;
    private double xIncrement = 0.1;
    private Scanner scanner = new Scanner(System.in);

    // constructor
    public CirclePoints() {
        RequestCircleRadius();
        RequestXIncrement();
    }

    // request circle radius from the person
    public void RequestCircleRadius() {
        System.out.print("Circle radius: ");
        circleRadius = scanner.nextDouble();
        System.out.println();
    }

    // request xincrement from the person
    public void RequestXIncrement() {
        System.out.print("X Increment: ");
        xIncrement = scanner.nextDouble();
        System.out.println();
    }

    // print the results of the coordinates
    public void PrintResults() {
        System.out.println("    Points on a Circle with a Radius of " + circleRadius);
        System.out.printf("%10s %10s %10s %10s", "x1", "y1", "x1", "y2");

        // calculate coordinates and output them
        double tempCircleRadius = circleRadius;
        for (int i = 0; i <= (tempCircleRadius * 2) / xIncrement; i++) {
            double x = circleRadius;
            double y = Math.sqrt(Math.pow(tempCircleRadius, 2) - Math.pow(x, 2));
            System.out.printf("\n%10.2f %10.2f %10.2f %10.2f\n", x, y, x, -y);
            circleRadius -= xIncrement;
        }
    }

    public String DoubleToString(double number) {
        return Double.toString(number);
    }

    // getter for circle radius
    public double GetCircleRadius() {
        return circleRadius;
    }

    // setter for circle radius
    public void SetCircleRadius(double radius) {
        circleRadius = radius;
    }

    // getter for x increment
    public double GetXIncrement() {
        return xIncrement;
    }

    // setter for x increment
    public void SetXIncrement(double increment) {
        xIncrement = increment;
    }
}
