package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 40인 정사각형의 넓이를 구하시오
        // static이 없으면 꼭 객체화를 해야한다고요.

        Calculator calc = new Calculator();

        double result = calc.areaRectangle(40);
        System.out.println("정사각형 넓이: " + result);

        double result2 = calc.areaRectangle(20, 40);
        System.out.println("직사각형 넓이: " + result2);
    }
}
