package Module8.Lessons;

public class ShapesV4 {
    public ShapesV4() {
    }

    // // calculate area of a triangle
    // public double calcTriArea(int s1, int s2) {
    //     return s1 * s2 * 0.5;
    // }

    // // calculate the hypotenuse of a right triangle
    // public double calcHypotenuse(int s1, int s2) {
    //     return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    // }

        public double calcAreaRectangle(int w, int l)
        {
            return w * l;
        }

        public int calcRectPerimeter(int w, int l)
        {
            return 2 * w + 2 * l;
        }

        public double calcCircumference(int r)
        {
            return 2 * Math.PI * r;
        }

    public static void main(String[] args) {
        // declaration of variables
        int side1, side2;
        //double triArea, hypotenuse;

        double area = 0;
        int perimeter = 0;

        // initialization of variables
        side1 = 10;
        side2 = 5;
        // triArea = 0;
        // hypotenuse = 0;

        ShapesV4 shapes = new ShapesV4();

        // call methods
        // triArea = shapes.calcTriArea(side1, side2);
        // hypotenuse = shapes.calcHypotenuse(side1, side2);

        area = shapes.calcAreaRectangle(side1, side2);
        perimeter = shapes.calcRectPerimeter(side1, side2);

        // print results
        System.out.printf(" Area = %8.2f%n", area);
        System.out.printf(" Perimeter = %8.2f%n", perimeter);
    }
}
