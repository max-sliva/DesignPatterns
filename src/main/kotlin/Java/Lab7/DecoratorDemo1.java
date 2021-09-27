package Java.Lab7;

public class DecoratorDemo1 {
    public static void main(String[] args) {
        Platform platform = new BasePlatform();
        platform.describe();
        System.out.println();

        platform = new LegsDecorator(platform);
        platform.describe();
        System.out.println();

        platform = new WheelsDecorator(platform);
        platform.describe();

    }
}
