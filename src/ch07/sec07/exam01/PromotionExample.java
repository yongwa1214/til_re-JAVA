package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // 부모타입은 자식 객체 주소값 담을 수 있다. > 다형성(상속관계일 때만 가능)
                  // 자식 타입은 부모 객체 주소값 담을 수 없음

        A a2 = e; // 자동형변환

        // E e2 = a2 // 이건 안됨
        E e2 = (E)a2; // 하고싶으면 강제 형변환

        // D d3 = (D) b // 이건 완전 안된다 // 자식 타입은 부모 객체 주소값 담을 수 없음
    }
}
class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

