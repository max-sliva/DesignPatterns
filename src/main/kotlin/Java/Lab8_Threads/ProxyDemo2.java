package Java.Lab8_Threads;

public class ProxyDemo2 {
    public static void main(String[] args) {
        System.out.println("Расписание");
        DisplayTimetable2 displayTimetable = new DisplayTimetable2();
        displayTimetable.printTimetable();

    }
}
