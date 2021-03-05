package subTask4;

public class Director {
    public void constructHouseWithSwimmingPool(Builder builder){
        builder.buildWalls(16);
        builder.buildDoors(6);
        builder.buildWindows(12);
        builder.hasSwimmingPool(true);
        builder.hasGarden(true);
        builder.hasRoof(true);
    }
}
