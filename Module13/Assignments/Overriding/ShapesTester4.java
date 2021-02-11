package Module13.Assignments.Overriding;

/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Erikas Taroza
 * @version 02/08/21
 */
import java.util.*;

public class ShapesTester4 {
    public static void main(String[] args) {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4, 10, 5);
        Rectangle4 three = new Cube4(11, 22, 33);
        Rectangle4 four = new Square4(75, 59);
        Rectangle4 five = new RectangularPrism(11, 22, 33);

        // Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);

        for (Rectangle4 rect : shapes) {
            showEffectBoth(rect);
            System.out.println();
        }

        System.out.println("Rectangular prism is equal to cube: " + five.equals(three));
        System.out.println("Rectangle is equal to square: " + one.equals(four));
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r.toString());
    }

}
