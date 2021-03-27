package Module15.Assignments.Product;

public class Tool implements IProduct, Comparable<IProduct> {
    private String name;
    private double cost;

    public Tool(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int compareTo(IProduct o) {
        if (cost > o.GetCost()) {
            return 1;
        } else if (cost < o.GetCost()) {
            return -1;
        } else if (cost == o.GetCost()) {
            return 0;
        }

        return 0;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public double GetCost() {
        return cost;
    }

}
