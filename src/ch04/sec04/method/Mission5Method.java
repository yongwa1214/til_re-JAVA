package ch04.sec04.method;

public class Mission5Method {
    public static void main(String[] args) {
        int[] arr = {10, 70, 90, 110, 4};
        int sum = addAllUpArray(arr);
        // System.out.println(sum);
        int[] arr2 = {1, 2, 10, 80, 77};
        // System.out.println("sum2: " + addAllUpArray(arr2));
    }
    public static int addAllUpArray(int[] arr){
        int sum = 0;
//        for(int i = 0; i <arr.length; i++){
//            sum += arr[i];
//        }
        for(int item : arr){
            sum += item;
        }
        return sum ;

    }
}
