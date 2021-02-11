package Module7.Assignments;

import java.util.Scanner;

public class CirclePoints {
    /*
        Erikas Taroza
        10/31/20
        Outputs points of a circle.
    */
    
    public static void main(String[] args) {
        //variables
        double circleRadius = 1.0;
        double xIncrement = 0.1;
        Scanner scanner = new Scanner(System.in);

        //ask for radius
        System.out.print("Circle radius: ");
        circleRadius = scanner.nextDouble();
        System.out.println();

        //ask for x increment
        System.out.print("X Increment: ");
        xIncrement = scanner.nextDouble();
        System.out.println();

        System.out.println("    Points on a Circle with a Radius of " + circleRadius);
        System.out.printf("%10s %10s %10s %10s", "x1", "y1", "x1", "y2");

        //calculate coordinates and output them
        double tempCircleRadius = circleRadius;
        for(int i = 0; i <= (tempCircleRadius * 2) / xIncrement; i++)
        {
            double x = circleRadius;
            double y = Math.sqrt(Math.pow(tempCircleRadius, 2) - Math.pow(x, 2));
            System.out.printf("\n%10.2f %10.2f %10.2f %10.2f", x, y, x, -y);
            circleRadius -= xIncrement;
        }

        scanner.close();
    }
}
