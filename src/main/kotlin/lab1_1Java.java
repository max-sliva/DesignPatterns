public class lab1_1Java {
    public static void main(String[] args) {
        AutoJava auto1 = new AutoJava("Lada", "K105PH");
        AutoJava auto2 = new AutoJava("Ford", "A2435OP");
        GarageJava gar1 = GarageJava.getInstance(auto1);
        GarageJava gar2 = GarageJava.getInstance(auto2);
        gar1.printGarage();
    }
}
