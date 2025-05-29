package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍 나이스";
        int idx = subject.indexOf("프로그래밍");
        // 다음 단어가 시작된(위치한) index값을 가져옵니다
        // 자: 0
        // 바: 1
        // (space)  : 2
        // 프: 3

        // 파일 확장자 뽑아낼 때 쓴다고 함
        System.out.println("idx: " + idx);
        System.out.println(subject.lastIndexOf("그")); // 이건 뒤에서부터 찾음

        // 해당문자열에 내가 찾는 문자열이 있는가?
        boolean result = subject.contains("자바");
        // 무조건 똑같이 들어가야함 공백도 포함한다
        boolean result2 = subject.contains("자바") && subject.contains("나이스");
        System.out.println("result: " + result);
        System.out.println("result: " + result2);

    }
}
