package subTask4;

public class House {
    public int windows;
    public int doors;
    public int walls;
    boolean roof;
    boolean garage;
    boolean swimmingPool;
    boolean garden;
    boolean statues;

    public House(HouseBuilder builder) {
    this.walls= builder.walls;
    this.garden=builder.garden;
    this.statues=builder.statues;
    this.swimmingPool= builder.swimmingPool;
    this.doors=builder.doors;
    this.garage=builder.garage;
    this.roof=builder.roof;
    this.windows=builder.windows;
    }


    @Override
    public String toString() {
        return "House{" +
                ", windows=" + windows +
                ", doors=" + doors +
                ", walls=" + walls +
                ", roof=" + roof +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", garden=" + garden +
                ", statues=" + statues +
                '}';
    }

    public static class HouseBuilder implements Builder {
        public int windows;
        public int doors;
        public int walls;
        boolean roof;
        boolean garage;
        boolean swimmingPool;
        boolean garden;
        boolean statues;


        @Override
        public Builder buildWalls(int walls) {
            this.walls = walls;
            return this;
        }

        @Override
        public Builder buildWindows(int windows) {
            this.windows = windows;
            return this;
        }

        @Override
        public Builder buildDoors(int doors) {
            this.doors = doors;
            return this;
        }

        @Override
        public Builder hasRoof(boolean roof) {
            this.roof = roof;
            return this;
        }

        @Override
        public Builder hasGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        @Override
        public Builder hasSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        @Override
        public Builder hasGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        @Override
        public Builder hasStatues(boolean statues) {
            this.statues = statues;
            return this;
        }

        @Override
        public House getResult() {
            return new House(this);
        }
    }
}