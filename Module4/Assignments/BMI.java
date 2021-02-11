package Module4.Assignments;

import java.util.Scanner;

public class BMI {

    /*
        Erikas Taroza 
        09/29/20
        This program calculates a BMI based on user input
    */


    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String height = "";
        int inches = 0;
        double weight = 0.0;
        double bmi = 0.0;
        String status = "";

        //request information
        System.out.println("Please provide the following information:");

        System.out.print("First and last name: ");
        // name = scanner.next();
        name = scanner.nextLine();
        //System.out.println();

        System.out.print("Height (feet inches): ");
        height = scanner.nextLine();
        //System.out.println();

        System.out.print("Weight (pounds): ");
        weight = scanner.nextDouble();
        System.out.println();

        scanner.close();

        //get height in inches
        String[] tempHeight = height.split("\s");
        inches = Integer.parseInt(tempHeight[0]) * 12 + Integer.parseInt(tempHeight[1]);
        //convert to kg from lbs
        double kg = weight / 2.205;
        //raise height to power of two and convert to meters
        double meters = Math.pow(inches / 39.37, 2);

        //get status
        bmi = kg / meters;
        if (bmi >= 29.9) {
            status = "Obese";
        } else if(bmi >= 25.0){
            status = "Overweight";
        } else if(bmi >= 18.5){
            status = "Normal/Healthy Weight";
        } else if(bmi < 18.5){
            status = "Underweight";
        }
        
        //display results
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + Math.round(Math.sqrt(meters) * 100.0) / 100.0);
        System.out.println("Weight (kg): " + Math.round(kg * 100.0) / 100.0);
        System.out.println("BMI: " + Math.round(bmi * 100.0) / 100.0);
        System.out.println("Status: " + status);
    }
}
