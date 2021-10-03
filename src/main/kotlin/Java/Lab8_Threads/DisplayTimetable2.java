package Java.Lab8_Threads;

public class DisplayTimetable2 {
    private TimeTable timetableTrains = new TimetableTrainsProxy();

    public void printTimetable() {
        String[] timetable = timetableTrains.getTimetable();
        String[] tmpArr;
        System.out.println("Поезд\tОткуда\tКуда\t\tВремя отправления\tВремя прибытия\tВремя в пути");
        for(int i = 0; i < timetable.length; i++) {
            tmpArr = timetable[i].split(";");
            System.out.printf("%s\t%s\t%s\t\t%s\t\t\t\t%s\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2], tmpArr[3], tmpArr[4], tmpArr[5]);
        }
    }
}
