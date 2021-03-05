package subTask2;

public class Truck implements Transport{
    @Override
    public String deliver(String stuffName) {
        return "by land";
    }
}
