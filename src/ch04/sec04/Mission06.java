package ch04.sec04;

public class Mission06 {
    /*
        1부터 몇까지 더하면 누적합계가 100을 넘지 않는
        제일 큰 수가 무엇인지 알아내는 예제.

        1. 더하기 만들기
        2. 누적합계가 100 넘었을 때 멈춰 (if)
        3. 마지막 수를 나타내

    */
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        int i = 1;
        int last = 0;

        while(sum <= num){
            ++i;
            sum += i;

        }
        i -=1;
        System.out.println("last: " + i);
    }
}
