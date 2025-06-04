package ch06.sec08;

public class CalculatorExample {
    // 여기서(클래스 직속) 변수 선언된거면 그게 멤버 필드(전역)임

    public static void main(String[] args) {
        //static 있으면 객체화 필요 없음. 필요에 의해 사용됨
        //static 없으면 객체화 필요함
        Calculator calc = new Calculator(); // new Calculator() < 기본 생성자 | 기본생성자 호출한거다
                                            // new 다음에는 무조건 생성자 호출
                                            // new는 객체 만드는 역할
        int result = calc.plus(1,2); // 호출하는 것만 봐도 선언부를 맞출 수 있음
        System.out.println("result: " + result);
        System.out.println("result2: " + calc.plus(10,20));
        System.out.println("End");

        calc.powerOn();
        calc.powerOff();

    }
}
