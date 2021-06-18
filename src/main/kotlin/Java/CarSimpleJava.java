package Java;

public class CarSimpleJava {
    private String firm;
    private String model;
    private float vEngine;
    private int maxSpeed;
    private int doors;
    private String color;
    private int year;

    public CarSimpleJava(String firm, String model, float vEngine, int maxSpeed, int doors, String color, int year) {
        this.model = model;
        this.firm = firm;
        this.vEngine = vEngine;
        this.maxSpeed = maxSpeed;
        this.doors = doors;
        this.color = color;
        this.year = year;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setvEngine(float vEngine) {
        this.vEngine = vEngine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
