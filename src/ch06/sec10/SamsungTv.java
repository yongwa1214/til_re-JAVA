package ch06.sec10;

public class SamsungTv {
    public static String brand;
    public String model;
    public int inch;

    public void printValues(){
        System.out.printf("%s, %s, %d\n",brand, model, inch);
    }

    // static 붙어서 메모리에 올라가야 하는데 model 이랑 inch는 호출되지 않아 메모리에 올라갈 수 없음
    // 발목잡히는거랑 마찬가지죠  이러니까 static은 static 끼리만 쓰지
    public static void staticMethod() {
        //System.out.printf("%s, %s, %d\n", brand, model, inch);
    }

    // static 메소드는 static 멤버필드, 파라미터만 사용하는 경우에만
    public static void staticMethod(int n1, int n2) {
        System.out.printf("%s, %d, %d\n", brand, n1, n2);
    }
}
