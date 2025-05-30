package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season ={"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0]: " + season[0]);
        System.out.println(Arrays.toString(season));

        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int[] scores = {83, 90, 87};

        int sum = 0;
//        for(int i = 0; i < scores.length; i++){
//            sum += scores[i];
//
//        }
        /*
        향상된 for문
        읽기 작업할 때 좋다
        :을 기준으로 오른쪽: 컬렉션 (우린 배열밖에 안배웠으니 배열 주소값 가져와)
        :을 기준으로 왼쪽(item 이라고하면) 그러니까 item = scores[n](복사해온거다 주소값 다름 ) 이랑 같은거임
        */
        for(int item:scores){
            sum += item;
        }
        System.out.println("총합: " + sum);
        double avg = (double)sum / scores.length;
        System.out.printf("평균: %.2f",avg); // %.(나타내고 싶은 길이)f

    }
}
