/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner aScanner = new Scanner(System.in);
        int t = aScanner.nextInt();
        while (t > 0) {
            int x = aScanner.nextInt();
            int y = aScanner.nextInt();

            if (x < y) {
                System.out.println("10");
            } else {
                System.out.println("x * 2");
            }
        }
        t--;
    }
}
