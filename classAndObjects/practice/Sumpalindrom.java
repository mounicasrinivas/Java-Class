package practice;

//write a program to print the sum of palindrom numbers present between 11 to 200 
public class Sumpalindrom {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 11; i <= 200; i++) {
            int n = i;
            int temp = n;
            int rev = 0;
            while (temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (n == rev) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
