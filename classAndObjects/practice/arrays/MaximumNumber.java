package practice.arrays;

import java.util.*;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b[] = new int[x];

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int max = b[0];

        for (int i = 0; i < b.length; i++) {

            if (b[i] > max) {
                max = b[i];

            }
        }
        System.out.println(max);
    }
}
