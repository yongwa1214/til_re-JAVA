package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //int[] scores = {83, 90, 87};
        int[] scores;
        scores = new int[]{83, 90, 87, 20};
        System.out.println("main: " + Arrays.toString(scores));
        //printItem(scores);

        int[] arr = {10, 20, 30, 40, 50};
        printItem(arr);

    }
    //           보이드는 호출해도 아무값도 안 준다
    //           리턴타입 메소드명(파라미터(매개변수)) << typed 언어에 메소드 구성요소 이건 무조건 들어간다
    public static void printItem(int[] arr) {
        // System.out.println("printItem: " + Arrays.toString(arr));
        /*
        score[0]: 83
        score[1]: 90
        score[2]: 81
        */

       // 향상된 포문은 안된다
       // 왜? score[n]의 값을 그대로 가지고 오기 때문에 n값을 가져올 수가 없어서
        for(int i = 0; i < (arr).length; i++ ){
            System.out.printf("score [%d]: %d\n", i, (arr)[i]);
        }

    }
}
