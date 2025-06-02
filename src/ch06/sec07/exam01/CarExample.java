package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("소나타", true, 70);
        // new 옆에() 이렇게 해서 생성자 호출을 해야함  `기본 생성자`라고 한다
        // 기본 생성자는 생성자를 추가하지 않았을 때 작동함
        // 그러니까 만약 new Car에 생성자를 추가하면 컴파일 에러가 뜰거임
        // 그때는 그냥 값을 넣으면 됨
        // 모델 타입:String 스타트 타입:boolean 스피드 타입: int

        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);

        Car car2 = new Car();
        // 기본 쓰고 싶은데요?
        // 그럼 생성자 하나 더 만들면됨 기본 생성자로
        // 생성자 개수 제한 없음

    }
}
