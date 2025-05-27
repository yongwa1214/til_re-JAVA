package ch03;

public class Confirmation04 {
    public static void main(String[] args) {


        int value = 756;
        System.out.println("1: " + value / 100 * 100);
        System.out.println("2: " + (value - value % 100));


        double x = 5.0;
        double y = 0.0;
        double z = x % y;
        if(Double.isNaN(z)){
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println(result);
        }
    }

}
