package ch04.sec04.method;

public class Mission02MethodResult {
    public static void main(String[] args) {
        printNumberFromTo(2, 6); // [2,3,4,5,6]
        printNumberFromTo(12, 16); // [2,3,4,5,6]

    }


    public static void printNumberFromTo(int from, int to) {
        System.out.printf("[%d", from);
        for(int i = from + 1; i<=to; i++){
            System.out.printf(", %d", i);
        }
        System.out.println("]");
    }
}
