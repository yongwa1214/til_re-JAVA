package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1  = 10 +2 + 8;
        System.out.println("result1: " + result1);

        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); // 128
        // 10 + 2 = 12
        // 12(int) + 8(String)
        // 12(String) + 8(String) >> 128(String)  // 이때 +는 연산자가 아닌 concat

        String result3 = 10 + "2" + 8;
        System.out.println("result2: " + result3); // 1028

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4); // 1028

         String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5); // 1010




    }
}
