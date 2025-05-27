package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = score > 90 ? 'A'
                                : score > 80 ? 'B'
                                             : 'C';
        // 위와 동일한 구조
        char grade2;
        if(score > 90) {
            grade2 = 'A';
        }else{
            if(score > 80){
                grade2 = 'B';
            } else {
                grade2 = 'C';
            }
        }
        System.out.println("gread: " + grade);
        System.out.println("gread2: " + grade2);
    }
}
