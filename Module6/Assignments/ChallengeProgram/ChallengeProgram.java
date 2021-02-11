package Module6.Assignments.ChallengeProgram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeProgram {
    public static void main(String[] args) throws IOException {
        // variables
        List<String> name = new ArrayList<String>();
        List<Double> pressure = new ArrayList<Double>();
        List<Double> windSpeed = new ArrayList<Double>();
        List<String> month = new ArrayList<String>();
        List<Integer> year = new ArrayList<Integer>();
        List<Integer> category = new ArrayList<Integer>();

        int min = 0;
        int max = 0;

        Scanner readFile = new Scanner(new File("Module6/Assignments/ChallengeProgram/HurricaneData.txt"));
        Scanner scanner = new Scanner(System.in);

        // get data and add to arrays
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            String[] data = line.split("\\s+");
            year.add(Integer.parseInt(data[0]));
            month.add(data[1]);
            pressure.add(Double.parseDouble(data[2]));
            double windSpeedMPH = Double.parseDouble(data[3]) * 1.151;
            windSpeed.add(windSpeedMPH);
            name.add(data[4]);

            if (windSpeedMPH >= 74 && windSpeedMPH <= 95) {
                category.add(1);
            } else if (windSpeedMPH >= 96 && windSpeedMPH <= 110) {
                category.add(2);
            } else if (windSpeedMPH >= 111 && windSpeedMPH <= 129) {
                category.add(3);
            } else if (windSpeedMPH >= 130 && windSpeedMPH <= 156) {
                category.add(4);
            } else if (windSpeedMPH >= 157) {
                category.add(5);
            }
        }

        //request year range
        System.out.print("Year Range (min-max): ");
        String[] input = scanner.nextLine().split("-");
        min = Integer.parseInt(input[0]);
        max = Integer.parseInt(input[1]);

        while (!(min >= year.get(0)) || !(max <= year.get(year.size() - 1)))
        {
            System.out.println("Year not found. Minimum year is " + year.get(0) + " and maximum year is " + year.get(year.size() - 1));
            System.out.print("Year Range (min-max): ");
            input = scanner.nextLine().split("-");
            min = Integer.parseInt(input[0]);
            max = Integer.parseInt(input[1]);
        }

        //add index to array if the year is in the range
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < year.size(); i++) {
            if (year.get(i) >= min && year.get(i) <= max) {
                indexes.add(i);
            }
        }
        
        //print results

        //variables
        double averageCategory = 0;
        double averagePressure = 0;
        double averageWindSpeed = 0;
        int minimumCategory = Integer.MAX_VALUE;
        double minimumPressure = Integer.MAX_VALUE;
        double minimumWindSpeed = Integer.MAX_VALUE;
        int maximumCategory = Integer.MIN_VALUE;
        double maximumPressure = Integer.MIN_VALUE;
        double maximumWindSpeed = Integer.MIN_VALUE;
        int cat1Count = 0;
        int cat2Count = 0;
        int cat3Count = 0;
        int cat4Count = 0;
        int cat5Count = 0;

        //title and columns
        System.out.printf("%30s %s - %s\n", "Hurricanes", min, max);
        System.out.printf("Year %12s %11s %16s %19s\n", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("==================================================================");
        for(Integer i : indexes)
        {
            //print hurricane
            System.out.printf("%d %12s %11d %16.1f %19.2f\n", year.get(i), name.get(i), category.get(i), pressure.get(i), windSpeed.get(i));

            //add data together to get average
            averageCategory += category.get(i);
            averagePressure += pressure.get(i);
            averageWindSpeed += windSpeed.get(i);

            //get minimum and maximum values
            if(category.get(i) < minimumCategory)
                minimumCategory = category.get(i);
            else if(category.get(i) > maximumCategory)
                maximumCategory = category.get(i);
            if(pressure.get(i) < minimumPressure)
                minimumPressure = pressure.get(i);
            else if(pressure.get(i) > maximumPressure)
                maximumPressure = pressure.get(i);
            if(windSpeed.get(i) < minimumWindSpeed)
                minimumWindSpeed = windSpeed.get(i);
            else if(windSpeed.get(i) > maximumWindSpeed)
                maximumWindSpeed = windSpeed.get(i);

            //increase category count
            if(category.get(i) == 1)
                cat1Count++;
            else if(category.get(i) == 2)
                cat2Count++;
            else if(category.get(i) == 3)
                cat3Count++;
            else if(category.get(i) == 4)
                cat4Count++;
            else if(category.get(i) == 5)
                cat5Count++;
        }
        System.out.println("==================================================================");
        
        //print stats
        System.out.printf("         Average: %11.1f %16.1f %19.2f\n", averageCategory / indexes.size(), averagePressure / indexes.size(), averageWindSpeed / indexes.size());
        System.out.printf("         Minimum: %11d %16.1f %19.2f\n", minimumCategory, minimumPressure, minimumWindSpeed);
        System.out.printf("         Maximum: %11d %16.1f %19.2f\n", maximumCategory, maximumPressure, maximumWindSpeed);
        System.out.println();
        System.out.println("Summary of Categories: ");
        System.out.println("Cat 1: " + cat1Count);
        System.out.println("Cat 2: " + cat2Count);
        System.out.println("Cat 3: " + cat3Count);
        System.out.println("Cat 4: " + cat4Count);
        System.out.println("Cat 5: " + cat5Count);

        readFile.close();
        scanner.close();
    }
}
