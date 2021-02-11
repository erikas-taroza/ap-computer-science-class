package Module7.Assignments.PlanetGravity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanetWeight {
    /*
     * Erikas Taroza 
     * 11/07/20 
     * Calculates the person's weight on different planets
     */
    public static void main(String[] args) throws IOException {
        //variables
        String[] names = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        List<Double> surfaceGravity = new ArrayList<Double>();
        double[] results = {};
        double weight = 0.0;

        Scanner scanner = new Scanner(System.in);
        Scanner getData = new Scanner(new File("Module7/Assignments/PlanetGravity/surface_gravity.txt"));

        //read data file
        while (getData.hasNextLine()) {
            String[] data = getData.nextLine().split("\\s+");
            surfaceGravity.add(Double.parseDouble(data[3]));
        }

        //ask for weight
        System.out.print("Weight in pounds: ");
        weight = scanner.nextDouble();
        scanner.close();

        //get results and print them
        results = CalculateWeight(surfaceGravity.stream().mapToDouble(Double::doubleValue).toArray(), weight);
        PrintResults(names, surfaceGravity.stream().mapToDouble(Double::doubleValue).toArray(), results);
    }

    public static double[] CalculateWeight(double[] surfaceGravity, double weight) {
        //calculate the weight of the person on the different planets
        List<Double> results = new ArrayList<Double>();

        for (int i = 0; i < surfaceGravity.length; i++) {
            double mass = weight * (453.59237) / (9.79 / 9.79);
            results.add(mass * (surfaceGravity[i] / 9.79) / 453.59237);
        }

        return results.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static void PrintResults(String[] names, double[] surfaceGravity, double[] weight) {
        //print the results in a table
        System.out.printf("%30s\n", "My Weight on the Planets");
        System.out.printf("%-10s %10s %20s\n", "Planet", "Gravity", "Weight (lbs)");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %10.2f %20.2f\n", names[i], surfaceGravity[i], weight[i]);
        }
    }
}
