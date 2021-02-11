package Module8.Assignments;

import java.util.Arrays;
import java.util.Collections;

public class TimeV8 {
    private int[] times = new int[0];

    public TimeV8() {
        // fill list
        times = FillList();
    }

    // print results
    public void PrintTimes() {
        // print list
        for (int i = 0; i < times.length; i++) {
            System.out.println("Time " + (i + 1) + ": " + times[i]);
        }

        // print total
        System.out.println("The total time is (s): " + AddTime(times) + "\n");
    }

    // get times
    public int[] GetTimes() {
        return times;
    }

    // set times
    public int[] SetTimes(int[] newTimes) {
        return times = newTimes;
    }

    // get smallest time
    public int GetSmallestTime() {
        int smallest = Integer.MAX_VALUE;
        for (int i : times) {
            if (i < smallest) {
                smallest = i;
            }
        }

        return smallest;
    }

    // get largest time
    public int GetLargestTime() {
        int largest = Integer.MIN_VALUE;
        for (int i : times) {
            if (i > largest) {
                largest = i;
            }
        }

        return largest;
    }

    // get average time
    public double GetAverageTime()
    {
        int sum = 0;
        int count = 0;
        for (int i : times) {
            sum += i;
            count++;
        }

        return Math.round(sum / (double)count * 10) / 10.0;
    }

    // get the sum of the times
    public int AddTime(int[] times) {
        int total = 0;
        for (int i : times) {
            total += i;
        }

        return total;
    }

    // fill the list with random amounts of times
    public int[] FillList() {
        double timeCount = Math.random() * 10;
        int[] times = new int[(int) timeCount];

        for (int i = 0; i < (int) timeCount; i++) {
            times[i] = (int) (Math.random() * 10);
        }

        return times;
    }

    public int[] FillList(boolean reversed) {
        double timeCount = Math.random() * 10;
        int[] times = new int[(int) timeCount];

        for (int i = 0; i < (int) timeCount; i++) {
            times[i] = (int) (Math.random() * 10);
        }

        if (reversed) {
            Collections.reverse(Arrays.asList(times));
            return times;
        } else {
            return times;
        }
    }

}
