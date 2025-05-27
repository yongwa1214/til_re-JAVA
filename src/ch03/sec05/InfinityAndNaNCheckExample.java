package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x =5;
        double y = 0.0;
        double z = x / y;
        System.out.println("z: " + z);
        //System.out.println("z: "+ (5/0)); // 어쩌구 저쩌구 오류가 뜬다 근데 0.0으로 하면 오류 안 뜨고 그냥 인피니티 뜬다
        System.out.println(z + 2);
        if(Double.isInfinite(z) || Double.isNaN(z)){ // Double.isInfinite(z) 는 boolean 값을 준다 if문 안에는 boolean 타입만
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);   //
        }


    }
}
