package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = new int[3];

        for(int i = 0; i <oldIntArray.length; i++){
            oldIntArray[i]= i+1;
        }
        //System.out.println(Arrays.toString(oldIntArray));

        /*
        newIntArray 에 oldIntArray 값을 복사하고
        oldIntArray[0] = 10; 을 넣었을 때
        oIA[0]만 10이 됐으면 좋겠다

        Hint: for문 사용

        1. 공간할당
        2. for 문을 활용하여 값을 복사한다
        ----

        */
        int [] newIntArray = new int[oldIntArray.length];
        /*
        오답.
        int [] newIntArray = oldIntArray >> 이건 주소값을 복사
        */

        for(int i = 0; i< newIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }
        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));

        oldIntArray[0] = 10;
        System.out.println("1: " + Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntArray));
    }
}
