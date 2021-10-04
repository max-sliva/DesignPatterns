package Java.Lab8_Threads;

import javax.swing.*;
import java.awt.*;

public class ProxyDemo2 {
    private static TimeTable timetableTrains= new TimetableTrainsProxy();

    public static void main(String[] args) {
        System.out.println("Расписание");
        DisplayTimetable2 displayTimetable = new DisplayTimetable2();
        displayTimetable.printTimetable();

        createGUI();
    }

    private static void createGUI() {
        JFrame myFrame = new JFrame("Расписание");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setCenterTable(myFrame);
        setSouth(myFrame);

        myFrame.setSize(600, 400);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
    }

    private static void setSouth(JFrame frame) {
        JLabel southLabel = new JLabel(timetableTrains.getTimetableInfo());
        frame.add(southLabel, BorderLayout.SOUTH);
    }

    private static void setCenterTable(JFrame frame) {
        String[] timetable = timetableTrains.getTimetable();
        String[] header = {"Поезд","Откуда", "Куда", "Время отправления", "Время прибытия", "Время в пути"};
        String[][] tableArray = new String[timetable.length][6];
        for(int i = 0; i < timetable.length; i++) {
            tableArray[i] = timetable[i].split(";");
        }
        JTable centerTable = new JTable(tableArray, header);
        JScrollPane scrollPane = new JScrollPane(centerTable);
        centerTable.setFillsViewportHeight(true);
        frame.add(scrollPane, BorderLayout.CENTER);
    }

}
