package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    // 오버로딩(Overloading) 똑같은 이름의 메소드를 여러개 만들 수 있다.
    // 조건: 파라미터(매개변수)가 완전히 달라야한다 타입의 순서와 갯수가 달라야한다.
    // 타입 순서는 똑같은데 갯수가 차이가 나면 다르다고 봄
    public Car(){

    }


    public Car(String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
