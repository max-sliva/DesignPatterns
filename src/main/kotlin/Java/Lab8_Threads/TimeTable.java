package Java.Lab8_Threads;

import java.io.File;

public interface TimeTable {
    String[] getTimetable();
    String getTrainDepartureTime(String trainId);
    String getTimetableInfo();
    File getFile();

}
