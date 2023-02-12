package practice.arrays;

import java.util.*;

public class AverageArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int a[] = new int[l];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum = sum + sc.nextInt();
        }
        double average = sum / l;
        System.out.println(average);
    }

}