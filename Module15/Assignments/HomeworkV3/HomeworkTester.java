package Module15.Assignments.HomeworkV3;

import java.util.*;

public class HomeworkTester {
    public static void main(String[] args) {
        List<Homework> classes = new ArrayList<Homework>(
                Arrays.asList(new English(), new Math(), new Science(), new Spanish()));

        for (Homework homework : classes) {
            Random random = new Random();
            homework.CreateHomework(random.nextInt(30), homework.getClass().getSimpleName());
            System.out.println("BEFORE: " + homework.ToString());
            homework.DoHomework(random.nextInt(homework.GetPages()));
            System.out.println("AFTER: " + homework.ToString());
            System.out.println();
        }
    }
}
