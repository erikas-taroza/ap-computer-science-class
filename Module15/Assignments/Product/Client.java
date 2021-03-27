package Module15.Assignments.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        List<IProduct> products = new ArrayList<IProduct>();
        Random random = new Random();

        Apple apple1 = new Apple("Apple", random.nextInt(10));
        Apple apple2 = new Apple("Apple", random.nextInt(10));
        Orange orange1 = new Orange("Orange", random.nextInt(10));
        Orange orange2 = new Orange("Orange", random.nextInt(10));
        HandDrill handDrill1 = new HandDrill("Hand Drill", random.nextInt(200));
        HandDrill handDrill2 = new HandDrill("Hand Drill", random.nextInt(200));

        products.add(apple1);
        products.add(apple2);
        products.add(orange1);
        products.add(orange2);
        products.add(handDrill1);
        products.add(handDrill2);

        int index = random.nextInt(products.size());
        TakeInventory(products.get(index).GetName(), products);

        System.out.println();
        int compareResult = handDrill1.compareTo(handDrill2);
        System.out.println("The first hand drill ($" + handDrill1.GetCost() + ") "
                + (compareResult == 1 ? "is more expensive than the second hand drill ($" + handDrill2.GetCost() + ")"
                        : compareResult == 0
                                ? "has the same price as the second hand drill ($" + handDrill2.GetCost() + ")"
                                : "is cheaper than the second hand drill ($" + handDrill2.GetCost() + ")"));
    }

    private static void TakeInventory(String productName, List<IProduct> inventory) {
        int count = 0;
        float cost = 0f;

        for (IProduct product : inventory) {
            if (product.GetName() == productName) {
                count++;
                cost += product.GetCost();
            }
        }

        System.out.println(productName + ": Quantity = " + count + ", Total cost = $" + cost);
    }
}
