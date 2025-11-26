package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> userDB = new HashMap<>();
        Scanner sc = new Scanner(System.in);


        userDB.put("myId", "myPass");
        userDB.put("myId2", "myPass2");
        userDB.put("myId3", "myPass3");

        System.out.print("ID 입력: ");
        String id = sc.nextLine();

        System.out.print("PW 입력: ");
        String pw = sc.nextLine();

        if (!userDB.containsKey(id)) {
            System.out.println("로그인 실패 — 존재하지 않는 ID");
        }
        else if (!userDB.get(id).equals(pw)) {
            System.out.println("로그인 실패 — 비밀번호 오류");
        }
        else {
            System.out.println("로그인 성공 ✓ 환영합니다, " + id + "님!");
        }

        sc.close();
    }
}

