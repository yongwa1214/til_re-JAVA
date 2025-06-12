package ch07.sec02;

public class SmartPhone extends Phone{
    private boolean wifi;

    /*
    상속
     스마트폰(자식)만 객체화 되는게 아닌 부모인 폰도 같이 객체화 된다
     부모인 폰도 객체화가 되니까 부모의 기본생성자를 호출한다는 뜻이되고
     즉 상속은 부모의 기본생성자가 없으면 안된다
     만약 내가 부모에 사용자 정의 생성자를 만들었는데 기본 생성자가 없으면
     다음과 같은 방법이 있다.

     1. 부모 클래스에 기본 생성자를 만들기
     2. super()를 사용하여 부모의 사용자 정의 생성자에 값을 넣어주기
    */

    public SmartPhone(String model, String color){
        // super();  << 이건 생략가능함 이게 부모(폰)의 생성자 호출
        // super는 무조건 위에 있어야함 다른 코드보다 아래 있으면 오류
        super(model,color);
        System.out.println("SmartPhone 생성자 호출!");


        // this랑 super 사용법은 똑같은데 this는 나를 가리키고 super는 바로 위 부모를 가리킴
        // this.model >> 일단 나를 뒤져 없네? >> 부모로 올라감
        // 이건 내가 model을 가지고 있으면 문제가 됨
        // 절대 아래와 같이는 안함
        //this.model = model;
        //this.color = color;

    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }

    // 오버라이딩
    // 부모 선언부와 완전 똑같아야한다
    public void bell(){
        System.out.println("스마트폰이 울린다.");
    }
}
