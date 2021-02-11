package Module4.Assignments;

import java.util.Map;
import java.util.Scanner;

public class TDEE {

    /*
        Erikas Taroza
        10/2/20
        This program calculates TDEE based on user inputs.
    */

    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> maleActivityFactor = Map.of("a", 1.0, "b", 1.3, "c", 1.6, "d", 1.7, "e", 2.1, "f", 2.4);
        Map<String, Double> femaleActivityFactor = Map.of("a", 1.0, "b", 1.3, "c", 1.5, "d", 1.6, "e", 1.9, "f", 2.2);
        String selectedActivityLevel = "";
        double activityFactor = 0.0;

        String name = "";
        String gender = "";
        double bmr = 0.0;
        double tdee = 0.0;

        //request information from the user

        System.out.println("Please enter the following information:");

        System.out.print("Full Name: ");
        name = scanner.nextLine();

        System.out.print("Gender (M/F): ");
        gender = scanner.next().toUpperCase();

        System.out.print("BMR (Base Metabolic Rate): ");
        bmr = scanner.nextDouble();
        System.out.println();

        //parse results
        selectedActivityLevel = printOptions(scanner);

        if (gender.equals("M")) {
            activityFactor = maleActivityFactor.get(selectedActivityLevel);
        } else if (gender.equals("F")) {
            activityFactor = femaleActivityFactor.get(selectedActivityLevel);
        }

        tdee = Math.round(bmr * activityFactor * 10.0) / 10.0;

        //print results
        System.out.println("Your results: ");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bmr + " calories");
        System.out.println("Activity Level: " + activityFactor);
        System.out.println("TDEE: " + tdee + " calories");

        scanner.close();
    }

    //ask user for activity level
    private static String printOptions(Scanner scanner)
    {
        String selectedActivityLevel = "";
        System.out.println("Select Your Activity Level:");
        System.out.println("[A]  Resting (Sleeping, Reclining)");
        System.out.println("[B]  Sedentary (Minimal Movement)");
        System.out.println("[C]  Light (Sitting, Stadning)");
        System.out.println("[D]  Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E]  Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();

        System.out.print("Enter the corresponding letter: ");
        selectedActivityLevel = scanner.next().toLowerCase();
        System.out.println();

        //if the program detects an invalid input, ask for another input
        while(selectedActivityLevel.length() != 1 || (!selectedActivityLevel.contains("a") && !selectedActivityLevel.contains("b") && !selectedActivityLevel.contains("c") && !selectedActivityLevel.contains("d") && !selectedActivityLevel.contains("e") && !selectedActivityLevel.contains("f"))){
            System.out.println("Incorrect inputs detected. Please try again.");
            System.out.println();
            selectedActivityLevel = "";
            System.out.println("Select Your Activity Level:");
            System.out.println("[A]  Resting (Sleeping, Reclining)");
            System.out.println("[B]  Sedentary (Minimal Movement)");
            System.out.println("[C]  Light (Sitting, Stadning)");
            System.out.println("[D]  Moderate (Light Manual Labor, Dancing, Riding Bike)");
            System.out.println("[E]  Very Active (Team Sports, Hard Manual Labor)");
            System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
            System.out.println();
    
            System.out.print("Enter the corresponding letter: ");
            selectedActivityLevel = scanner.next().toLowerCase();
            System.out.println();
        }

        return selectedActivityLevel;
    }
}
