package main.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        Map<String, String> userDB = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split("\\s+");
                if (arr.length == 2) {
                    userDB.put(arr[0].trim(), arr[1].trim());
                }
            }

        } catch (Exception e) {
            System.out.println("db.txt 파일을 읽는 중 오류 발생");
            return;
        }

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();


            if (!userDB.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String pw = sc.nextLine().trim();


            if (!userDB.get(id).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}
