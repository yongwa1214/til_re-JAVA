package ch02.sec01.method;

public class VariableUseMethodExample02 {
    public static void main(String[] args){
        printTime(10,20); // 10:
        printTime(2,12); // 10:

        printTime(12,9,22);
        printTime(2,9,2);
    }
    // 둘 다 가능하게 만들기
    //  hint: 오버로딩

    /*
    printf 안 쓰기
    1. hour가 2 min 이 2  nn:nn
    2. hour가 2 min 이 1  nn:0n
    3. hour가 1 min 이 2  0n:nn
    4. hour가 1 min 이 1  0n:0n

    */

    public static String parseTime(int val){
        return val < 10 ? "0" + val : String.valueOf(val);
    }

    public static void printTime(int time1, int time2){
        System.out.println(parseTime(time1) + ":" + parseTime(time2));
    }

    public static void printTime(int hour, int min, int sec){
        System.out.print(parseTime(hour)+ ":");
        printTime(min,sec);
    }
}
