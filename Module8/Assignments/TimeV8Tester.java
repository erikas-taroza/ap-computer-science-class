package Module8.Assignments;

public class TimeV8Tester {
    public static void main(String[] args) {
        TimeV8 timeV8 = new TimeV8();
        timeV8.PrintTimes();
        System.out.println("Smallest: " + timeV8.GetSmallestTime());
        System.out.println("Largest: " + timeV8.GetLargestTime());
        System.out.println("Average: " + timeV8.GetAverageTime());
    }
}
