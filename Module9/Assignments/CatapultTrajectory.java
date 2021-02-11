package Module9.Assignments;

public class CatapultTrajectory {
    /**
     * @author Erikas Taroza
     * @version 12/15/20
     * 
     * This class contains getters and setters and is able to calculate the trajectory based on given values.
     * 
     * @param launchSpeed = Launch speed of the trajectory
     * @param launchAngle = Launch angle of the trajectory
     * @param graivty = default gravity
     */

    double launchSpeed = 0.0;
    double launchAngle = 0.0;
    static double gravity = 9.8;

    public CatapultTrajectory(double launchSpeed, double launchAngle)
    {
        this.launchAngle = launchAngle;
        this.launchSpeed = launchSpeed;
    }

    //calculate the trajectory
    public double CalculateTrajectory()
    {
        return (Math.pow(launchSpeed, 2) * Math.sin(Math.toRadians(2 * launchAngle))) / gravity;
    }

    //overload in case the user wants to enter other values
    public double CalculateTrajectory(double launchSpeed, double launchAngle, double gravity)
    {
        return (Math.pow(launchSpeed, 2) * Math.sin(Math.toRadians(2 * launchAngle))) / gravity;
    }

    //getter
    public double GetLaunchSpeed() { return launchSpeed; }

    //setter
    public void SetLaunchSpeed(double launchSpeed) { this.launchSpeed = launchSpeed; }

    //getter
    public double GetLaunchAngle() { return launchAngle; }

    //setter
    public void SetLaunchAngle(double launchAngle) { this.launchAngle = launchAngle; }

    //getter
    public double GetGravity() { return gravity; }
}
