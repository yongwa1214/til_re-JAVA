package ch08.sec11.exam02;

public class MiniCar extends Car implements Vehicle{

    /*
    stop 메소드는 Car 로부터 구현부가 있는 메소드를
    상속 받았기 때문에 implements할 필요는 없다.
    class > interface 이런 느낌인듯
    */
    @Override
    public void run() {

    }
}
