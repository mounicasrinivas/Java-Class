package classAndObjects.practice.chocolates;

public class TestChocolate {
    public static void main(String[] args) {

        Chocolate dm = new Chocolate();
        System.out.println(dm.price);

        dm.name = "Dairy milk";
        System.out.println(dm.name);

        double tp = dm.totalPrice(dm.price);
        System.out.println(tp);

        double D = dm.Discount(dm.price);
        System.out.println(D);
    }

}
