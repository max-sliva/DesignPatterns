package Java.Lab8_Threads;

import com.sun.javafx.logging.JFRInputEvent;

import javax.swing.*;
import java.awt.*;

public class ProxyDemo2 {
    public static void main(String[] args) {
        System.out.println("Расписание");
        DisplayTimetable2 displayTimetable = new DisplayTimetable2();
        displayTimetable.printTimetable();
        createGUI();
    }

    private static void createGUI() {
        JFrame myFrame = new JFrame("Расписание");
        setCenterTable(myFrame);
    }

    private static void setCenterTable(JFrame frame) {
        JTable centerTable = new JTable();

        frame.add(centerTable, BorderLayout.CENTER);
    }

}
