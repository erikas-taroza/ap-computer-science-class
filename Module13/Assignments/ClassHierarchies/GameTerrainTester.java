package Module13.Assignments.ClassHierarchies;

public class GameTerrainTester {
    public static void main(String[] args) {
        Mountain mountain = new Mountain(642, 806, "Mountain");
        WinterMountain winterMountain = new WinterMountain(547, 199);
        Forest forest = new Forest(226, 699, "Forest");
        DeadForest deadForest = new DeadForest(67, 150);
        Desert desert = new Desert(279, 638);

        System.out.println(mountain.getTerrainSize());
        System.out.println(winterMountain.getTerrainSize());
        System.out.println(forest.getTerrainSize());
        System.out.println(deadForest.getTerrainSize());
        System.out.println(desert.getTerrainSize());
    }
}
