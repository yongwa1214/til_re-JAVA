package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")){ // 이건 별로 "".equals(hobby) 이게 낫다 왜?! 이건 오류안남
            // 만약 hobby=null 이면 오류가 뜸 그러나 "" 이 null 일수는 없죠? 오류 절대 안남
            System.out.println("hobby 변수는 빈 문자열 객체를 참조");
        }
    }
}
