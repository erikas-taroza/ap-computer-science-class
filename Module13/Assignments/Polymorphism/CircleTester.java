package Module13.Assignments.Polymorphism;

import java.util.*;

public class CircleTester {
    public static void main(String[] args) {
        List<Circle2> circles = new ArrayList<Circle2>();

        circles.add(new Circle2(10, 10, 10));
        circles.add(new Cylinder2(30, 30, 30, 30));
        circles.add(new Oval2(48, 48, 48, 48));
        circles.add(new OvalCylinder2(72, 72, 72, 72, 72));

        for (Circle2 circle : circles) {
            System.out.println(circle.getName() + "'s " + showCenter(circle));
        }
    }

    public static String showCenter(Circle2 circle) {
        return circle.getCenter();
    }
}
