package Java;

public class AutoFactoryJava {
    public AutoInterface getAuto(String autoType){
        if(autoType == null){
            return null;
        }
        if(autoType.equalsIgnoreCase("Truck")){
            return new TruckJava();

        } else if(autoType.equalsIgnoreCase("Car")) {
            return new CarJava();
        }
        return null;
    }
}
