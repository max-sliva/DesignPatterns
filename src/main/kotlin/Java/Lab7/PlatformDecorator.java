package Java.Lab7;

public abstract class PlatformDecorator implements Platform{
    Platform platform;

    public PlatformDecorator(Platform platform) {
        this.platform = platform;
    }
}
