package ch06.sec09;

public class StaticCar {
    public static String model;
    public static int speed;
    // static이 없으면 위의 내용이 객체 만들때마다 각각 생긴다
    // static이 안 붙으면 인스턴스 멤버필드라고 부른다

    public StaticCar(String m){
        model = m;
    }
    // static은 무조건 공간 하나다. 뭘 하든 어쨌든 한곳을 가리킴
    // static이 안 붙은 메소드를 인스턴스 메소드라고 한다.
    // 인스턴스 => 객체화가 필요함
    // static이 붙음 > 클래스 멤버필드, 클래스 메소드 (객체화 필요 없음)
    // static은 객체화랑 전혀 관련 없음
    public static void setSpeed(int s){
        speed = s;
    }
    public static void run(){
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n",model, speed);
    }
}

