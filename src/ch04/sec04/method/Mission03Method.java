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

    public static void printSingleLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printMultiLine(int num){
        for(int i =0; i< num; i++){
            printSingleLine(num);
        }
    }
    public static void printTriangle(int num){
        for(int i = 0; i<num; i++){
            for(int k = 0; k<=i; k++ ){
                System.out.print("*");
            };
            System.out.println();

        }
    }
}