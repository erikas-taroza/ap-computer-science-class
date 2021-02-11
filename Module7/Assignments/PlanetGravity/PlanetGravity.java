package Module7.Assignments.PlanetGravity;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PlanetGravity {
    /*
        Erikas Taroza
        11/06/20
        This program caluclates the surface gravity, prints it to the screen, and saves the data to a text file
    */
    public static void main(String[] args) throws IOException {
        //variables
        String[] names = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        double[] mass = { 3.30E23, 4.869E24, 5.972E24, 6.4219E23, 1.900E27, 5.68E26, 8.683E25, 1.0247E26 };
        double[] diameter = { 4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532 };
        List<Double> surfaceGravity = new ArrayList<Double>();

        final double ugc = 6.67E-11;
        
        //caluclate the surface gravity for each planet
        for (int i = 0; i < names.length; i++) {
            surfaceGravity.add(CalculateSurfaceGravity(mass[i], diameter[i], ugc));
        }

        //display results
        DisplayResults(names, diameter, mass, surfaceGravity.stream().mapToDouble(Double::doubleValue).toArray());
        //write results
        WriteSurfaceGravity(names, diameter, mass, surfaceGravity.stream().mapToDouble(Double::doubleValue).toArray());
    }

    public static double CalculateSurfaceGravity(double mass, double diameter, double ugc) {
        //calculate the surface gravity using the given formula
        double surfaceGravity = 0.0;
        surfaceGravity = ((ugc) * (mass)) / Math.pow((diameter * 1000) / 2, 2);
        return surfaceGravity;
    }

    public static void DisplayResults(String[] names, double[] diameter, double[] mass, double[] surfaceGravity) {
        //display the results in a table
        System.out.printf("%35s\n", "Planetary Data");
        System.out.printf("%-10s %15s %15s %15s\n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %15.0f %15.2E %15.2f\n", names[i], diameter[i], mass[i], surfaceGravity[i]);
        } 
    }

    public static void WriteSurfaceGravity(String[] names, double[] diameter, double[] mass, double[] surfaceGravity) throws IOException {
        //output the data to a text file names surface_gravity
        PrintWriter writer = new PrintWriter(new File("Module7/Assignments/PlanetGravity/surface_gravity.txt"));
        for(int i = 0; i < names.length; i++)
        {
            writer.println(names[i] + " " + diameter[i] + " " + mass[i] + " " + surfaceGravity[i]);
        }
        writer.close();
    }
}
