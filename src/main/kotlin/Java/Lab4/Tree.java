package Java.Lab4;

import java.awt.*;

public class Tree {
    private int x; //координаты дерева
    private int y;
    private TreeType type; //тип дерева

    public Tree(int x, int y, TreeType type) { //конструтор
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) { //метод для отрисовки дерева
        type.draw(g, x, y);
    }
}
