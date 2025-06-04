package ch02.sec01.method;

public class VariableUseMethodExample {
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


    public static void printTime(int hour, int min){

        //System.out.printf("%02d:%02d \n", hour, min);
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        String strMin = min < 10 ? "0" + min : String.valueOf(min);

        // valueOf : ()의 값을 String 으로 바꿔줌
        // toString 과의 차이점: toString은 값이 null 이면 NPE(null pointer exception) 발생(런타임 에러)
        //valueOf 는 null 을 출력

        System.out.println(strHour + ":" + strMin);
        // 3항식 문법 : 조건식 ? 반환값1 : 반환값2
        // ?>> 참일 때
        // :>> 거짓일 때


    }
    public static void printTime(int hour, int min, int sec){
       // System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        System.out.println(strHour + ":");
        printTime(min,sec);
    }
}
