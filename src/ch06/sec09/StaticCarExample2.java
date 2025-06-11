package ch06.sec09;

public class StaticCarExample2 {
    public static void main(String[] args) {
        StaticCar car1 = new StaticCar("벤츠");
        car1.setSpeed(100);
        car1.run();

        Math.random(); // 이거 static 메소드

        StaticCar car2 = new StaticCar("포르쉐");
        car2.setSpeed(200);
        car2.run();

        car1.run();
        StaticCar.run();

    }
}
