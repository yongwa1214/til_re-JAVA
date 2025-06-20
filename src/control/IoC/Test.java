package control.IoC;

import control.Tv;

public class Test {
    public static void main(String[] args) {

        //객체 생성 안하고 객체 만드는 법
        // static을 쓰면 된다
        TvFactory tvFactory = TvFactory.getInstance();

        // TvFactory tvFactory1 = new TvFactory();

        Tv tv = tvFactory.factory(args[0], args[1]);
        tv.sound();
    }
}
