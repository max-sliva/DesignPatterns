package Java.Lab4;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>(); //хеш-мап для типов деревьев
    //метод для получения нужного типа дерева
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name); //берем их хеш-мапа нужный тип
        if (result == null) { //если такого типа нет, то создаем его
            result = new TreeType(name, color, otherTreeData); //делаем его результатом метода
            treeTypes.put(name, result); //и помещаем новый тип в хеш-мап
        }
        return result; //и возвращаем дерево нужного типа
    }
}
