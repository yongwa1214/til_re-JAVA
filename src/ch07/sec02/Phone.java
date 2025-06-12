package ch07.sec02;

public class Phone {
    // 절대 final이 아닌데 public을 주지 않는다.
    private String model;
    private String color;


    // 기본 생성자가 없으면 상속 못함
    //public Phone(){}

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone생성자 호출");
    }


    //model getter
    public String getModel(){
        return model;
    }

    //color getter
    public String getColor(){
        return color;
    }


    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendSms(String message){
        System.out.println("본인: " + message);
    }

    public void receiveSms(String message){
        System.out.println("상대방: " + message);
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
