package OOPS;

public class Challenge1 {
    public double length;
    public double breath;

    public double area() {
        return length * breath;
    }

    public double perimeter() {
        return 2 * (length + breath);
    }

    public boolean isSquare() {
        return length == breath;
    }
}
