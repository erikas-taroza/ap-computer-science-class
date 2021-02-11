package Module3.Assignments.GradesV3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import Module3.Assignments.GradesV3.StudentTest;

public class GradesV3 {

    /*
     * Erikas Taroza 9/3/20
     * 
     * This program prints out test results with a set score and random scores
     * 
     */

    public static void main(final String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // local variables
        int tests = 0; // number of tests in total

        int numTests = 0; // counts current number of tests
        int testGrade = 0; // individual test grade
        int totalPoints = 0; // total points for all tests
        double average = 0.0; // average grade
        String studentName = ""; // current student's name

        List<StudentTest> testResults = new ArrayList<StudentTest>(); // list of test results inputted

        // Ask for how many tests there are
        System.out.print("Amount of tests: ");
        tests = scanner.nextInt();

        // get data
        for (int i = 0; i < tests; i++) {
            System.out.print("Student name: ");
            studentName = scanner.next();
            studentName += scanner.nextLine();
            System.out.print("Student score: ");
            testGrade = scanner.nextInt();
            numTests++;
            totalPoints += testGrade;
            average = (double) totalPoints / numTests;
            testResults.add(new StudentTest(studentName, testGrade, totalPoints, average));
        }

        System.out.println();
        System.out.println("Test Results:");

        // print data
        for(int i = 0; i < tests; i++){
            StudentTest result = testResults.get(i);
            printTestInformation(result.name, result.testScore, result.totalPoints, result.average);
        }

        scanner.close();
    }

    // prints the test information
    private static void printTestInformation(String student, int grade, int totalPoints, double averageScore) {
        System.out.print(student);
        System.out.print("    Test Grade: " + grade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + averageScore);
    }
}