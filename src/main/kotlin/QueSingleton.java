public class QueSingleton {
    private static QueSingleton _instance = null;
    private  static int count = 0;
    private QueSingleton() {}

    public static int getCount() {
        return count;
    }

    public static synchronized QueSingleton getInstance() {
        if (_instance == null)
            _instance = new QueSingleton();
        count++;
        return _instance;
    }
}
