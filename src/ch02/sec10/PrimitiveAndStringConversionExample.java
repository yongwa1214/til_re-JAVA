package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 문자열을 바꾸고 싶으면 이렇게 해야한다 (파싱)
        // (int)"3.14" << 이런거 안됨
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);

        double value2 = Double.parseDouble("3.14");
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println(value3);

        long value4 = Long.parseLong("100000");

        int intValue = 10;
//        String str1 = "" + intValue;
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(value2);
        System.out.println(str1);

    }
}
