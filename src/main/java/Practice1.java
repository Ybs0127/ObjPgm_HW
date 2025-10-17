package main.java;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String stringInput = "";
        String key = "";

        while(true){
            System.out.println("===메뉴===");
            System.out.println("i: 문자열 입력");
            System.out.println("o: 문자열 출력(글자수, 단어수 포함)");
            System.out.println("s: 문자열 찾기");
            System.out.println("r: 문자열 바꾸기");
            System.out.println("h: 도움말");
            System.out.println("e: 종료");

            System.out.println("선택: ");
            key = scanner.nextLine().trim().toLowerCase();;

            switch(key){
                case "i":
                    System.out.println("문자열을 입력하세요: ");
                    stringInput = scanner.nextLine();
                    break;

                case "o":
                    int wordCount = stringInput.trim().isEmpty() ? 0
                            : stringInput.trim().split("\\s+").length;
                    System.out.println("현재 문자열: "+ stringInput);
                    System.out.printf("글자 수: %d\n", stringInput.length());
                    System.out.printf("단어 수: %d\n", wordCount);
                    break;

                case "s":
                    System.out.println("찾을 문자열을 입력하세요: ");
                    String target = scanner.nextLine();

                    if(target.isEmpty()){
                        System.out.println("문자열을 찾을 수 없습니다.");
                        break;
                    }

                    int count = 0;
                    int index = 0;

                    while ((index = stringInput.indexOf(target, index)) != -1) {
                        count++;
                        index += target.length();
                    }
                    System.out.println("'" + target + "'이/가 " + count + "회 존재합니다.");
                    break;

                case "r":
                    System.out.println("찾을 문자열을 입력하세요: ");
                    String findString = scanner.nextLine();
                    System.out.println("바꿀 문자열을 입력하세요: ");
                    String replacement = scanner.nextLine();
                    stringInput = stringInput.replace(findString, replacement);
                    System.out.println("변경된 문자열: " + stringInput);

                    break;

                case "h":
                    System.out.println("===메뉴===");
                    System.out.println("i: 문자열 입력");
                    System.out.println("o: 문자열 출력(글자수, 단어수 포함)");
                    System.out.println("s: 문자열 찾기");
                    System.out.println("r: 문자열 바꾸기");
                    System.out.println("h: 도움말");
                    System.out.println("e: 종료");
                    break;

                case "e":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
                    break;

        }
        }
    }
}
