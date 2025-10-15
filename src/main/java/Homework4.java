package main.java;

import java.util.Scanner;

public class Homework4 {

    static int gcdRecursive(int a, int b) {
        if (b == 0) return a;
        return gcdRecursive(b, a % b);
    }

    static int gcdLoop(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("재귀 호출 결과: " + gcdRecursive(x, y));
        System.out.println("반복문 결과: " + gcdLoop(x, y));
        sc.close();
    }
}

