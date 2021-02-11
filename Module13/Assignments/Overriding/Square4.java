package Module13.Assignments.Overriding;

public class Square4 extends Rectangle4 {

    public Square4(int l, int w) {
        super(l, w);
    }

    @Override
    public String toString() {
        return "The sqaures's dimensions are " + getLength() + " X " + getWidth();
    }
}
