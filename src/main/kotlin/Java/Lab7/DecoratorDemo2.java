package Java.Lab7;

public class DecoratorDemo2 {
    public static void main(String[] args) {
        Platform platform = new WheelsDecorator(new LegsDecorator(new BasePlatform()));
        platform.describe();
    }
}
