package main.java;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 개수 입력: ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
        sc.close();
    }
}
