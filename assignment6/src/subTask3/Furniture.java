package subTask3;

interface Chair {
    public void hasLegs();
}
interface CoffeeTable{
    public void hasLegs();
}
interface Sofa{
    public void hasLegs();
}
interface FurnitureFactory{
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}

//Modern Furniture
class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}


class ModernChair implements Chair {
    public ModernChair(){
        System.out.println("You have ordered modern chair");
    }
    @Override
    public void hasLegs() {
        System.out.println("That modern chair has legs");
    }
}
class ModernCoffeeTable implements CoffeeTable {
    public ModernCoffeeTable(){
        System.out.println("You have ordered modern coffee table");
    }

    @Override
    public void hasLegs() {
        System.out.println("That modern coffee table has legs");
    }
}
class ModernSofa implements Sofa {
    public ModernSofa(){
        System.out.println("You have ordered modern sofa");
    }

    @Override
    public void hasLegs() {
        System.out.println("That modern sofa has legs");
    }
}

//Victorian Furniture
class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}


class VictorianChair implements Chair {
    public VictorianChair(){
        System.out.println("You have ordered victorian chair");
    }
    @Override
    public void hasLegs() {
        System.out.println("That victorian chair has legs");
    }
}
class VictorianCoffeeTable implements CoffeeTable {
    public VictorianCoffeeTable(){
        System.out.println("You have ordered victorian coffee table");
    }

    @Override
    public void hasLegs() {
        System.out.println("That victorian coffee table has legs");
    }
}
class VictorianSofa implements Sofa {
    public VictorianSofa(){
        System.out.println("You have ordered victorian sofa");
    }

    @Override
    public void hasLegs() {
        System.out.println("That victorian sofa has legs");
    }
}


