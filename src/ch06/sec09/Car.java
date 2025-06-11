package ch06.sec09;

public class Car {
    String model;
    int speed;
    // static이 없으면 위의 내용이 객체 만들때마다 각각 생긴다
    // static이 안 붙으면 인스턴스 멤버필드라고 부른다

    public Car(String model){
        this.model = model;
    }

    // static이 안 붙은 메소드를 인스턴스 메소드라고 한다.
    //인스턴스 => 객체화가 필요함
    // static이 붙음 > 클래스 멤버필드, 클래스 메소드 (객체화 필요 없음)
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void run(){
        this.setSpeed(100);
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n",this.model, this.speed);
    }
}


