package OOPS;

public class Rectangle1 {

    public static void main(String[] args) {
        Challenge1 r = new Challenge1();
        r.length = 10.5;
        r.breath = 12.3;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
}
