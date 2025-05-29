package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 동일성(identity) >> 주소값이 같다면 동일하다라고 한다. (== 비교)
        // 동등성(equality) >> 값이 같다면 동등하다.(equals 메소드)

        System.out.println(strVar1 == strVar2); // true 동일함 주소값이 같다
        System.out.println(strVar1.equals(strVar2)); // true 동등하다 같은 "홍길동" 이라는 값을 가짐

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println(strVar3 == strVar4); // false 동일하지 않다 다른 주소값을 가짐
        System.out.println(strVar3.equals(strVar4)); // 동등하다 같은 "홍길동" 이라는 값이다
    }
}
