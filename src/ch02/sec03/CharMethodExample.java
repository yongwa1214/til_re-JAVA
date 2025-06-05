package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {

        printCharToInt('c'); // 메소드 호출

        int val = getCharToInt('c');
        System.out.println("val: " + val);
    }

    public static void printCharToInt(char ch){
        System.out.printf("%c: %d\n", ch,(int)ch);
    }
    // 모든 메소드는 return 키워드를 만나야 돌아갈 수 있다.
    // void는 return 생략 가능
    public static int getCharToInt(char ch){
        return (int)ch;
    }
}
