package ch04.sec04.method;

import java.sql.SQLOutput;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2, 6); // [2,3,4,5,6]

    }


    //1. 배열 만들기
    //2. 배열에 값 집어넣기(
    //3.
    public static void printNumberFromTo(int n1, int n2) {

        int[] arr = new int[n2+1];
        System.out.print("[");
        for (int i = n1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print((arr[i] == n1) ? arr[i] : ", " + arr[i]);

//            if(arr[i]== n1) {
//                System.out.print(arr[i]);
//            }
//            System.out.print(", " + arr[i]);
        }
        System.out.print("]");
    }
}
