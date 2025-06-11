package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final int NUM = 10;
        // num =20;
        final int num2;
        num2 = 10;
        //num2 = 20;

        /*
        final은 상수임
        - 한 번 넣으면 다시는 못 바꿈
        - final을 사용한 변수는 모두 대문자로 적을 것 스테이크 기법을 사용할 것
        */

        PrintStream ps = System.out;
        ps.println();

        // .을 찍을 수 있는 이유: 객체 주소값을 가지고 있어서
        System.out.println();

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge(); // immutable 수정할 수 없는 객체
        fo2.myAge();

    }


}
