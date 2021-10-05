package Java.Lab8_Threads;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class UpdateThread extends Thread{
    File file;
    FileTime lastModifiedTime;
    JTable table;

    public UpdateThread(File file, JTable centerTable){
        this.file = file;
        try {
            BasicFileAttributes attr = Files.readAttributes(this.file.toPath(), BasicFileAttributes.class);
            lastModifiedTime = attr.lastModifiedTime();
        } catch (IOException e) {
            e.printStackTrace();
        }
        table = centerTable;
    }

    @Override
    public void run() {
        while (true) {
            try {
                BasicFileAttributes attr = Files.readAttributes(this.file.toPath(), BasicFileAttributes.class);
                String old = ""+lastModifiedTime;
                if (!old.equals(""+attr.lastModifiedTime())){
                    System.out.println("!!Modified!!");
                    System.out.println("old = "+lastModifiedTime+", new = "+attr.lastModifiedTime());
                    lastModifiedTime = attr.lastModifiedTime();
                } else {
//                    System.out.println("!!Not Modified!!");
                }

                sleep(2000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
