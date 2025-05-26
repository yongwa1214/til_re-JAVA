package ch02.sec08;

public class Mission01 {
    public static void main(String[] args) {
        int num1 =10;
        int num2 = 3;

        double result = (double)num1/num2; // int 나누기 int 는 결과값이 int로 나옴(왜? 실수를 저장 할 수 없어서)

        System.out.printf("result: %.4f", result);
    }
}
