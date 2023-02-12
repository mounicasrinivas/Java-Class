package OOPS.Challenge2;

public class Cylinder {
    public double radius;
    public double heigth;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * heigth;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return lidArea() * heigth;
    }

}
