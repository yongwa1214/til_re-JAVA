package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        driver.drive(bus); // 버스가 달린다
        driver.drive(taxi); // 택시가 달린다


        // 익명 객체 (이름없는 클래스라고 생각하면 됨)
        // Vehicle 인터페이스를 implements한 객체의
        // 주소값이 vehicle 변수에 들어간다.
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("버스가 달린다.");
            }

            @Override
            public void stop() {
                System.out.println("버스가 멈춘다.");
            }

            public void openBackDoor(){
                System.out.println("버스 뒷문이 열립니다.");
            }
        };
        // 위나 아래나 똑같음 단지 클래스를 안 만들어도 되고 바로 처리 됨
        // 단 일회용
        // 철로만든 틀이랑 플라스틱으로 만든 틀이라고 생각하면 됨
        // 아래는 몇번이고 재활용가능하지만 위는 재활용 불가 저렇게 하고 싶을 때마다
        // 또 똑같이 써줘야함
        Vehicle vehicle2 = new Bus();
    }
}
