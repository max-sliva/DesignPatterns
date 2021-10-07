package Java.Lab8_Threads;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class UpdateThread extends Thread{
    FileTime lastModifiedTime;
    JTable table;
    private TableModel tableModel;
    private TimeTable timetableTrains;

    public UpdateThread(TimeTable timetableTrains, JTable centerTable){
        this.timetableTrains = timetableTrains;
        try {
            BasicFileAttributes attr = Files.readAttributes(this.timetableTrains.getFile().toPath(), BasicFileAttributes.class);
            lastModifiedTime = attr.lastModifiedTime();
        } catch (IOException e) {
            e.printStackTrace();
        }
        table = centerTable;
        tableModel = table.getModel();
    }

    @Override
    public void run() {
        while (true) {
            try {
                BasicFileAttributes attr = Files.readAttributes(this.timetableTrains.getFile().toPath(), BasicFileAttributes.class);
                String old = ""+lastModifiedTime;
                if (!old.equals(""+attr.lastModifiedTime())){
                    timetableTrains = new TimetableTrainsProxy();
                    System.out.println("!!Modified!!");
                    System.out.println("old = "+lastModifiedTime+", new = "+attr.lastModifiedTime());
                    DisplayTimetable2 displayTimetable = new DisplayTimetable2();
                    displayTimetable.printTimetable();
                    lastModifiedTime = attr.lastModifiedTime();
                    String[] timetable = timetableTrains.getTimetable();
//                    String[] header = {"Поезд","Откуда", "Куда", "Время отправления", "Время прибытия", "Время в пути"};
                    String[][] tableArray = new String[timetable.length][6];
                    for(int i = 0; i < timetable.length; i++) {
                        tableArray[i] = timetable[i].split(";");
                        for (int j = 0; j < 6; j++) {
                            tableModel.setValueAt(tableArray[i][j], i, j);
                        }
                    }
                }
                sleep(2000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
