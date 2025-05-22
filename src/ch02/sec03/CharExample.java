package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';

        System.out.printf("ch1: %c, %d\n", ch1, (int)ch1);
        System.out.printf("66: %c, %d\n", 66, 66);

        char ch2 = 64;
        System.out.printf("ch1: %c, %d\n", ch2, (int)ch2);

        char ch3 = '가';
        System.out.printf("ch3: %c, %d\n", ch3, (int)ch3);
        System.out.printf("힣: %c, %d\n", '힣', (int)'힣');

        String str2 = "";
        char ch4 = ' ';
        System.out.printf("ch4: %d\n", (int)ch4);
    }
}
