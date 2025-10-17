//import java.util.Scanner;
//
//public class Project1 {
//    static String text = "";
//
//    static void inputString(Scanner sc) {
//        System.out.print("문자열을 입력하세요: ");
//        text = sc.nextLine();
//    }
//
//    static void outputString() {
//        if (text.isEmpty()) {
//            System.out.println("현재 저장된 문자열이 없습니다.");
//            return;
//        }
//
//        System.out.println("현재 문자열: " + text);
//        System.out.println("글자 수: " + text.length());
//
//        String[] words = text.trim().split("\\s+");
//        int wordCount = 0;
//        if (!text.trim().isEmpty()) wordCount = words.length;
//        System.out.println("단어 수: " + wordCount);
//    }
//
//    static void searchString(Scanner sc) {
//        if (text.isEmpty()) {
//            System.out.println("현재 저장된 문자열이 없습니다.");
//            return;
//        }
//
//        System.out.print("찾을 문자열을 입력하세요: ");
//        String target = sc.nextLine();
//
//        if (target.isEmpty()) {
//            System.out.println("문자열을 찾을 수 없습니다.");
//            return;
//        }
//
//        int count = 0;
//        int index = 0;
//        while (true) {
//            index = text.indexOf(target, index);
//            if (index == -1) break;
//            count++;
//            index += target.length();
//        }
//
//        if (count == 0) {
//            System.out.println("문자열을 찾을 수 없습니다.");
//        } else {
//            System.out.println("'" + target + "'이/가 " + count + "회 존재합니다.");
//        }
//    }
//
//    static void replaceString(Scanner sc) {
//        if (text.isEmpty()) {
//            System.out.println("현재 저장된 문자열이 없습니다.");
//            return;
//        }
//
//        System.out.print("찾을 문자열을 입력하세요: ");
//        String target = sc.nextLine();
//
//        System.out.print("바꿀 문자열을 입력하세요: ");
//        String replacement = sc.nextLine();
//
//        if (target.isEmpty()) {
//            System.out.println("바뀐 게 없습니다.");
//            return;
//        }
//
//        int count = 0;
//        int index = 0;
//        while (true) {
//            index = text.indexOf(target, index);
//            if (index == -1) break;
//            count++;
//            index += target.length();
//        }
//
//        if (count == 0) {
//            System.out.println("바뀐 게 없습니다.");
//            return;
//        }
//
//        text = text.replace(target, replacement);
//        System.out.println("변경된 문자열: " + text);
//        System.out.println("'" + target + "'이/가 " + count + "번 바뀌었습니다.");
//    }
//
//    static void printMenu() {
//        System.out.println("=== 메뉴 ===");
//        System.out.println("i: 문자열 입력");
//        System.out.println("o: 문자열 출력 (글자수, 단어수 포함)");
//        System.out.println("s: 문자열 찾기");
//        System.out.println("r: 문자열 바꾸기");
//        System.out.println("h: 도움말");
//        System.out.println("e: 종료");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        printMenu();
//
//        while (true) {
//            System.out.print("\n선택: ");
//            String cmd = sc.nextLine().trim().toLowerCase();
//
//            switch (cmd) {
//                case "i":
//                    inputString(sc);
//                    break;
//                case "o":
//                    outputString();
//                    break;
//                case "s":
//                    searchString(sc);
//                    break;
//                case "r":
//                    replaceString(sc);
//                    break;
//                case "h":
//                    printMenu();
//                    break;
//                case "e":
//                    System.out.println("프로그램을 종료합니다.");
//                    sc.close();
//                    return;
//                default:
//                    System.out.println("잘못된 선택입니다.");
//                    break;
//            }
//        }
//    }
//}
