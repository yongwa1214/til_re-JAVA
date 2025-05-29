package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;

        arr1 = new int[] {1, 2 ,3};
        arr2 = new int[] {1, 2 ,3};
        // arr1 과 arr2 에는 다른 주소값이 들어가있음
        arr3 = arr2;
        System.out.println(arr1 == arr2);// false
        System.out.println(arr2 == arr3);// true


    }
}
