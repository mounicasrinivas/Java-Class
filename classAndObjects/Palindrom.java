public class Palindrom {

    public static void main(String[] args) {
        int n = 1234;
        int r = 0;
        int sum = 0;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        System.out.println(sum);
    }

}
