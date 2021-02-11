package Module8.Assignments.VideoExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    //Instance variable list
    List<Integer> productionYears = new ArrayList<Integer>();
    String maker = "";
    String model = "";

    //default constructor
    public Cars() {}

    //normal constructor
    public Cars(Integer[] productionYears, String maker, String model) 
    {
        this.productionYears = Arrays.asList(productionYears);
        this.maker = maker;
        this.model = model;
    }

    //getter
    public List<Integer> GetProductionYears() { return productionYears; }

    //setter
    public void SetMyList(List<Integer> newList) { productionYears = newList; }

    //to string
    public String ProductionYearsToString() { return productionYears.toString(); }

    //getter
    public String GetMaker() { return maker; }

    //setter
    public void SetMaker(String maker) { this.maker = maker; }

    //getter
    public String GetModel() { return model; }

    //setter
    public void SetModel(String model) { this.model = model; }
}
