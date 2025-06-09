package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(1, 10);
        System.out.println("star: " + star);

        // 5였다면 ***** (개행)
        //printSingleLine(star);

        //printMultiLine(star);
        printTriangle(star);
    }

    public static void printSingleLine(int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printMultiLine(int cnt){
        for(int i =0; i< cnt; i++){
            printSingleLine(cnt);
        }
    }
    public static void printTriangle(int num){
        for(int i = 1; i<=num; i++){
            printSingleLine(i);
            };
            System.out.println();


    }
}
