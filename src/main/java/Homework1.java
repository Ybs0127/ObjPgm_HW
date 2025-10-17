package main.java;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String stringInput = sc.next();
        System.out.println(" 정수 입력: ");
        int integerInput = sc.nextInt();
        System.out.println("문자열 출력: " + stringInput);
        System.out.println("정수 출력: " + integerInput);

    }
}
