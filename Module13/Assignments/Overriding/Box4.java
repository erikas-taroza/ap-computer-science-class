package Module13.Assignments.Overriding;

/**
 * This class defines a Box object by extending Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Erikas Taroza
 * @version 02/08/21
 */
public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h) {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight() {
        return height;
    }

    // String to display when object is printed.
    public String toString() {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    @Override
    public boolean equals(Object rect) {
        var obj = (Box4) rect;
        if (this.getLength() == obj.getLength() && this.getWidth() == obj.getWidth()
                && this.getHeight() == obj.getHeight()) {
            return true;
        } else {
            return false;
        }
    }
}
