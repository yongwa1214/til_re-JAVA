package ch07.sec07.poly2;

//캡슐화
// 본인이 가지고 있는 소유금액을 저장할 수 있다. (money)
// 소유금액은 만원단위이며 일천만원을 기본적으로 가지고 있다.
// 제품 구매시 보너스 점수를 저장할 수 있다. (bonusPoint)
// com, tv를 구매할 수 있다. buy 메소드
// 구매시 제품 가격만큼 소유금액은 차감된다.
// 구매시 구매한 제품 이름이 출력된다.
// eg. "TV을/를 구입하였습니다.
// eg. "Computer을/를 구입하였습니다.
// 구매시 소유금액이 부족하면 "잔액이 부족합니다."
// 내용이 출력되면서 구매하지 않는다.
public class Buyer {
    private int money = 1000;
    private int bonusPoint = 0;


    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }


    public void buy(Product p1){
        if (p1.getPrice()>money){
            System.out.println("잔액이 부족합니다.");
            return;
        } else {
            money -= p1.getPrice();
            bonusPoint += p1.getBonusPoint();
            System.out.println(p1 + "을/를 구입하였습니다.");
            System.out.printf("%d 포인트 적립!\n \n", bonusPoint);
        }
    }




}

