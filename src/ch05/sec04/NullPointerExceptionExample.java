package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] arr = null;
        //arr[0] =10;
        // null 인 애한테는 아무것도 시키면 안됨 뭐 넣는순간 null pointer exception 이 뜬다
        System.out.println(arr.length); // null pointer exception
    }
}
