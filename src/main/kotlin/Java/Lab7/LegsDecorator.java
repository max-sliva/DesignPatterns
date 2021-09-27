package Java.Lab7;

public class LegsDecorator extends PlatformDecorator{
    public LegsDecorator(Platform platform) {
        super(platform);
    }

    @Override
    public void describe() {
        platform.describe();
        System.out.println("I have legs.");
        walk();
    }

    public void walk(){
        System.out.println("I can walk.");
    }
}
