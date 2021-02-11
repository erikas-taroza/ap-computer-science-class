package Module13.Assignments.Overriding;

public class Cube4 extends Box4 {

    public Cube4(int l, int w, int h) {
        super(l, w, h);
    }

    @Override
    public String toString() {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
