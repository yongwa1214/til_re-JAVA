package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value =12300;
        System.out.printf("상품의 가격:%,d원\n", value); // 콘솔에 데이터 찍는 게 목적
        // printf는 실무때 안쓰긴 하는데 String.format과 작동 방식이 똑같음
        String result = String.format("상품의 가격:%,d원\n", value); // 문자열 만드는 게 목적
        System.out.println(result);

        System.out.printf("상품의 가격:%9d원\n", value);
        System.out.printf("상품의 가격:%-9d원\n", value);// 왼쪽정렬
        System.out.printf("상품의 가격:%09d원\n", value);// 빈칸에 0을 넣어줌 //%0[자릿수]d
        // 0과 - 는 동시에 쓸 수 없음

        int year = 2025;
        int mon = 9;
        int day = 4;
        // 2025-09-04
        System.out.printf("%d-%02d-%02d\n", year, mon, day);

        int radius = 10;
        double area = 3.14159 * radius * 10; // 반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f 입니다 \n", radius, area);//[자릿수].[.뒤 n번째 자리까지만(반올림됨]f
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f 입니다 \n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이: %-10.2f 입니다\n", radius, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

    }
}
