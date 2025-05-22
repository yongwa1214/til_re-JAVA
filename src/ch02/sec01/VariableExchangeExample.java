package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x = %d, y = %d\n", x, y);

        // 스와핑으로 처리
        // x = 5, y =3출력
        int y2= y;
        y = x;

        x = y2;
        System.out.printf("x = %d, y = %d\n", x, y);

    }
}
