package ch06.sec04;

public class Student {
    String name; // 멤버필드: 값을 저장함
    /*
    생성자와 메소드 구분
    1. 생성자 이름은 클래스명과 동일하다
    2. 생성자는 리턴타입이 없다


    --- 메소드 구성요소
    메소드명, 매개변수(파라미터), 리턴타입 >> 선언부
    {여기는 구현부라고 한다 }
    */
    public Student() {
        System.out.println("기본 생성자 호출!");
    }

//  리턴타입  매소드명 (매개변수)
    void introduce(){
        System.out.printf("안녕 내 이름은 %s(이)라고 해\n", this.name);
    }
}
