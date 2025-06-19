package ch08.sec11.exam02;



/*

    인터페이스는 인스턴스 멤버필드를 가질 수 없다.
    static final 멤버필드는 가질 수 있다.

    무조건 추상메소드만 가질 수 있다.

    public abstract는 생략 가능 (자동으로 붙음)

    상속할 때는 extends 가 아닌 implements로
    그러나 interface가 interface를 상속받을 때는 extends를 사용한다.
    인터페이스는 다중상속 가능
    인터페이스는 인터페이스만 상속받을 수 있다. 인터페이스 extends 클래스는 안됨
*/

// 운송수단
public interface Vehicle {


    void run();

    void stop();

}
