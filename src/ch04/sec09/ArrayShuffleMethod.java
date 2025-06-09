package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5, 8);  // [5, 6, 7]
        int[] arr2 = makeArrayFromTo(15, 25);  // [15, 16, 17, 18, 19]
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));

        shuffleArray(arr);
        shuffleArray(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    /*
    1. 공간 할당
    2. 공간 마다 값을 넣음
    2.1. arr[0] = n1+0
    2.2  arr[1] = n1+1
    2.3  arr[2] = n1+2
    >> 변하는 값 0,1,2... 부분
    >> arr[i] = n1 + i
    */
    public static int[] makeArrayFromTo(int n1, int n2){
        int[] arr = new int[n2-n1];
        for(int i = 0; i < arr.length; i++){
            arr[i]=n1+i;

        }
        return arr;
    }
    public static void shuffleArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int rand = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand]= temp;
        }

    }
}
