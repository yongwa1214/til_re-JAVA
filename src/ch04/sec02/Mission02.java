package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    private static Object Scanner;

    /*
        점수를 입력 받는다.
        점수를 입력해 주세요> 99(점수 입력 후 엔터)
        (100초과 혹은 0미만이면)"잘못된 점수 입니다."
        (90점 이상) "A"
        (80점 이상) "B"
        (70점 이상) "c"
        (나머지) "D"
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("점수를 입력해 주세요> ");
        String strnum = scanner.next();

        try {
            int score = Integer.parseInt(strnum);
            if (score > 100 || 0 < score) {
                System.out.println("잘못된 점수입니다.");
            } else if (score > 89) {
                System.out.print("A");
            } else if (score > 79) {
                System.out.print("B");
            } else if (score > 69) {
                System.out.print("C");
            } else {
                System.out.print("D");
            }
            System.out.println("등급");
        } catch (Exception e){
            System.out.println("숫자만 입력해주세요.");
        }
    }
}
