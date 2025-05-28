package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        for (int i = 1; i < 11; i++) {
            if (i == 1){
                System.out.print(i);
            }else{
                System.out.print(", "+ i);
            }
        }

        // 왜 이 생각을 못했지?
        System.out.println();
        System.out.print(1);
        for(int i=2; i<11; i++){
            System.out.print(", "+i);
        }
    }
}