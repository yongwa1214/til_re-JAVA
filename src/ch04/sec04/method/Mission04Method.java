package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        //gugudan(4);
        System.out.println("=====================");

        gugudan(2,4);
    }
    public static void gugudan(int num){
        for(int i = 1; i < 10; i++ ){
            System.out.printf("%d x %d = %d\n", num, i, num*i);

        }
    }

    // ↑ a x b = a*b // b가 바뀜, 매개변수로 a를 받음
    // ↓ a x b = a*b // a가 바뀜, b는 호출
    public static void gugudan(int from, int to){
        for(int i = from; i<= to; i++){
            System.out.printf("=========%d단=========\n", i);
            gugudan(i);
        }
    }
}
