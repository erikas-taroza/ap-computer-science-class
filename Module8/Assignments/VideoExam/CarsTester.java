package Module8.Assignments.VideoExam;

import java.util.Arrays;

public class CarsTester {
    public static void main(String[] args) {
        Cars myCar = new Cars(new Integer[2020], "Acura", "NSX");
        myCar.productionYears = Arrays.asList(2020, 2019);
        System.out.println("Production Year/s: " + myCar.GetProductionYears());
        System.out.println("Maker: " + myCar.GetMaker());
        System.out.println("Model: " + myCar.GetModel());
    }
}
