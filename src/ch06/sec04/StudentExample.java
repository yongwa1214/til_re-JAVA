package ch06.sec04;

public class StudentExample {
    public static void main (String[] args){
        Student s1 = new Student(); // 파라미터(매개변수) 없으면 기본생성자임
        Student s2 = new Student();

        s1.introduce();
        s2.introduce();

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();


    }
}
