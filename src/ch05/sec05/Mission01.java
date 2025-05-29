package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    /*
    주민번호를 입력하시오.
    (만약) 주민등록번호 길이가 다르면 "잘못입력하셨습니다."
    (길이가 맞다면) 8번째 자리 남자 여자 구분하기
    */
    public static void main(String[] args) {
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민번호를 입력하시오. 예)123456-1234567 \n>> ");
        String ssn = scanner.next();

            if (ssn.length() == 14) {
                char gender = ssn.charAt(7);
                if (gender == '1' || gender == '3') {
                    System.out.println("남성");
                    break;
                } else if (gender == '2' || gender == '4') {
                    System.out.println("여성");
                    break;
                } else {
                    System.out.println("잘못 입력하셨습니다");
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
