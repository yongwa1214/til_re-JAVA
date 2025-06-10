package ch06.sec06.exam02;

public class Car {
    //명시적 초기화
    // 명시적 초기화랑 생성자 초기화랑 둘다 되어있으면 생성자로 초기화됨
    // 명시적 초기화 다음으로 생성자 초기화가 일어난다 뒤에 실행된걸 적용함
    // 보통 지저분하다고 잘 안 쓰고 생성자에서 초기화 한다
    String company = "현대자동차";
    String model = "그랜저";
    int maxSpeed = 350;
    int speed;
}
