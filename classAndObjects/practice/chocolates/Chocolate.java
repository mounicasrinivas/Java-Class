package classAndObjects.practice.chocolates;

public class Chocolate {
    public String name = "Cadbury";
    public int price = 10;
    public boolean availability = false;

    public double totalPrice(int p) {
        double gst = 10;
        double totalPrice = p + (p * (gst / 100));
        return totalPrice;
    }

    public double Discount(double p) {
        double gst = 20;
        double Discount = p - (p * (gst / 100));
        return Discount;

    }
}
