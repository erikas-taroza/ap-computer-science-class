package Module8.Assignments;
/**
 * @purpose: This class uses getters and setters for variables and is able to calculate tons and convert tons to pounds
 * It contains mutator methods to calculate the tons of c02 and to convert tons to pounds
 * It contains getter methods to get the three variables in this class
 * Private instance variables include myGallonsUsed, myTonsCO2, myPoundsCO2
 * @author The author
 * @version The date
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;


    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }


    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }


    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }


    public double getGallons()
    {
        return myGallonsUsed;
    }


    public double getTonsCO2()
    {
        return myTonsCO2;
    }


    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

