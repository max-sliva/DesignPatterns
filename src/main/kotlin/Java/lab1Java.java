package Java;

public class lab1Java{
    public static void main(String[] args){
//        SingletonJava mySingle1 = SingletonJava.getInstance();
//        SingletonJava mySingle2 = SingletonJava.getInstance();
//        mySingle1.setField(5);
//        System.out.println("mySingle2.field = "+mySingle2.getField());

        QueSingleton que1 = QueSingleton.getInstance();
        QueSingleton que2 = QueSingleton.getInstance();
        System.out.println("count = "+ QueSingleton.getCount());
    }
}