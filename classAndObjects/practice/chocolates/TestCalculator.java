
package classAndObjects.practice.chocolates;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        int add = c1.addition(10, 20);
        System.out.println(add);

        int sub = c1.subtraction(10, 30);
        System.out.println(sub);

        int multi = c1.multiplication(20, 20);
        System.out.println(multi);

        int divi = c1.division(50, 2);
        System.out.println(divi);
    }

}
