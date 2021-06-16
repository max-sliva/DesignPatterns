package Java;

import java.util.ArrayList;

public class GarageJava {
    private static GarageJava _instance = null;

    private static ArrayList<AutoJava> masCar=new ArrayList<AutoJava>();//массив с машинами
    public void addCar(AutoJava m){//метод для добавления машины в гараж
        masCar.add(m);
    }

    public GarageJava (){  }

    public static synchronized GarageJava getInstance(AutoJava m) {
        if (_instance == null)
            _instance = new GarageJava();
        masCar.add(m);
        printGarage();
        return _instance;
    }

    public static void printGarage() {//для вывода на экран списка машин в гараже
        System.out.println("В гараже: ");
        for (AutoJava a:masCar){ //
            System.out.println("\t"+a.toString());
        }
    }
}
