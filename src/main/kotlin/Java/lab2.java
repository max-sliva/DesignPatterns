package Java;

public class lab2 {
    public static void main(String[] args) {
        AutoFactoryJava autoFactory = new AutoFactoryJava();
        CarJava myCar = (CarJava) autoFactory.getAuto("Car");
        TruckJava myTruck = (TruckJava) autoFactory.getAuto("Truck");
        System.out.println(myCar.getInfo());
        System.out.println(myTruck.getInfo());
    }
}
