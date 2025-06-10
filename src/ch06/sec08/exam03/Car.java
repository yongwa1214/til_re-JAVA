package ch06.sec08.exam03;
/*
    접근제어자 (Access Modifier)
    private - 같은 클래스 안에서만 접근 가능
    default - private + 같은 패키지는 접근 가능 (잘 안 씀)
    protected - default + 상속 관계는 접근 가능
    public - 완전 접근 가능

    private 멤버 필드에 값 대입(쓰기) 방법 2가지
    1. 생성자
    2. (setter) 메소드

    private 멤버 필들에 값 읽기 방법 1가지
    - (getter) 메소드

    멤버필드는 private을 쓰자
    왜? private 쓰면 메소드를 통해 제어가 가능해진다
    예) gas에 3000이상은 넣을 수 없다. << 이게 가능해짐
*/

public class Car {
    private int gas; // private 멤버필드
    private int oil;

    public Car() {
    }

    public Car(int gas, int oil) {
        this.gas = gas;
        this.oil = oil;
    }

    //---------------------------------------------------------
    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }



}

