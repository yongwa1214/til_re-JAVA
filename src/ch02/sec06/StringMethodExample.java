package ch02.sec06;

public class StringMethodExample {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = new String("안녕");
        printCompareString(str1, str2);

        // 두 문자열은 동일하다. (주소값이 같다)
        // 두 문자열은 동등하다  (안에 들어있는 값이 같다)
        // 두 문자열은 동등하지 않다.
    }
    public static void printCompareString(String a, String b){
        if(a == b){
            System.out.println("두 문자는 동일하다");
        }else if (a.equals(b)){
            System.out.println("두 문자열은 동등하다");
        }
            System.out.println("두 문자열은 동등하지 않다.");


    }
}
