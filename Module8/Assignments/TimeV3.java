package Module8.Assignments;

public class TimeV3 {
    public TimeV3() {}

    public static void main(String[] args) {
        TimeV3 time = new TimeV3();
        int[] times = time.FillList();

        for (int i = 0; i < times.length; i++) {
            System.out.println("Time " + (i + 1) + ": " + times[i]);
        }

        System.out.println("The total time is (s): " + time.AddTime(times));
    }

    public int AddTime(int[] times)
    {
        int total = 0;
        for (int i : times) {
            total += i;
        }

        return total;
    }

    public int[] FillList()
    {
        double timeCount = Math.random() * 10;
        int[] times = new int[(int)timeCount];

        for(int i = 0; i < (int)timeCount; i++)
        {
            times[i] = (int)(Math.random() * 10);
        }

        return times;
    }
}
