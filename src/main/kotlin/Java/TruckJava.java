package Java;

public class TruckJava implements AutoInterface {
    private String model = "SomeTruck";
    private String nomer = "truckNomer";
    private int power = 500;

    @Override
    public String getInfo() {
        return "Truck = " + model +" " + nomer +" " + power;
    }
}
