package Java;

public class CarBuilder2 {
    private CarForBuilderJava newCar;

    public CarBuilder2() {
        newCar = new CarForBuilderJava();
    }

    public CarBuilder2 withFirm(String firm) {
        newCar.setFirm(firm);
        return this;
    }

    public CarBuilder2 withModel(String model) {
        newCar.setModel(model);
        return this;
    }

    public CarBuilder2 withEngine(float Engine) {
        newCar.setvEngine(Engine);
        return this;
    }

    public CarBuilder2 withMaxSpeed(int maxSpeed) {
        newCar.setMaxSpeed(maxSpeed);
        return this;
    }

    public CarBuilder2 withDoors(int doors) {
        newCar.setDoors(doors);
        return this;
    }

    public CarBuilder2 withColor(String color) {
        newCar.setColor(color);
        return this;
    }

    public CarBuilder2 withYear(int year) {
        newCar.setYear(year);
        return this;
    }

    public CarForBuilderJava build() {
        return newCar;
    }
}
