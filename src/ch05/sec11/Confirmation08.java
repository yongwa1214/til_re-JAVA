package ch05.sec11;

public class Confirmation08 {
    public static void main(String[] args) {


        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int length =0;
        for(int i = 0; i< array.length; i++){
            length += array[i].length;
            for(int k = 0; k<array[i].length; k++){
                sum += array[i][k];
            }
        }

        double avg = (double)sum/ length;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
