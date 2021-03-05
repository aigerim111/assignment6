package subTask3;

public class MainSubTask3 {
    public static void main(String[] args) {
        FurnitureFactory mf=new ModernFurnitureFactory();
        mf.createChair();
        mf.createCoffeeTable();
        mf.createSofa();
        FurnitureFactory vf=new VictorianFurnitureFactory();
        vf.createSofa();
        vf.createCoffeeTable();
        vf.createChair();
    }
}
