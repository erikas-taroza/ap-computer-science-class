package Module8.Assignments;

import java.util.Arrays;
import java.util.Collections;

public class TimeV7 {
    //constructor
    public TimeV7() 
    {
        //fill list
        int[] times = FillList();

        //print list
        for (int i = 0; i < times.length; i++) {
            System.out.println("Time " + (i + 1) + ": " + times[i]);
        }

        //print total
        System.out.println("The total time is (s): " + AddTime(times) + "\n");
    }

    //get the sum of the times
    private int AddTime(int[] times) {
        int total = 0;
        for (int i : times) {
            total += i;
        }

        return total;
    }

    //fill the list with random amounts of times
    private int[] FillList() {
        double timeCount = Math.random() * 10;
        int[] times = new int[(int) timeCount];

        for (int i = 0; i < (int) timeCount; i++) {
            times[i] = (int) (Math.random() * 10);
        }

        return times;
    }

    public int[] FillList(boolean reversed)
    {
        double timeCount = Math.random() * 10;
        int[] times = new int[(int) timeCount];

        for (int i = 0; i < (int) timeCount; i++) {
            times[i] = (int) (Math.random() * 10);
        }

        if(reversed)
        {
            Collections.reverse(Arrays.asList(times));
            return times;
        }
        else
        {
            return times;
        }
    }
}
