package Java;

public class lab2_2 {
    public static void main(String[] args) {
        CarSimpleJava myCar = new CarSimpleJava("Lada", "Kalina", 2.6f, 200, 4, "Белый", 2010);

        CarBuilderJava myCar2 = new CarBuilderJava.Builder()
                .withFirm("Lada")
                .withModel("Kalina")
                .withEngine(2.6f)
                .withMaxSpeed(200)
                .withDoors(4)
                .withColor("Белый")
                .withYear(2010)
                .build();
        System.out.println("car = "+myCar2);
//todo объединить фабрику и строитель
    }
}
