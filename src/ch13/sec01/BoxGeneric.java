package ch13.sec01;


// 제네릭은 타입이 컴파일 때 결정된다.
// T : 아직 타입이 결정되지 않음 객체화 할때 정할 수 있다.(단 클래스만 들어갈 수 있다)
public class BoxGeneric<T> {
    private T obj;


    public void setObj(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
}
