package Java.Lab4;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.openjdk.jol.info.ClassLayout;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Demo {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println("trees size = "+ObjectSizeCalculator.getObjectSize(forest.getTrees()));
        System.out.println("1 tree size is "+ClassLayout.parseClass(Tree.class).toPrintable());
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 ) +
                "KB (instead of " + ((TREES_TO_DRAW * 38) / 1024 ) + "KB)");
    }

    private static int random(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }
}
