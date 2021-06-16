package Java;

public class SingletonJava {
    private static SingletonJava _instance = null;
    private int field = 0;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    private SingletonJava() {}

    public static synchronized SingletonJava getInstance() {
        if (_instance == null)
            _instance = new SingletonJava();
        return _instance;
    }
}