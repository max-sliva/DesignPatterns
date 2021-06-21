package Java;

public class lab2_mix {
    public static void main(String[] args) {
        FactoryBuilderJava autoFactory = new FactoryBuilderJava();
        CarBuilderForFabric myCarBuilder = (CarBuilderForFabric) autoFactory.getAuto("Car");
        TruckBuilderForFabricJava myTruckBuilder = (TruckBuilderForFabricJava) autoFactory.getAuto("Truck");
        CarForBuilderJava myCar = myCarBuilder.withFirm("Lada")
                .withModel("Kalina")
                .withEngine(2.6f)
                .withMaxSpeed(200)
                .withDoors(4)
                .withColor("Белый")
                .withYear(2010)
                .build();

        System.out.println(myCar.getInfo());
//        System.out.println(myTruck.getInfo());
    }
}
