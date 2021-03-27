package Module15.Assignments.Product;

public abstract class Food implements IProduct {
    private String name;
    private double cost;

    public abstract void Consume();

    public Food(String name, double cost) {
        this.name = name;
        this.cost = cost;
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
