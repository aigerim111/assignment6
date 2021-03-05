package subTask4;

public interface Builder {
    Builder buildWalls(int walls);
    Builder buildWindows(int windows);
    Builder buildDoors(int doors);
    Builder hasRoof(boolean roof);
    Builder hasGarage(boolean garage);
    Builder hasSwimmingPool(boolean swimmingPool);
    Builder hasGarden(boolean garden);
    Builder hasStatues(boolean statues);
    House getResult();
}


