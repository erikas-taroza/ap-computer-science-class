package Module8.Assignments.ChallengeProgram;

import java.util.ArrayList;
import java.util.List;

public class CirclePointsTester {
    /**
     * @purpose create a list of 10 circlepoints classes and print their results after the user gave their input
     * @author Erikas Taroza
     * @version 11/27/20
     */

    public static void main(String[] args) {
        //variables
        List<CirclePoints> items = new ArrayList<CirclePoints>();

        //fill list
        for (int i = 0; i < 10; i++) {
            items.add(new CirclePoints());
        }

        //print results
        for (CirclePoints cp : items) {
            cp.PrintResults();
        }
    }
}
