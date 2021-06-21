package Java;

public class CarBuilderForFabric implements BuilderInterface {
    private CarForBuilderJava newCar;

    public CarBuilderForFabric() {
        newCar = new CarForBuilderJava();
    }

    public CarBuilderForFabric withFirm(String firm) {
        newCar.setFirm(firm);
        return this;
    }

    public CarBuilderForFabric withModel(String model) {
        newCar.setModel(model);
        return this;
    }

    public CarBuilderForFabric withEngine(float Engine) {
        newCar.setvEngine(Engine);
        return this;
    }

    public CarBuilderForFabric withMaxSpeed(int maxSpeed) {
        newCar.setMaxSpeed(maxSpeed);
        return this;
    }

    public CarBuilderForFabric withDoors(int doors) {
        newCar.setDoors(doors);
        return this;
    }

    public CarBuilderForFabric withColor(String color) {
        newCar.setColor(color);
        return this;
    }

    public CarBuilderForFabric withYear(int year) {
        newCar.setYear(year);
        return this;
    }

    public CarForBuilderJava build() {
        return newCar;
    }
}
