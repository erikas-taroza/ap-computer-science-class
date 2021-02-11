package Module6.Assignments;

/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;

public class AnnualWeatherV1 {
    public static void main(String[] args) {

        // Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Apalachicola";
        String state = "Florida";

        String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };
        double[] temperature = { 52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2 };
        double[] precipitation = { 4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5 };

        String tempLabel = "F"; // initialize to F
        String precipLabel = "in."; // initialize to in

        
        double totalTemperature = 0.0;
        double average = 0.0;
        double totalPercipitation = 0.0;

        // Processing - calculate average temperature and total precipitation
        for (int index = 0; index < temperature.length; index++) {
            totalTemperature += temperature[index];
            totalPercipitation += precipitation[index];
        }
        average = totalTemperature / 12;

        // Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println("Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for (int index = 0; index < temperature.length; index++) {
            System.out.printf("%s%11s%19s%n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println("Average: " + average + "    Total: " + totalPercipitation);

        in.close();

    }// end main
}// end class
