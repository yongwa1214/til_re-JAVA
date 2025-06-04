package ch06.sec08;

public class Calculator {
    // void 메소드: 이건 값을 안 (돌려)준다 return 안됨
    public void powerOn(){
        System.out.println("전원을 켭니다");
    }
    public void powerOff(){
        System.out.println("전원을 끕니다");
    }

    // 리턴 메소드
    public int plus(int n1, int n2){
        int result = n1 + n2;
         return result; // 호출한 곳으로 돌아간다(return) result 데리고 감
                        // 타입이 맞아야함 여기서 int 로 선언(public int plus~~)

    }
}
