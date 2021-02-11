package Module3.Assignments.GradesV3;

public class StudentTest {
    // variables
    String name;
    int testScore;
    int totalPoints;
    double average;

    // constructer
    public StudentTest(String studentName, int studentScore, int totalPoints, double average){
        name = studentName;
        testScore = studentScore;
        this.totalPoints = totalPoints;
        this.average = average;
    }
}
