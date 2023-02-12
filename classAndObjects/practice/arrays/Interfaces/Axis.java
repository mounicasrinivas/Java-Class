package classAndObjects.practice.arrays.Interfaces;

public class Axis implements CreditCard {

    @Override
    public int price(int a) {
        return a - 20;

    }

    @Override
    public void name() {
        System.out.println("Axis bank");
    }

}
