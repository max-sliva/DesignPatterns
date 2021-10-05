package Java.Lab8_Threads;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Scanner;

public class TimetableTrains implements TimeTable {
    File timetableFile = new File("timeTable.csv");
    @Override
    public String[] getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(timetableFile));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error:  " + e);
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimetable();
        for(int i = 0; i<timetable.length; i++) {
            if(timetable[i].startsWith(trainId+";")) return timetable[i];
        }
        return "";
    }

    @Override
    public String getTimetableInfo(){
        String timetableInfo = "";
        try {
            BasicFileAttributes attr = Files.readAttributes(timetableFile.toPath(), BasicFileAttributes.class);
            timetableInfo = "lastModifiedTime: " + attr.lastModifiedTime();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return timetableInfo;
    }

    @Override
    public File getFile() {
        return timetableFile;
    }
}
