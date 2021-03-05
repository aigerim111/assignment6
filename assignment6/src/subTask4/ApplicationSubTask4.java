package subTask4;

public class ApplicationSubTask4 {
    public static void main(String[] args) {
        Director d=new Director();
        House.HouseBuilder hb=new House.HouseBuilder();
        d.constructHouseWithSwimmingPool(hb);
        House house=hb.getResult();
        System.out.println(house.toString());
    }
}
