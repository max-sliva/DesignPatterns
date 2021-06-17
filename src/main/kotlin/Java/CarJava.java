package Java;

public class CarJava implements AutoInterface{
    private String model = "SomeCar";
    private String nomer = "carNomer";
    private int maxSpeed = 200;

    @Override
    public String getInfo() {
        return "Car = " + model +" " + nomer +" " + maxSpeed;
    }
}
