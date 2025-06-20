package control;

public class MartenWoofer implements Woofer{

    // 추상 메소드는 무조건 구현해야함(오버라이딩 해야한다.)
    // 내용이 없을 때 오버라이딩을 한다 이건
    // 따지자면 implements 한다라고 표현함 (최초 구현)

    @Override
    public void baseSound() {
        System.out.println("Marten Woofer: 웅~ 웅~ 웅~");

    }



}
