package ch07.sec07.poly;

public abstract class Animal {
    // 추상 메소드 (보통 어떠한 개념의 경우 추상 메소드로 만듦 실체x)
    // 예) 동물 - 개, 닭, 고양이 ...etc 동물의 경우 동물이라는 실체가 없음 > 개념
    // 예) 채소 - 당근, 오이, 양배추 ...etc 야채의 경우 야채라는 실체가 없음 > 개념
    // 추상 메소드를 단 하나라도 가지고 있다면 그 클래스는
    // 추상 클래스가 되어야한다.
    // 추상메소드는 구현부 없음(내용없음)
    // abstract class는 객체화 불가능 | 상속목적
    private int age;



    // static과 동시사용 불가 static은 내용이 있어야함 abstract는 내용이 없어야함
    public abstract void crying();


}
