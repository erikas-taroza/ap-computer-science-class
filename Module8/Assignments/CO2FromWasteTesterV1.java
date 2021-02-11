package Module8.Assignments;
/**
 * @purpose: calculate emissions of a random family and display them on a chart
 *
 * @author Erikas Taroza
 * @version 11/24/20
 *
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CO2FromWasteTesterV1
{
   public static void main(String[] args)
   {
       //variables
       ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
       Random random = new Random();

       //generate 6 random families
       for (int i = 0; i < 6; i++) {
           int numPeople = ThreadLocalRandom.current().nextInt(1, 5);
           boolean paper = random.nextFloat() <= 0.5 ? false : true;
           boolean plastic = random.nextFloat() <= 0.5 ? false : true;
           boolean glass = random.nextFloat() <= 0.5 ? false : true;
           boolean cans = random.nextFloat() <= 0.5 ? false : true;
           households.add(new CO2FromWasteV1(numPeople, paper, plastic, glass, cans));
       }

       //calculate emissions
       for(CO2FromWasteV1 dataRecord : households)
       {
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       //display emissions
       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       for(int index = 0; index < households.size(); index ++)
       {
           var hh = households.get(index);
           System.out.printf("| %5d | %6d | %8s | %8s | %7s | %7s | %10.2f | %11.2f | %10.2f |\n",
                index,
                hh.getNumPeople(),
                hh.getPaper(),
                hh.getPlastic(),
                hh.getGlass(),
                hh.getCans(),
                hh.getEmissions(),
                hh.getReduction(),
                hh.getNetEmissions()
           );
       }
   }
}

