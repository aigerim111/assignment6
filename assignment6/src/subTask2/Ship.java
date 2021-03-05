package subTask2;

public class Ship implements Transport{
    @Override
    public String deliver(String stuffName) {
      return "by sea";
    }
}
