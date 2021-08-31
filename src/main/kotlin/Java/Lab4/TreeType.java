package Java.Lab4;

import java.awt.*;

public class TreeType {
    private String name; //название типа дерева
    private Color color; //цвет дерева
    private String otherTreeData; //доп. инфа

    public TreeType(String name, Color color, String otherTreeData) { //конструктор типа дерева
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) { //метод отрисовки дерева
        g.setColor(Color.BLACK); //цвет ствола дерева
        g.fillRect(x - 1, y, 3, 5); //рисуем ствол
        g.setColor(color); //цвет кроны дерева
        g.fillOval(x - 5, y - 10, 10, 10); //рисуем крону
    }
}
