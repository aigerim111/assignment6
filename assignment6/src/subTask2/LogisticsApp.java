package subTask2;

public abstract class LogisticsApp {
    public abstract Transport transportName();
}

class RoadLogistics extends LogisticsApp{
    public Transport transportName(){
        return new Truck();
    }
}

class SeaLogistics extends LogisticsApp{
    public Transport transportName(){
        return new Ship();
    }
}

 class Main{
    public static void main(String[] args) {
        LogisticsApp l=new SeaLogistics();
        LogisticsApp d=new RoadLogistics();
        System.out.println(l.transportName());
        System.out.println(d.transportName());
    }
}
