package Java.Lab3;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
