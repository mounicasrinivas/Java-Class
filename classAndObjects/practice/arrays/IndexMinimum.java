package practice.arrays;

import java.util.*;

public class IndexMinimum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int a[] = new int[z];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int minindex = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
                minindex = i;
            }
        }
        System.out.println(minindex);
    }

}
