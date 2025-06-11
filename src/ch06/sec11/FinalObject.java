package ch06.sec11;

public class FinalObject {
    // 상수를 멤버 필드로 사용하면 반드시 초기화를 해야한다.
    // 근데 이렇게 쓸거면 차라리 static 쓰는게 나음
    // 절대 바뀌면 안되는 거 final 주면 됨
    // 멤버필드 앞, 메소드 앞, 클래스 앞, 지역변수 앞에 붙일 수 있다. (붙일 때 접근제한자 뒤에 붙이세요)
    private final String NAME = "홍길동";

    // 그러나! 생성자로 값을 넎는다는 내용이 있을 경우 선언만 가능하다.
    private final int AGE;

    public FinalObject(final int age){
        this.AGE = age;
    }

    public void myAge(){
        System.out.println("age: " + this.AGE);
    }
}
