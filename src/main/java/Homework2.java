import java.util.Scanner;
class Student{
    int studentId;
    String name;
    String major;
    String phoneNumber;

    Student(int studentId, String name, String major, String phoneNumber){
        this.studentId=studentId;
        this.name=name;
        this.major=major;
        this.phoneNumber=phoneNumber;
    }
    int getStudentId(){return studentId;}
    String getName(){return name;}
    String getMajor(){return major;}
    String getFormattedPhoneNumber() {
        String first = phoneNumber.substring(0, 4);
        String second = phoneNumber.substring(4);
        return "010-" + first + "-" + second;
    }
}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            String phoneInput = sc.next();
            String phone = phoneInput.substring(3);

            students[i] = new Student(id, name, major, phone);
        }
        sc.close();

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        String[] ordinal = {"첫번째", "두번째", "세번째"};

        for (int i = 0; i < 3; i++) {
            Student s = students[i];
            System.out.println(
                    ordinal[i] + " 학생: " +
                            s.getStudentId() + " " +
                            s.getName() + " " +
                            s.getMajor() + " " +
                            s.getFormattedPhoneNumber()
            );
        }
    }
}
