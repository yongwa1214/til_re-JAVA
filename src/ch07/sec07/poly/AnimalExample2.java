package ch07.sec07.poly;

public class AnimalExample2 {
    public static void main(String[] args) {
        // 주소값 instanceof 타입 // 형변환 가능하냐고 물어보는거임
        // 타입이 주소값을 저장할 수 있나?
        // 됨 > true, 안됨 > false 결과가 된다.

        Tiger tiger = new Tiger();
        System.out.println(tiger instanceof Cat); // true

        Cat cat = tiger;

        System.out.println(cat instanceof Tiger); // ture

        Tiger tiger2 = (Tiger)cat;

        System.out.println(tiger2 instanceof Animal); //true


    }
}
