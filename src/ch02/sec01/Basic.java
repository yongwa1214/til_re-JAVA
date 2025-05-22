package ch02.sec01;

public class Basic {
    /*
    컴퓨터 메모리 = RAM (Random Access Memory): 휘발성, 데이터를 저장,읽기, 삭제하는 공간
    변수 = 하나의 값을 저장할 수 잇는 메모리 번지에 붙여진 이름
    하나의 변수는 다양한 타입의 값을 저장할 수 없다
    즉, 정수형 변수에는 정수값만 저장 가능! 정수형 변수로 선언 후 다른 형의 변수로 변경 불가능
        실수형 변수에는 실수값만 저장 가능!

    변수를 사용하려면 변수 선언해야 한다.
    변수 선언할 때 저장할 값의 타입과 이름(변수명)을 정한다.
    같은 스코프(블록) 안에서는 이름의 변수 선언은 최초 한번만 한다.
    int num;
    float num2; (float는 실수)

    로컬(지역) 변수: 메소드 안에서 선언된 변수

    변수명 규직
    - 문자로 시작해야 함. (숫자 불가)
    - 특수기호 중 _와  $는 변수명으로 사용가능(문자로 보기 때문에 시작문자로 사용가능)
    - 예약어는 사용 불가능
    - 대소문자를 가린다
    - Camel Case로 작성

    변수명 센스
    - 의미가 있는 이름을 사용하는 게 좋다. 최악: a,b,c
    - 너무 길지 않도록 desc: description, name:nm, class: cls ···등
    */
    public static void main(String[] args) {
        int a;
        //int a;
        {int b;}
        {int b;}

        int _a;
        //int int; 예약어라서 x
        int abc, aBc, abC; //대소문자 가림

        int score; // 변수 선언
        score = 90; // 값 대입

    }
}
