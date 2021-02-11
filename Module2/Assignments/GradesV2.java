package Module2.Assignments;

public class GradesV2 {

    /*
     * Erikas Taroza 
     * 9/3/20
     * 
     * This program prints out test results with a set score and random scores
     * 
     */

    public static void main(String[] args) {
        // local variables
        int numTests = 0; // counts number of tests
        int testGrade = 0; // individual test grade
        int totalPoints = 0; // total points for all tests
        double average = 0.0; // average grade

        // first test
        numTests++;
        testGrade = 95;
        totalPoints = testGrade;
        average = (double)totalPoints / numTests;
        printTestInformation(numTests, testGrade, totalPoints, average);

        // second test
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        printTestInformation(numTests, testGrade, totalPoints, average);

        // third test
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        printTestInformation(numTests, testGrade, totalPoints, average);

        // fourth test
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        printTestInformation(numTests, testGrade, totalPoints, average);

        // 5 other scores
        for (int i = 0; i < 5; i++) {
            double randomNumber = 100 * Math.random();
            numTests++;
            testGrade = (int)randomNumber;
            totalPoints += testGrade;
            average = (double)totalPoints / numTests;
            printTestInformation(numTests, testGrade, totalPoints, average);
        }
    }

    private static void printTestInformation(int testNumber, int grade, int totalPoints, double averageScore) {
        System.out.print("Test " + testNumber);
        System.out.print("    Test Grade: " + grade);
        System.out.print("    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + averageScore);
    }
}