package Java;

public class FactoryBuilderJava {
    public BuilderInterface getAuto(String autoType){
        if(autoType == null){
            return null;
        }
        if(autoType.equalsIgnoreCase("Truck")){
            return new TruckBuilderForFabricJava();

        } else if(autoType.equalsIgnoreCase("Car")) {
            return new CarBuilderForFabric();
        }
        return null;
    }
}
