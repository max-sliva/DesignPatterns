package Java.Lab4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>(); //список для хранения деревьев (лес)

    //метод для добавления дерева с нужными параметрами в лес
    public List<Tree> getTrees() {
        return trees;
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);  //получаем тип нужного дерева
        Tree tree = new Tree(x, y, type); //получаем дерево нужного типа
        trees.add(tree);  //добавляем дерево в список
    }

    @Override
    public void paint(Graphics graphics) { //переопределяем метод для отрисовки окна
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}