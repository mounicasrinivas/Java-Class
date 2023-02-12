package practice.arrays;

import java.util.*;

public class AddArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a[] = new int[x];
        int b[] = new int[x];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}
