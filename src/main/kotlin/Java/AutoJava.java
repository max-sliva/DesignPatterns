package Java;

public class AutoJava {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private String gosNomer;// закрытый член класса, содержащий максимальную скорость
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma;
//значения фирмы автомобиля
    }
    public void setGosNomer(String nomer){ //открытая функция (метод класса) для задания
        gosNomer=nomer;
//значения максимальной скорости автомобиля
    }
    public String getGosNomer(){ //открытая функция (метод класса) для вывода значения
        return gosNomer;
//максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm;
//заданной фирмы
    }
    public AutoJava(){
// конструктор класса (без параметров)
        firm="Без названия";
        gosNomer="";
    }
    public AutoJava(String firma, String nomer){ //конструктор класса (с параметрами)
        firm=firma;
        gosNomer=nomer;
    }

    public String toString(){
        return firm+" "+gosNomer;
    }
}
