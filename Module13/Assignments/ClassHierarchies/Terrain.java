package Module13.Assignments.ClassHierarchies;

/**
 * This class defines a basic Terrain.
 *
 * @author Erikas Taroza
 * @version 02/04/21
 */

public class Terrain {
    // instance variables
    private int length, width;
    private String landType;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w, String landName) {
        // initialize instance variables
        length = l;
        width = w;
        landType = landName;
    }

    public String getTerrainSize() {
        return landType + " has dimensions " + length + " X " + width;
    }
}
