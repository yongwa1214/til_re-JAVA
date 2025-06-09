package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 70, 60, 90};

        double avg = getAverage(scores);
        System.out.println("평균: " + avg);
    }
    public static double getAverage(int[] arr) {
        int sum = Mission5Method.addAllUpArray(arr);
        double avg = (double)sum / arr.length;
        return avg;
    }
}
