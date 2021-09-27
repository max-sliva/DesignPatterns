package Java.Lab7;

public class WheelsDecorator extends PlatformDecorator{
    public WheelsDecorator(Platform platform) {
        super(platform);
    }

    @Override
    public void describe() {
        platform.describe();
        System.out.println("I have wheels.");
        ride();
    }

    public void ride(){
        System.out.println("I can ride.");
    }
}
