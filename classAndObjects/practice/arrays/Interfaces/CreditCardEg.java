package classAndObjects.practice.arrays.Interfaces;

public class CreditCardEg {

    public static void main(int[] args) {
        CreditCard c = getCreditCard(1);
        System.out.println(c.price(300));
    }

    public static CreditCard getCreditCard(int i) {
        if (i == 1) {
            return new HDFC();
        } else if (i == 2) {
            return new SBI();
        } else {
            return new Axis();
        }
    }
}
