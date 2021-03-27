package Module15.Assignments.HomeworkV4;

import java.util.*;

public class HomeworkTester {
    public static void main(String[] args) {
        List<Homework> classes = new ArrayList<Homework>(
                Arrays.asList(new English(), new Math(), new Science(), new Spanish()));

        for (Homework homework : classes) {
            Random random = new Random();
            homework.CreateHomework(random.nextInt(30), homework.getClass().getSimpleName());

            if (homework.GetPages() == 0) {
                System.out.println("BEFORE: " + homework.ToString());
                System.out.println("AFTER: " + homework.ToString());
                System.out.println();
                continue;
            }

            System.out.println("BEFORE: " + homework.ToString());
            homework.DoHomework(random.nextInt(homework.GetPages()));
            System.out.println("AFTER: " + homework.ToString());
            System.out.println();
        }

        System.out.println("----- Comparing Homework ----- \n");
        while (classes.size() != 0) {
            Homework class1 = classes.get(0);

            for (int j = 1; j < classes.size(); j++) {
                if (j == 0) {
                    continue;
                }

                Homework class2 = classes.get(j);
                String parsedCompare = ParseCompareResult(class1.compareTo(class2));

                System.out.printf("The homework for %s %s to read when compared to %s.\n", class1.GetType(),
                        parsedCompare, class2.GetType());
            }

            classes.remove(0);

            System.out.println();
        }
    }

    private static String ParseCompareResult(int index) {
        if (index == 1) {
            return "has MORE pages";
        } else if (index == 0) {
            return "has the SAME amount of pages";
        } else if (index == -1) {
            return "has LESS pages";
        }

        return "NULL";
    }
}
