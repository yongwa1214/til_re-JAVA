package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        /*
        0~9 랜덤값 구한다. 예를 들어 7이 나왔다. 0번방과 7번방 스와핑한다.
        0~9 랜덤값 구한다. 예를 들어 8이 나왔다. 1번방과 8번방 스와핑한다.
        0~9 랜덤값 구한다. 예를 들어 5이 나왔다. 2번방과 9번방 스와핑한다.
        */



        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 10);
            int temp = arr[i];
            arr[i] = arr[rand] ;
            arr[rand] = temp;

        }
            System.out.println(Arrays.toString(arr));
    }
}
