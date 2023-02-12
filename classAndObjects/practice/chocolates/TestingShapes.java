package classAndObjects.practice.chocolates;

public class TestingShapes {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Square s = new Square();

        int area = s.area(5);
        System.out.println(area);

        int Area = r.area(1, 2);
        System.out.println(Area);

        System.out.println(s.color);
        System.out.println(r.color);

    }

}
