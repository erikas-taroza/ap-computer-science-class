package Module6.Assignments;

/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;

public class AnnualWeatherV2 {
    public static void main(String[] args) {

        // Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Apalachicola";
        String state = "Florida";

        String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        double[] temperature = { 52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2 };
        double[] precipitation = { 4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5 };

        String tempLabel = "F"; // initialize to F
        String precipLabel = "in."; // initialize to in

        int tempSelection = 0;
        int precipSelection = 0;

        double totalTemperature = 0.0;
        double average = 0.0;
        double totalPrecipitation = 0.0;

        // options
        System.out.println("Temperature Unit:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celsius");
        System.out.print("Selection: ");
        tempSelection = in.nextInt();
        while (tempSelection != 1 && tempSelection != 2) {
            System.out.println("Invalid input.");
            System.out.println("Temperature Unit:");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Celsius");
            System.out.print("Selection: ");
            tempSelection = in.nextInt();
        }

        System.out.println("Precipitation Unit:");
        System.out.println("1. Inches");
        System.out.println("2. Centimeters");
        System.out.print("Selection: ");
        precipSelection = in.nextInt();
        while (precipSelection != 1 && precipSelection != 2) {
            System.out.println("Invalid input.");
            System.out.println("Precipitation Unit:");
            System.out.println("1. Inches");
            System.out.println("2. Centimeters");
            System.out.print("Selection: ");
            precipSelection = in.nextInt();
        }

        // set units
        if (tempSelection == 1) {
            tempLabel = "F";
        } else {
            tempLabel = "C";
        }

        if (precipSelection == 1) {
            precipLabel = "in.";
        } else {
            precipLabel = "cm.";
        }

        // Processing - calculate average temperature and total precipitation
        for (int index = 0; index < temperature.length; index++) {
            totalTemperature += temperature[index];
            totalPrecipitation += precipitation[index];
        }

        if (tempSelection == 1) {
            average = totalTemperature / 12;
        }
        else{
            average = convertToCelsius(totalTemperature / 12);
        }

        if(precipSelection == 2)
        {
            totalPrecipitation = convertToCentimeters(totalPrecipitation);
        }

        // Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println("Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for (int index = 0; index < temperature.length; index++) {
            if(tempSelection == 1 && precipSelection == 1)
            {
                System.out.printf("%s%11s%19s%n", month[index], temperature[index], precipitation[index]);
            }
            else if(tempSelection == 1 && precipSelection == 2)
            {
                System.out.printf("%s%11s%19s%n", month[index], temperature[index], convertToCentimeters(precipitation[index]));
            }
            else if(tempSelection == 2 && precipSelection == 1)
            {
                System.out.printf("%s%11s%19s%n", month[index], convertToCelsius(temperature[index]), precipitation[index]);
            }
            else if(tempSelection == 2 && precipSelection == 2)
            {
                System.out.printf("%s%11s%19s%n", month[index], convertToCelsius(temperature[index]), convertToCentimeters(precipitation[index]));
            }
        }
        System.out.println();
        System.out.println("Average: " + (double)Math.round(average * 10) / 10 + "    Total: " + (double)Math.round(totalPrecipitation * 10) / 10);

        in.close();

    }// end main

    public static double convertToCelsius(double temp) {
        return (double)Math.round(((temp - 32) * 5.0 / 9) * 10) / 10;
    }

    public static double convertToCentimeters(double inches) {
        return (double)Math.round((inches * 2.54) * 10) / 10;
    }
}// end class
