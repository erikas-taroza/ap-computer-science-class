package Module13.Assignments.Overriding;

/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author Erikas Taroza
 * @version 02/08/21
 */
public class Rectangle4 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    // String to display when object is printed.

    public String toString() {
        return "The rectangle's dimensions are " + length + " X " + width;
    }

    public boolean equals(Object rect) {
        var obj = (Rectangle4) rect;
        if (this.getLength() == obj.getLength() && this.getWidth() == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

}
