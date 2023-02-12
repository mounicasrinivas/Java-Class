package classAndObjects;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.name);

        e1.name = "Vamsi";
        System.out.println(e1.name);

        Employee e2 = new Employee();
        System.out.println(e2.name);
    }
}
