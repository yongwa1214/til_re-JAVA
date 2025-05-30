package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main (String[] args){
        // 배열 공간 먼저 확보
        int[] arr1 = new int[3];

        for(int i = 0; i< arr1.length; i++){
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        System.out.println();
        for(int i = 0; i<arr1.length; i++){
            // int rand = (int)(Math.random() * 100) + 1;
            // arr1[i] = rand;
            arr1[i] = (i+1) * 10;
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]); // 읽기랑 쓰기랑은 분리하는 습관을 들이세요
        }
    }
}
