package OOPS.Challenge2;

public class CyclinderTest {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.heigth = 10;
        c.radius = 7;
        System.out.println(c.lidArea());
        System.out.println(c.volume());
        System.out.println(c.totalSurfaceArea());
        System.out.println(c.circumference());
    }
}
