package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        // 만약 정규식을 쓸거면 replaceAll을 사용해야함
        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
