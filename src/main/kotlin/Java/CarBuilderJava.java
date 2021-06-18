package Java;

public class CarBuilderJava {
    private String firm;
    private String model;
    private float vEngine;
    private int maxSpeed;
    private int doors;
    private String color;
    private int year;

    public static class Builder {
        private CarBuilderJava newCar;

        public Builder() {
            newCar = new CarBuilderJava();
        }

        public Builder withFirm(String firm){
            newCar.firm = firm;
            return this;
        }

        public Builder withModel(String model){
            newCar.model = model;
            return this;
        }

        public Builder withEngine(float Engine){
            newCar.vEngine = Engine;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed){
            newCar.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withDoors(int doors){
            newCar.doors = doors;
            return this;
        }

        public Builder withColor(String color){
            newCar.color = color;
            return this;
        }

        public Builder withYear(int year){
            newCar.year = year;
            return this;
        }

        public CarBuilderJava build(){
            return newCar;
        }
    }

    @Override
    public String toString() {
        return "CarBuilderJava{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", vEngine=" + vEngine +
                ", maxSpeed=" + maxSpeed +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
