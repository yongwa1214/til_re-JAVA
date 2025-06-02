package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean = new Korean();
        System.out.println(korean.nation);// 대한민국
        System.out.println(korean.name);// 홍길동
        System.out.println(korean.ssn);// 901022-2754312
        // 얘는 korean 의 위 korea를 호출함 매개변수가 없으니까

        Korean korean2 = new Korean("홍길동", "901022-2754312");
        // 얘는 korean 의 아래  korea를 호출함 왜? 매개변수 있으니까
        System.out.println(korean2.nation);// 대한민국
        System.out.println(korean2.name);// 홍길동
        System.out.println(korean2.ssn);// 901022-2754312

    }
}
