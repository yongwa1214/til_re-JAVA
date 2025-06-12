package ch06.sec15;

public class Singleton {
    private String name;

    // 외부에서 객체 생성 불가
    private Singleton(){}

    // 아래는 멤버필드인데 static임
    // Singleton 객체의 주소값을 singleton에 저장
    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printMyName(){
        System.out.println("내 이름은 "+ name + "입니다!");
    }
}
