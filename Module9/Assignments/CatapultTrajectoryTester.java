package Module9.Assignments;

import java.util.ArrayList;
import java.util.List;

public class CatapultTrajectoryTester {
    /**
     * @author Erikas Taroza
     * @version 12/15/20
     * 
     * This program uses the CatapultTrajectory class to calculate the distance a trajectory will travel in feet.
     * 
     * @param launchSpeeds = Array of launch speeds to test
     * @param launchAngles = Array of launch angles to test
     */

    public static void main(String[] args) {
        //variables
        int[] launchSpeeds = new int[]{20, 25, 30, 35, 40, 45, 50};
        int[] launchAngles = new int[]{20, 25, 30, 35, 40, 45, 50};

        //print chart
        System.out.println("Projectile Distance (feet)");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s\n", "MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");

        //calculate distances, output in table
        for (int i = 0; i < launchSpeeds.length; i++) {
            List<Double> distanceQueues = new ArrayList<Double>();
            for (int j = 0; j < launchAngles.length; j++) {
                CatapultTrajectory trajectory = new CatapultTrajectory(launchSpeeds[i], launchAngles[j]);
                distanceQueues.add(trajectory.CalculateTrajectory() * 3.281); 
            }

            System.out.printf("%10s %10.2f %10.2f %10.2f %10.2f %10.2f %10.2f\n", launchSpeeds[i], 
            distanceQueues.get(0), 
            distanceQueues.get(1), 
            distanceQueues.get(2), 
            distanceQueues.get(3), 
            distanceQueues.get(4), 
            distanceQueues.get(5));
        }
    }
}
